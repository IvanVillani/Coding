using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ReverseString
{
    class Program
    {
        static void Main(string[] args)
        {
            string str = Console.ReadLine();
            StringBuilder gogo = new StringBuilder();
            for (int i = str.Length - 1; i >= 0; i--)
            {
                gogo.Append(str[i]);
            }
            gogo.ToString();
            Console.WriteLine(gogo);
        }
    }
}
