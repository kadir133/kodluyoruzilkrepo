using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CSharp_works
{
    internal class DrawCircle
    {
        static double diameter;
        public static void Draw()
        {
            while (Program.check == false)
            {
                Console.WriteLine("Lütfen yarı çap uzunluğunu giriniz:");
                Program.check = CheckUserInput.CheckInputIsDouble(Console.ReadLine()!, out diameter);
            }

            DrawBorder();
        }

        static void DrawBorder()
        {
            double thickness = 0.4;
            ConsoleColor BorderColor = ConsoleColor.Yellow;
            Console.ForegroundColor = BorderColor;
            char symbol = '*';

            Console.WriteLine();
            double rIn = diameter - thickness, rOut = diameter + thickness;

            for (double y = diameter; y >= -diameter; --y)
            {
                for (double x = -diameter; x < rOut; x += 0.5)
                {
                    double value = x * x + y * y;
                    if (value >= rIn * rIn && value <= rOut * rOut)
                    {
                        Console.Write(symbol);
                    }
                    else
                    {
                        Console.Write(" ");
                    }
                }
                Console.WriteLine();
            }
            Console.ReadKey();
        }
    }
}
