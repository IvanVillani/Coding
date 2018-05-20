using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ShortWordSorted
{
    class Program
    {
        static void Main(string[] args)
        {
            List<string> input = Console.ReadLine()
                .ToLower()
                .Split(new char[] { '.', ',', ':', ';', '(', ')', '[', ']', '\\', '\"', '\'', '/', '!', '?', ' ' })
                .Where(n => n != "")
                .Where(n => n.Length < 5)
                .OrderBy(n => n)
                .Distinct()
                .ToList();
            Console.WriteLine(String.Join(", ", input));
        }
    }//2-3, and, c#, can, go, in, java, php, you

}
