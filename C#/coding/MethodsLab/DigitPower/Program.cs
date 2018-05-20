using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DigitPower
{
    class Program
    {
        static void Main(string[] args)
        {
            double a = double.Parse(Console.ReadLine());
            int b = int.Parse(Console.ReadLine());
            Console.WriteLine(GetPower(a, b));
        }

        static double GetPower(double dig, int pow)
        {
            double result = 1;
            for (int i = 1; i <= pow; i++)
            {
                result = result * dig;
            }
            return result;
        }
    }
}
