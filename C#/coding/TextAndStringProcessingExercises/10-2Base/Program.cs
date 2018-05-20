using System;
using System.Collections.Generic;
using System.Linq;
using System.Numerics;
using System.Text;
using System.Threading.Tasks;

namespace _10_2Base
{
    class Program
    {
        static void Main(string[] args)
        {
            BigInteger[] input = Console.ReadLine().Split().Select(BigInteger.Parse).ToArray();
            int basee = (int)input[0];
            BigInteger numb = input[1];
            BigInteger remainder = 1;
            string str = String.Empty;

            if (basee <= 10 && basee >= 2)
            {
                while (numb > 0)
                {
                    remainder = numb % basee;
                    numb = numb / basee;

                    str = remainder.ToString() + str;
                }

                Console.WriteLine(str);
            }
            else
            {
                Console.WriteLine(0);
            }
        }
    }
}
