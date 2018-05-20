using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace VowelDigit
{
    class Program
    {
        static void Main(string[] args)
        {
            string check = Console.ReadLine();
            int digit = 0;
            bool testDigit = int.TryParse(check, out digit);
            bool testVowel = "aeiouAEIOU".IndexOf(check) >= 0;
            if (testDigit)
            {
                Console.WriteLine("digit");
            }
            else if (testVowel)
            {
                Console.WriteLine("vowel");
            }
            else
            {
                Console.WriteLine("other");
            }
        }
    }
}
