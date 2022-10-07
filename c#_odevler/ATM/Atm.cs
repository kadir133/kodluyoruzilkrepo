using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CSharp_works.ATM
{
    internal static class Atm
    {
        readonly static UserController userController = new();
        public static void Run()
        {
            int balance = 1500;
            bool state = true;
            User client;
            //Para çekme, para yatırma, ödeme yapma, gün sonu
            Console.WriteLine("ATM'ye Hoşgeldiniz...");

            //kullanıcı girişi
            do
            {
                Console.WriteLine("Kullanıcı adınızı giriniz:");
                string userName = Console.ReadLine();
                client = userController.CheckUser(userName);
                if (client == null)
                {
                    Console.WriteLine("Kayıt olmak için şifre giriniz");
                    string newPassword = Console.ReadLine();
                    var result = userController.AddUser(userName, newPassword);
                    state = result.Item1;
                    if (state)
                    {
                        Console.WriteLine("Kayıt başarılı");
                        client = result.Item2;
                        client!.OpenLogFile();
                    }
                }
                else
                {
                    client.OpenLogFile();
                    if (client.Right == 0)
                    {
                        client.WriteTransaction("Kullanıcı adınız bloke edilmiştir. Artık giriş yapamazsınız.");
                        Console.WriteLine("Kullanıcı adınız bloke edilmiştir. Artık giriş yapamazsınız.");
                        client.Dispose();
                        return;
                    }

                    Console.WriteLine("Şifre giriniz:");
                    string password = Console.ReadLine();
                    state = userController.CheckPassword(userName, password);

                    if (state == false)
                    {
                        client!.WriteTransaction("Hatalı giriş denemesi...");
                        Console.WriteLine("Hatalı giriş denemesi...");
                        client.Dispose();
                    }
                }
            } while (state == false);

            state = true;
            do
            {
                Console.WriteLine();
                Console.WriteLine(new string('-', 120));
                Console.WriteLine();
                Console.WriteLine("Yapmak istediğiniz işlemi seçiniz.");
                Console.WriteLine("1 - Para çekme");
                Console.WriteLine("2 - Para yatırma");
                Console.WriteLine("3 - Ödeme yapma");
                Console.WriteLine("4 - Gün sonu");
                Console.WriteLine("5 - Bakiye sorgula");
                Console.WriteLine("6 - Çıkış Yap");

                Console.WriteLine();

                var select = Console.ReadLine();
                while (select != "1" && select != "2" && select != "3" && select != "4" && select != "5" && select != "6")
                {
                    Console.WriteLine("Hatalı seçim !!!\rTekrar seçim yapınız.");
                    select = Console.ReadLine();
                }

                switch (select)
                {
                    case "1":
                        client!.WriteTransaction("Seçilen işlem : 1 - Para çekme");

                        Console.Write("Para miktarı : ");
                        var amount = Convert.ToInt32(Console.ReadLine());
                        client!.WriteTransaction(amount + " TL Para çekme işlemi gerçekleştirildi.\tİşlem öncesi bakiye : " + balance + "\tİşlem sonrası bakiye : " + (balance -= amount));
                        Console.WriteLine("İşlem gerçekleşti.");
                        break;
                    case "2":
                        client!.WriteTransaction("Seçilen işlem : 2 - Para yatırma");

                        Console.Write("Para miktarı : ");
                        amount = Convert.ToInt32(Console.ReadLine());
                        client!.WriteTransaction(amount + " TL Para yatırma işlemi gerçekleştirildi.\tİşlem öncesi bakiye : " + balance + "\tİşlem sonrası bakiye : " + (balance += amount));

                        Console.WriteLine("İşlem gerçekleşti.");
                        break;
                    case "3":
                        client!.WriteTransaction("Seçilen işlem : 3 - Ödeme yapma");

                        Console.Write("Ödeme miktarı : ");
                        amount = Convert.ToInt32(Console.ReadLine());
                        client!.WriteTransaction(amount + " TL ödeme işlemi gerçekleştirildi.\tİşlem öncesi bakiye : " + balance + "\tİşlem sonrası bakiye : " + (balance -= amount));

                        Console.WriteLine("İşlem gerçekleşti.");
                        break;
                    case "4":
                        Console.WriteLine(client!.ReadLogs());
                        break;
                    case "5":
                        client!.WriteTransaction("Seçilen işlem : 5 - Bakiye sorgula");

                        Console.WriteLine("Bakiyeniz : " + balance + " TL");
                        break;
                    case "6":
                        client!.CloseLogFile();
                        Console.WriteLine("Tekrar görüşmek üzere.");
                        Environment.Exit(1);
                        state = false;
                        break;
                }

            } while (state);
        }


    }
}
