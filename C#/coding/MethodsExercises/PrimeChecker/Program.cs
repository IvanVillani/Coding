using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PrimeChecker
{
    class Program
    {
        static void Main(string[] args)
        {
            long number = Math.Abs(long.Parse(Console.ReadLine()));
            Console.WriteLine(CheckIfPrime(number));
        }

        static bool CheckIfPrime(long n)
        {
            bool check = true;
            if (n == 0 || n == 1)
            {
                check = false;
                return check;
            }
            for (long i = 2; i <= Math.Sqrt(n); i++)
            {
                if (n % i == 0)
                {
                    check = false;
                }
            }
            return check;
        }
    }
}
