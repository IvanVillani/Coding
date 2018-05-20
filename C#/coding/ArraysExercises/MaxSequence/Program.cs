using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MaxSequence
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
                if (input[i] == input[i+1])
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
                    saveIndex = i;
                }
            }
            int digit = input[saveIndex];
            for (int i = 1; i <= currMax; i++)
            {
                if (i == 1)
                {
                    Console.Write(digit);
                }
                else
                {
                    Console.Write(" " + digit);
                }
            }
            Console.WriteLine();
        }
    }
}
