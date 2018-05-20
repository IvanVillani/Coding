using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Ivanovi
{
    class Program
    {
        static void Main(string[] args)
        {
            double a = double.Parse(Console.ReadLine());
            double first = double.Parse(Console.ReadLine());
            double second = double.Parse(Console.ReadLine());
            double third = double.Parse(Console.ReadLine());
            double sum = 0.0;
            double proc = 0.0;

            sum = a - (first + second + third);
            proc = sum - sum * 0.1;
            Console.WriteLine("{0:f2}", proc);


        }
    }
}
