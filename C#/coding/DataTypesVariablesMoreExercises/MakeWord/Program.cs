using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MakeWord
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            StringBuilder word = new StringBuilder();

            for (int i = 1; i<= n; i++)
            {
                string input = Console.ReadLine();
                word.Append(input);
            }
            Console.WriteLine("The word is: " + word);
        }
    }
}
