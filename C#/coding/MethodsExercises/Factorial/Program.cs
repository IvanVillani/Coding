using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Numerics;

namespace Factorial
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            BigInteger result = 1;

            for (int i = 1; i <= n; i++)
            {
                result *= i;
            }

            int nulls = 0;
            BigInteger resultTest = result;
            while (resultTest % 10 == 0)
            {
                resultTest = resultTest / 10;
                nulls++;
            }
            Console.WriteLine(nulls);
        }
    }
}
