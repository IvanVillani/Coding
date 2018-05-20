using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace LettersIndex
{
    class Program
    {
        static void Main(string[] args)
        {
            char[] input = Console.ReadLine().Select(i => i).ToArray();
            char[] alpha = Enumerable.Range('a', 'z' - 'a' + 1).Select(i => (Char)i).ToArray();

            for (int i = 0; i < input.Length; i++)
            {
                for (int j = 0; j < alpha.Length; j++)
                {
                    if (input[i] == alpha[j])
                    {
                        Console.WriteLine($"{input[i]} -> {j}");
                    }
                }
            }
        }
    }
}
