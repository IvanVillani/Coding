using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MaxIncreasing
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] input = Console.ReadLine().Split(' ').Select(int.Parse).ToArray();
            int currMax = 0;
            int pretendent = 1;
            int saveIndex = 0;
            for (int i = 0; i < input.Length; i++)
            {
                if (i == input.Length - 1)
                {
                    break;
                }
                if (input[i] < input[i + 1])
                {
                    pretendent++;
                }
                else
                {
                    pretendent = 1;
                }

                if (pretendent > currMax)
                {
                    currMax = pretendent;
                    if (currMax == 2)
                    {
                        saveIndex = i;
                    }
                    else if (currMax == 3)
                    {
                        saveIndex = i-1;
                    }
                }
            }
            int digit = input[saveIndex];
            for (int i = saveIndex; i <= saveIndex + currMax -1; i++)
            {
                if (i == saveIndex)
                {
                    Console.Write(input[i]);
                }
                else
                {
                    Console.Write(" " + input[i]);
                }
                digit++;
            }
            Console.WriteLine();
        }
    }
}
