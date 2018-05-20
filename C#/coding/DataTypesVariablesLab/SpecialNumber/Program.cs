using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SpecialNumber
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());

            for (int i = 1; i <= n; i++)
            {
                int diff = i;
                int sumDigits = 0;
                int currentDiff = 0;

                for (int j = 1; j < j + 1; j++)
                {
                    currentDiff = diff % 10;
                    diff = diff / 10;
                    if (diff >= 0)
                    {
                        sumDigits += currentDiff;
                        if (diff == 0)
                        {
                            break;
                        }
                    }
                    
                }

                if (sumDigits == 5 || sumDigits == 7 || sumDigits == 11)
                {
                    Console.WriteLine("{0} -> True", i);
                }
                else
                {
                    Console.WriteLine("{0} -> False", i);

                }
            }
        }
    }
}
