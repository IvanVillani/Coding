using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ReversedNumbers
{
    class Program
    {
        static void Main(string[] args)
        {
            string input = Console.ReadLine();
            Console.WriteLine(StringReverse(input));
        }

        static string StringReverse(string input)
        {
            char[] arr = input.ToCharArray();
            string output = "";

            for (int i = arr.Count() - 1; i >= 0; i--)
            {
                output += arr[i];
            }
            return output;
        }
    }
}
