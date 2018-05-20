using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PrintTriangle2
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            PrintUp(n);
            PrintDown(n);

        }

        static void PrintLine(int count)
        {
            for (int i = 1; i <= count; i++)
            {
                Console.Write(i + " ");
            }
            Console.WriteLine();
        }

        static void PrintUp(int n)
        {

            for (int i = 1; i <= n; i++)
            {
                PrintLine(i);
            }
        }

        static void PrintDown(int n)
        {
            for (int i = n - 1; i >= 1; i--)
            {
                PrintLine(i);
            }
        }
    }
}
