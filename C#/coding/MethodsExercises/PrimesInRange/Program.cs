using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PrimesInRange
{
    class Program
    {
        static void Main(string[] args)
        {
            int a = Math.Abs(int.Parse(Console.ReadLine()));
            int b = Math.Abs(int.Parse(Console.ReadLine()));
            PrintPrimes(a, b);
        }

        static bool CheckIfPrime(int number)
        {
            bool check = true;
            if (number == 0 || number == 1)
            {
                check = false;
                return check;
            }
            for (long i = 2; i <= Math.Sqrt(number); i++)
            {
                if (number % i == 0)
                {
                    check = false;
                }
            }
            return check;
        }

        static void PrintPrimes(int a, int b)
        {
            int test = 0;
            for (int i = a; i <= b; i++)
            {
                if (CheckIfPrime(i) && test == 0)
                {
                    Console.Write(i);
                    test++;
                }
                else if (CheckIfPrime(i) && test > 0)
                {
                    Console.Write(", " + i);
                }
            }
            Console.WriteLine();
        }
    }
}
