using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace StringConcat
{
    class Program
    {
        static void Main(string[] args)
        {
            string delimeter = Console.ReadLine();
            string evenOrOdd = Console.ReadLine();
            int n = int.Parse(Console.ReadLine());
            string[] allStrings = new string[n];
            for (int i = 0; i < n; i++)
            {
                allStrings[i] = Console.ReadLine();
            }
            if (evenOrOdd == "even")
            {
                for (int i = 1; i < n; i = i + 2)
                {
                    Console.Write(allStrings[i]);
                    if (i != n-1 && i != n-2)
                    {
                        Console.Write(delimeter);
                    }
                }
            }
            else if (evenOrOdd == "odd")
            {
                for (int i = 0; i < n; i = i + 2)
                {
                    Console.Write(allStrings[i]);
                    if (i != n - 1 && i != n - 2)
                    {
                        Console.Write(delimeter);
                    }
                }
            }
            Console.WriteLine();
        }
    }
}
