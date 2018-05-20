using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SumChars
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            StringBuilder all = new StringBuilder();
            for (int i = 1; i <= n; i++)
            {
                string input = Console.ReadLine();
                all.Append(input);
            }
            string str = all.ToString();
            char[] characters = str.ToCharArray();
            int sum = 0;
            for (int i = 0; i < n; i++)
            {
                sum += (int)characters[i];
            }
            Console.WriteLine("The sum equals: " + sum);
        }
    }
}
