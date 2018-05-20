using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace X
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            int middleIntervals = n - 2;
            for (int i = 0; i < n/2; i++)
            {
                Console.WriteLine(new string (' ', i) + "x" + new string (' ', middleIntervals) + "x" + new string (' ', i));
                if (i != n/2 - 1)
                {
                    middleIntervals -= 2;
                }

            }
            Console.WriteLine(new string(' ', n/2) + "x" + new string (' ', n/2));
            for (int i = n/2 -1; i >= 0; i--)
            {
                Console.WriteLine(new string(' ', i) + "x" + new string(' ', middleIntervals) + "x" + new string(' ', i));
                if (i != 0)
                {
                    middleIntervals += 2;
                }

            }
        }
    }
}
