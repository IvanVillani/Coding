using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SignInteger2
{
    class Program
    {
        static void Main(string[] args)
        {
            int numb = int.Parse(Console.ReadLine());
            Console.WriteLine("The number {0} is {1}.", numb, PrintSign(numb));
        }

        static string PrintSign(int numb)
        {
            if (numb < 0)
            {
                return "negative";
            }
            else if (numb == 0)
            {
                return "zero";
            }
            else
            {
                return "positive";
            }
        }
    }
}
