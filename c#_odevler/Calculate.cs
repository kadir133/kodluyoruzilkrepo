using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CSharp_works
{
    public static class Calculate
    {
        public static void CalcualteArea()
        {
            //İşlem yapılmak istenen geometrik şekli kullanıcıdan alınmalı (Daire, Üçgen, Kare, Dikdörtgen vb..)
            //Seçilen şekle göre, kenar bilgilerin kullanıcıdan alınmalı
            //Hesaplanmak istenen boyutu kullanıcıdan alınmalı(Çevre, Alan, Hacim vb..)
            //Hesap sonucunu anlaşılır şekilde geri döndürmeli.

            Console.WriteLine("1 - Kare");
            Console.WriteLine("2 - Dikdörtgen");
            Console.WriteLine("3 - Üçgen");
            Console.WriteLine("4 - Daire");
            Console.Write("Hangi tür geometrik şeklin alanını hesaplamak istiyorsunuz: ");
            var type = Console.ReadLine();
            if (type == "1")
            {
                Console.Write("Bir kenarın uzunluğunu giriniz: ");
                CheckUserInput.CheckInputIsInt(Console.ReadLine(), out int length);
                Console.WriteLine("Karenin alanı : " + length * length);
            }
            else if (type == "2")
            {
                Console.Write("Kısa kenarın uzunluğunu giriniz: ");
                CheckUserInput.CheckInputIsInt(Console.ReadLine(), out int length1);
                Console.Write("Uzun kenarın uzunluğunu giriniz: ");
                CheckUserInput.CheckInputIsInt(Console.ReadLine(), out int length2);
                Console.WriteLine("Dikdörtgenin alanı : " + length1 * length2);
            }
            else if (type == "3")
            {
                Console.Write("Yükseklik giriniz: ");
                CheckUserInput.CheckInputIsInt(Console.ReadLine(), out int height);
                Console.Write("Taban uzunluğunu giriniz: ");
                CheckUserInput.CheckInputIsInt(Console.ReadLine(), out int length);
                Console.WriteLine("Üçgenin alanı : " + (height * length) / 2);
            }
            else if (type == "4")
            {
                Console.Write("Yarıçap uzunluğunu giriniz: ");
                CheckUserInput.CheckInputIsInt(Console.ReadLine(), out int diameter);
                Console.WriteLine("Dairenin alanı : " + Math.PI * diameter * diameter);
            }
            else
            {
                Console.WriteLine("Yanlış tip girdiniz.");
                CalcualteArea();
            }
        }

    }
}
