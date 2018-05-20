using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SignInteger
{
    class Program
    {
        static void Main(string[] args)
        {
            int numb = int.Parse(Console.ReadLine());
            PrintSign(numb);
        }

        static void PrintSign(int numb)
        {
            if (numb < 0)
            {
                Console.WriteLine("The number {0} is negative.", numb);
            }
            else if (numb == 0)
            {
                Console.WriteLine("The number {0} is zero.", numb);
            }
            else
            {
                Console.WriteLine("The number {0} is positive.", numb);
            }
        }
    }
}
