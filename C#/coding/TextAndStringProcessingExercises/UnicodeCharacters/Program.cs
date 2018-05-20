using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace UnicodeCharacters
{
    class Program
    {
        static void Main(string[] args)
        {
            string input = Console.ReadLine();
            List<string> result = input.Select(t => $"\\u{(int)t:x4}").ToList();
            Console.WriteLine(String.Join("", result));
        }
    }
}
