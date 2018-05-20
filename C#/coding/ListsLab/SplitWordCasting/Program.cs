using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SplitWordCasing
{
    class Program
    {
        static void Main(string[] args)
        {
            List<string> input = Console.ReadLine().Split(",;:.!()\"'\\/[] ".ToCharArray(), StringSplitOptions.RemoveEmptyEntries).ToList();
            List<string> lower = new List<string>();
            List<string> upper = new List<string>();
            List<string> mixed = new List<string>();

            foreach (string str in input)
            {
                if (CheckForLower(str))
                {
                    lower.Add(str);
                }
                else if (CheckForUpper(str))
                {
                    upper.Add(str);
                }
                else
                {
                    mixed.Add(str);
                }
            }

            Console.WriteLine("Lower-case: " + String.Join(", ", lower));
            Console.WriteLine("Mixed-case: " + String.Join(", ", mixed));
            Console.WriteLine("Upper-case: " + String.Join(", ", upper));
        }

        static bool CheckForUpper(string str)
        {
            int lenght = 0;
            foreach (char chr in str)
            {
                if (chr >= 65 && chr <= 90)
                {
                    lenght++;
                }
            }
            if (lenght == str.Length)
            {
                return true;
            }
            else
            {
                return false;
            }
        }

        static bool CheckForLower(string str)
        {
            int lenght = 0;
            foreach (char chr in str)
            {
                if (chr >= 97 && chr <= 122)
                {
                    lenght++;
                }
            }
            if (lenght == str.Length)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
    }
}
