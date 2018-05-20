using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace BalancedBrackets
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            string expected = "";
            int even = 2;
            int test = 0;

            for (int i = 1; i <= n; i++)
            {
                string input = Console.ReadLine();
                if (input == "(" && test == 0)
                {
                    expected = ")";
                    even++;
                    test++;
                }
                else if (input == ")" && test == 0)
                {
                    even--;
                    break;

                }
                else if  (input == "(" && input == expected)
                {
                    expected = ")";
                    even++;
                }
                else if (input == ")" && input == expected)
                {
                    expected = "(";
                    even++;
                }
                else if (input == "(" && input != expected && test == 1)
                {
                    even = 1;
                    break;
                }
                else if (input == ")" && input != expected && test == 1)
                {
                    even = 1;
                    break;
                }

            }
            if (even % 2 == 0)
            {
                Console.WriteLine("BALANCED");
            }
            else
            {
                Console.WriteLine("UNBALANCED");
            }
        }
    }
}
