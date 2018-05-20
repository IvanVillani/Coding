using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Odd
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            int h = 1;
            int sum = 0;
            for (int i = 1; i <= n; i++)
            {
                Console.WriteLine(h);
                sum += h;
                h += 2;
                
            }
            Console.WriteLine("Sum: " + sum);
        }
    }
}
