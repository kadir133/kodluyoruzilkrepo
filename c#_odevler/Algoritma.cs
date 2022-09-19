using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CSharp_works
{
    public static class Algoritma
    {
        public static void GetChangedText()
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
    }
}
