using System;
using System.Collections.Generic;
using System.Linq;
using System.Numerics;
using System.Text;
using System.Threading.Tasks;

namespace n_10Base
{
    class Program
    {
        static void Main(string[] args)
        {
            BigInteger[] input = Console.ReadLine().Trim().Split().Select(BigInteger.Parse).ToArray();
            int basee = (int)input[0];
            BigInteger inputNumb = input[1];
            string strNumb = inputNumb.ToString();
            BigInteger newNumb = new BigInteger();
            int sqrtIndex = 0;

            if (basee <= 10 && basee >= 2)
            {
                for (int i = 1; i <= strNumb.Length; i++)
                {
                    newNumb += (inputNumb % 10) * BigInteger.Pow(basee, sqrtIndex);
                    inputNumb /= 10;
                    sqrtIndex++;
                }

                Console.WriteLine(newNumb);
            }
            else
            {
                Console.WriteLine(0);
            }
        }
    }
}
