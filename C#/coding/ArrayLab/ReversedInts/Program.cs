using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ReversedInts
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            int[] inputNumbers = new int[n];
            for (int i = 1; i <= n; i++)
            {
                inputNumbers[i - 1] = int.Parse(Console.ReadLine());
            }
            int[] reversedNumbers = new int[n];
            ReversedIntegers(inputNumbers, reversedNumbers);
        }

        static void ReversedIntegers(int[] inputNumbers, int [] reversedNumbers) 
        {
            int temp = 0;
            for (int i = inputNumbers.Length - 1; i >= 0; i--)
            {
                reversedNumbers[temp] = inputNumbers[i];
                temp++;
            }
            Console.WriteLine(String.Join(" ", reversedNumbers));
        }
    }
}
