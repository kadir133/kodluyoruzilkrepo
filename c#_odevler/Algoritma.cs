using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CSharp_works
{
    public static class Algoritma
    {
        public static void RemoveChar()
        {
            Console.Write("Text Giriniz: ");
            var text = Console.ReadLine();

            Console.Write("Karakter Indexi Giriniz (0-" + (text.Length-1) + "): ");
            var state = false;
            int index = 0;
            while (!state)
            {
                state = CheckUserInput.CheckInputIsInt(Console.ReadLine(), out index);
                if (index > text.Length - 1)
                {
                    Console.Write("0-" + (text.Length - 1) + " aralığında değer giriniz: ");
                    state = false;
                }
            }

            Console.WriteLine(text.Remove(index, 1));
        }

        public static void ChangeChars1()
        {
            Console.Write("Text Giriniz: ");
            var text = Console.ReadLine();

            var splits = text.Split(" ");
            for (int i = 0; i < splits.Length; i++)
            {
                var write = splits[i].Length > 1 ? splits[i].Substring(1) + splits[i][0] : splits[i];
                Console.Write(write);
                Console.Write(" ");
            }

            Console.WriteLine();
        }


        public static void ChangeChars2()
        {
            Console.Write("Text Giriniz: ");
            var text = Console.ReadLine();

            var splits = text.Split(" ");
            for (int i = 0; i < splits.Length; i++)
            {
                var write = splits[i].Length > 1 ? splits[i][splits[i].Length - 1] + splits[i].Substring(1, splits[i].Length - 2) + splits[i][0] : splits[i];
                Console.Write(write);
                Console.Write(" ");
            }

            Console.WriteLine();
        }
        
        
        public static void NumberPairs()
        {
            Console.Write("Sayı ikililerini Giriniz: ");
            var text = Console.ReadLine();

            int num1, num2;
            var splits = text.Split(" ").Select((a, i) => new { number = Convert.ToInt32(a), pair = (i % 2 == 0 ? i : i - 1) }).GroupBy(a => a.pair).ToList();
            foreach (var item in splits)
            {
                num1 = item.First().number;
                num2 = item.Last().number;
                var write = num1 + num2;
                if (num1 == num2)
                    write *= write;
                Console.Write(write);
                Console.Write(" ");
            }

            Console.WriteLine();
        }

        public static void AbsoluteSquaring()
        {
            Console.Write("Sayıları Giriniz: ");
            var text = Console.ReadLine();

            int num1, num2;
            var splits = text.Split(" ").Select(a => Convert.ToInt32(a)).GroupBy(a => a < 67).ToList();
            foreach (var item in splits)
            {
                var write = item.Key ? item.Sum(a => 67 - a) : item.Sum(a => (int)Math.Pow(Math.Abs(a - 67), 2));

                Console.Write(write);
                Console.Write(" ");
            }

            Console.WriteLine();
        }
    }
}
