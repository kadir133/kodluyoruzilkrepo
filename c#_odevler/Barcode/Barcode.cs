using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using IronBarCode;

namespace CSharp_works
{
    public static class Barcode
    {
        public static void Run()
        {
            Console.WriteLine("Yapmak istediğiniz işlemi seçiniz.");
            Console.WriteLine("1 - Barcode Yazma");
            Console.WriteLine("2 - Barcode Okuma");

            var select = Console.ReadLine();
            while (select != "1" && select != "2")
            {
                Console.WriteLine("Hatalı seçim !!!\rTekrar seçim yapınız.");
                select = Console.ReadLine();
            }
            if (select == "1")
                Write();
            else
                Read();

            Console.WriteLine();
        }


        public static void Write()
        {
            string text;
            do
            {
                Console.Write("Barcode üretilecek texti giriniz : ");
                text = Console.ReadLine();

                if (string.IsNullOrEmpty(text))
                    Console.WriteLine("İçerik boş olamaz.");
            } while (string.IsNullOrEmpty(text));

            var path = AppDomain.CurrentDomain.BaseDirectory + text + ".png";
            BarcodeWriter.CreateBarcode(text, BarcodeEncoding.Code128).SaveAsPng(path);
            Console.WriteLine(path);
        }

        public static void Read()
        {
            string path;
            do
            {
                Console.Write("Barcode resminin adresini giriniz : ");
                path = Console.ReadLine();

                if (File.Exists(path) == false)
                    Console.WriteLine("Barcode resmi bulunamadı.");
            } while (string.IsNullOrEmpty(path));

            BarcodeResult Result = BarcodeReader.QuicklyReadOneBarcode(path);
            if (Result != null)
            {
                Console.WriteLine("Read Value: " + Result.Text);
            }
        }
    }
}
