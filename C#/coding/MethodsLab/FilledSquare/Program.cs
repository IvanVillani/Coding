using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace FilledSquare
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            PrintDashes(n);
            PrintMiddle(n);
            PrintDashes(n);

        }

        static void PrintDashes(int n)
        {
            Console.WriteLine(new string('-', n * 2));
        }

        static void PrintMiddle(int n)
        {
            for (int i = 1; i <= n-2; i++)
            {
                Console.Write('-');
                for (int j = 1; j < n; j++)
                {
                    Console.Write("\\/");
                }
                Console.WriteLine('-');
            }
        }
    }
}
