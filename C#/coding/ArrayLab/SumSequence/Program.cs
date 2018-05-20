using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SumSequence
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            int k = int.Parse(Console.ReadLine());
            long[] arrInts = new long[n];
            long currNumber = 1;
            long sum = 0;
            for (int i = 0; i < n; i++)
            {
                if (i == 0)
                {
                    arrInts[i] = currNumber;
                    Console.Write(currNumber + " ");
                }
                else
                {
                    if (i <= k)
                    {
                        sum = arrInts.Sum();
                    }
                    else
                    {
                        sum = 0;
                        for (int j = 1; j <= k; j++)
                        {
                            sum += arrInts[i - j];
                        }
                    }

                    currNumber = sum;
                    arrInts[i] = currNumber;
                    Console.Write(currNumber);
                    if (i != n -1)
                    {
                        Console.Write(" ");
                    }
                    else
                    {
                        Console.WriteLine();
                    }
                }
            }
        }
    }
}
