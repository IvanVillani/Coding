using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace NumberChecker
{
    class Program
    {
        static void Main(string[] args)
        {
            string number = Console.ReadLine();
            long integer = 0;
            double floating = 0.0;

            bool integerCheck = long.TryParse(number, out integer);
            bool floatingCheck = double.TryParse(number, out floating);

            if (integerCheck)
            {
                Console.WriteLine("integer");
            }
            else if (floatingCheck)
            {
                Console.WriteLine("floating-point");
            }
        }
    }
}
