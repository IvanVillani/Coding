using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Odddd
{
    class Program
    {
        static void Main(string[] args)
        {
            int h = 2;
            int even = 0;
            for (int i = 1; i <= h; i++)
            {
                h++;
                int check = int.Parse(Console.ReadLine());
                if (check % 2 != 0)
                {
                    even = check;
                    break;
                }
                else
                {
                    Console.WriteLine("Please write an odd number.");
                }
            }
            if (even < 0)
            {
                even = even * -1;
            }
            Console.WriteLine("The number is: " + even);

        }
    }
}
