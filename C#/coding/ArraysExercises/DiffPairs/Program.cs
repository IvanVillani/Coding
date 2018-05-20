using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DiffPairs
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] input = Console.ReadLine().Split(' ').Select(int.Parse).ToArray();
            int diff = int.Parse(Console.ReadLine());
            int countOfPairs = 0;

            for (int i = 0; i < input.Length; i++)
            {
                for (int j = i+1; j < input.Length; j++)
                {
                    if (GetMax(input[i], input[j]) - GetMin(input[i], input[j]) == diff)
                    {
                        countOfPairs++;
                    }
                }
            }
            Console.WriteLine(countOfPairs);
        }

        static int GetMin(int first, int second)
        {
            if (first > second)
            {
                return second;
            }
            else if (second > first)
            {
                return first;
            }
            else
            {
                return first;
            }
        }

        static int GetMax(int first, int second)
        {
            if (first > second)
            {
                return first;
            }
            else if (second > first)
            {
                return second;
            }
            else
            {
                return first;
            }
        }
    }
}
