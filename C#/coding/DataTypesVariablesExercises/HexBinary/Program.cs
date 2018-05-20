using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HexBinary
{
    class Program
    {
        static void Main(string[] args)
        {
            int number = int.Parse(Console.ReadLine());
            string hex = number.ToString("X").ToUpper();
            string bin = Convert.ToString(number, 2);
            Console.WriteLine(hex);
            Console.WriteLine(bin);

        }
    }
}
