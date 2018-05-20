using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Cal
{
    class Program
    {
        static void Main(string[] args)
        {
            int h = int.Parse(Console.ReadLine());
            int a = 0;
            int b = 0;
            int c = 0;
            int d = 0;
            
            int first = 0;
            int second = 0;
            int third = 0;



            a = h % 10;
            b = h / 10;
            c = b % 10;
            d = b / 10;

            for (int i = 1; i <= a; i++)
            {
                first = i;
                for (int n = 1; n <= c; n++)
                {
                    second = n;
                    for (int f = 1; f <= d; f++)
                    {
                        third = f;
                        Console.WriteLine(first + " * " + second + " * " + third + " = " + first * second * third + ";");
                        
                    }
                }
            }
        }
    }
}