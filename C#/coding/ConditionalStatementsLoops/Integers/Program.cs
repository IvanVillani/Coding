using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Integers
{
    class Program
    {
        static void Main(string[] args)
        {
            int a = 0;
            int count = 0;
            for (int i = 1; i < i+1; i++)
            {
                string input = Console.ReadLine();
                bool check = int.TryParse(input, out a);
                if (check == false)
                {
                    Console.WriteLine(count);
                    break;
                }
                else
                {
                    count++;
                }
            }
        }
    }
}
