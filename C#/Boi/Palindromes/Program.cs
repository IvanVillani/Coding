using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Palindromes
{
    class Program
    {
        static void Main(string[] args)
        {
            string[] a = Console.ReadLine().Split(' ', ',', '.', '!', '?');
            int h = 0;
            for (int i = 0; i <= a.Count()-1; i++)
            {
                char[] gogo = a[i].ToCharArray();
                List<char> b = new List<char>();
                for (int j = gogo.Count()- 1; j >= 0; j--)
                {
                    b.Add(gogo[j]);
                }
                StringBuilder compare = new StringBuilder();
                foreach (char one in b)
                {
                    compare.Append(one);
                }
                string n = compare.ToString();
                if (a[i] == n)
                {
                    h++;
                    if (h == 1)
                    {
                        Console.Write(a[i]);
                    }
                    else
                    {
                        Console.Write(", " + a[i]);

                    }
                }
            }
            Console.WriteLine();
        }
    }
}
