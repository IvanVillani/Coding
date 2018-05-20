using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MultiTable
{
    class Program
    {
        static void Main(string[] args)
        {
            int a = int.Parse(Console.ReadLine());
            int b = int.Parse(Console.ReadLine());

            if (b <= 10)
            {
                for (int i = b; i <= 10; i++)
                {
                    Console.WriteLine(a + " X " + i + " = " + a * i);
                }
            }
            else
            {
                Console.WriteLine(a + " X " + b + " = " + a*b);
            }
        }
    }
}
