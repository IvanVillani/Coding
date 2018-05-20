using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Sock
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            int a = 3 * n - 3;
            int b = n + 3;
            int c = 2 * n + 2;
            int d = 2;
            int e = (c - 4) / 2;
            int h = 1;

            Console.WriteLine('|' + new string('-', c - 2) + '|');
            Console.WriteLine('|' + new string('*', c - 2) + '|');
            Console.WriteLine('|' + new string('-', c - 2) + '|');
            

            for (int i = 1; i <= (a - 3 + b)/2; i++)
            {
                Console.WriteLine('|' + new string('-', e) + new string('~', d) + new string('-', e) + '|');
                e--;
                d = d + 2;
                if (e == 1) { break; }

            }
            e++;
            d = d - 2;
            Console.Write('|');
            Console.WriteLine('-' + new string('~', c - 4) + '-' + '|');
            for (int i = 1; i <= (a - 3 + b) / 2; i++)
            {
                Console.WriteLine('|' + new string('-', e) + new string('~', d) + new string('-', e) + '|');
                e++;
                d = d - 2;
                if (d == 0) { break; }
            }
            Console.WriteLine('\\' + new string('.', c - 1) + '\\');
            for (int i = 1; i <= n + 1; i++)
            {
                Console.Write(new string ('-', h));
                if (i == n/2)
                {
                    Console.WriteLine('\\' + new string('.', (c - 5) / 2) + "MERRY" + new string('.', (c - 5) / 2) + '\\');

                }
                else if (i == n / 2 + 2)
                {
                    Console.WriteLine('\\' + new string('.', (c - 5) / 2) + "X-MAS" + new string('.', (c - 5) / 2) + '\\');

                }
                else
                {
                    Console.WriteLine('\\' + new string('.', c - 1) + '\\');

                }
                
                h++;

            }
            Console.Write(new string('-', h));
            Console.WriteLine('\\' + new string('_', c - 1) + ')');




        }
    }
}
