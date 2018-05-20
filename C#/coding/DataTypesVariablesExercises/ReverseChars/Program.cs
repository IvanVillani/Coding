using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ReverseChars
{
    class Program
    {
        static void Main(string[] args)
        {
            char first = Convert.ToChar(Console.ReadLine());
            char second = Convert.ToChar(Console.ReadLine());
            char third = Convert.ToChar(Console.ReadLine());
            StringBuilder str = new StringBuilder();
            str = str.Append(third);
            str = str.Append(second);
            str = str.Append(first);
            Console.WriteLine(str);
        }
    }
}
