using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace EqualSums
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] input = Console.ReadLine().Split(' ').Select(int.Parse).ToArray();
            int sumBefore = 0;
            int sumAfter = 0;
            bool check = true;

            for (int i = 0; i < input.Length; i++)
            {
                for (int j = i-1; j >= 0; j--)
                {
                    sumBefore += input[j];
                }

                for (int j = i+1; j < input.Length; j++)
                {
                    sumAfter += input[j];
                }

                if (sumBefore == sumAfter)
                {
                    Console.WriteLine(i);
                    check = false;
                    break;
                }
                sumBefore = 0;
                sumAfter = 0;
            }

            if (check)
            {
                Console.WriteLine("no");
            }
        }
    }
}
