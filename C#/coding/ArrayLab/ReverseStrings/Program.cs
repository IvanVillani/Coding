using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ReverseStrings
{
    class Program
    {
        static void Main(string[] args)
        {
            string[] arrStr = Console.ReadLine().Split(' ');
            string[] reversed = new string[arrStr.Length];
            int temp = 0;

            for (int i = arrStr.Length - 1; i >= 0; i--)
            {
                reversed[temp] = arrStr[i];
                temp++;
            }

            Console.WriteLine(String.Join(" ", reversed));
        }
    }
}
