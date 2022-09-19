namespace CSharp_works.VotingManager
{
    public class Voting
    {
        static int maceraCount = 0;
        static int aksiyonCount = 0;
        static int komediCount = 0;
        static int romantikCount = 0;
        static UserController userController = new UserController();
        public static void Vote()
        {
            var state = false;

            List<string> catagories = new List<string> { "macera", "aksiyon", "komedi", "romantik" };
            Console.WriteLine("Hoşgeldiniz kullanıcı adınızı giriniz:");
            string userName = Console.ReadLine();
            if (userController.CheckUser(userName) == false)
            {
                Console.WriteLine("kayıt olmak için şifre giriniz");
                string newPassword = Console.ReadLine();
                state = userController.AddUser(userName, newPassword);
                if (state) Console.WriteLine("kayıt başarılı");
            }
            else
            {
                Console.WriteLine("Şifre giriniz:");
                string password = Console.ReadLine();
                state = userController.CheckPassword(userName, password);
            }
            if (state)
            {
                Console.WriteLine("giriş onaylandı hoşgeldiniz");
                Console.WriteLine();
                Console.WriteLine("lütfen oylamaya katılın");
                for (int i = 0; i < catagories.Count; i++)
                {
                    Console.WriteLine(catagories[i] + " için " + i);
                }
                int b = Convert.ToInt32(Console.ReadLine());

                if (b == 1) maceraCount++;
                if (b == 2) aksiyonCount++;
                if (b == 3) komediCount++;
                if (b == 4) romantikCount++;
                Console.WriteLine("oyunuz için teşekkürler.");
            }

            Console.WriteLine();
            Console.WriteLine(new string('*', 50));
            Console.WriteLine("Güncel Oylama durumu:");
            Console.Write("1 - Macera");
            Console.Write(new string(' ', 3));
            Console.Write(":");
            Console.Write(new string(' ', 3));
            Console.Write(maceraCount);
            Console.WriteLine();
            Console.Write("2 - Aksiyon");
            Console.Write(new string(' ', 2));
            Console.Write(":");
            Console.Write(new string(' ', 3));
            Console.Write(aksiyonCount);
            Console.WriteLine();
            Console.Write("3 - Komedi");
            Console.Write(new string(' ', 3));
            Console.Write(":");
            Console.Write(new string(' ', 3));
            Console.Write(komediCount);
            Console.WriteLine();
            Console.Write("4 - Romantik");
            Console.Write(new string(' ', 1));
            Console.Write(":");
            Console.Write(new string(' ', 3));
            Console.WriteLine(romantikCount);
            Console.WriteLine(new string('*', 50));
        }
    }
}
