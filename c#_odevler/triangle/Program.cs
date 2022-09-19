using System;
using System.Collections;

namespace CSharp_works
{

    class Program
    {
        static int border;
        static bool check = false;
        static bool repeat = true;
        public static void Main(string[] args)
        {
            int result = 0;
            while (repeat)
            {
                while (check == false)
                {
                    Console.WriteLine("Lütfen kenar uzunluğunu giriniz:");
                    check = CheckInputIsInt(Console.ReadLine()!, out result);
                }

                border = result;

                DrawBorder();

                Console.WriteLine("Tekrar denemek ister misin? (Y/N)");
                check = !(repeat = Console.ReadLine().ToUpper() == "Y");
            }
        }

        static void DrawBorder()
        {
            int xLocationOftop = border + 5;

            for (int i = 0; i < border; i++)
            {
                Console.Write(new string(' ', xLocationOftop - i - 1));
                Console.Write('/');

                if (i == border - 1)
                {
                    Console.Write(new string('_', border * 2 - 2));
                    Console.WriteLine('\\');
                    Console.WriteLine();
                }
                else
                {
                    if (i > 0)
                        Console.Write(new string(' ', (i * 2)));
                    Console.WriteLine('\\');
                }
            }
        }

        static bool CheckInputIsInt(string input, out int result)
        {
            var state = int.TryParse(input, out result);
            if (state == false || result <= 0)
                Console.WriteLine("Lütfen 0'dan büyük bir doğal sayı giriniz.");
            return state;
        }
    }
}