using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace GameOfNumbers
{
    class Program
    {
        static void Main(string[] args)
        {
            int a = int.Parse(Console.ReadLine());
            int b = int.Parse(Console.ReadLine());
            int magic = int.Parse(Console.ReadLine());
            int h = 0;

            for (int i = a; i <= b; i++)
            {
                int first = i;
                for (int j = a; j <= b; j++)
                {
                    int second = j;

                    if (first + second == magic)
                    {
                        Console.WriteLine("Number found! {0} + {1} = {2}", second, first, magic);
                        h = 0;
                        goto broke;
                    }
                    h++;
                }
            }
            broke:

            if (h != 0)
            {
                Console.WriteLine("{0} combinations - neither equals {1}", h, magic);
            }
        }
    }
}
