using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace EvenByOdds
{
    class Program
    {
        static void Main(string[] args)
        {
            int number = Math.Abs(int.Parse(Console.ReadLine()));
            Console.WriteLine(GetSumOfOddDigits(number) * GetSumOfEvenDigits(number));
        }

        static int GetSumOfOddDigits(int n)
        {
            int sum = 0;
            while (n > 0)
            {
                if ((n % 10) % 2 != 0)
                {
                    sum += n % 10;
                }
                n = n / 10;
            }
            return sum;
        }

        static int GetSumOfEvenDigits(int n)
        {
            int sum = 0;
            while (n > 0)
            {
                if ((n % 10) % 2 == 0)
                {
                    sum += n % 10;
                }
                n = n / 10;
            }
            return sum;
        }
    }
}
