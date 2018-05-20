using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace FoldSum
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] input = Console.ReadLine().Split(' ').Select(int.Parse).ToArray();
            int[] middle = new int[input.Length / 2];
            int[] sides = new int[input.Length / 2];
            int[] summed = new int[input.Length / 2];
            int index = 0;

            for (int i = input.Length / 4 - 1; i >= 0; i--)
            {
                sides[index] = input[i];
                index++;
            }

            for (int i = input.Length - 1; i > input.Length - (input.Length / 4) - 1; i--)
            {
                sides[index] = input[i];
                index++;
            }

            index = 0;

            for (int i = input.Length / 4; i <= input.Length - (input.Length / 4) - 1; i++)
            {
                middle[index] = input[i];
                index++;
            }

            for (int i = 0; i < input.Length / 2; i++)
            {
                summed[i] = sides[i] + middle[i];
            }
            Console.WriteLine(String.Join(" ", summed));
        }
    }
}
