using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConvertTemperature
{
    class Program
    {
        static void Main(string[] args)
        {
            double input = double.Parse(Console.ReadLine());
            double output = ConvertInput(input);
            Console.WriteLine("{0:f2}", output);
        }

        static double ConvertInput(double n)
        {
            return (n - 32) * 5 / 9;
        }
    }
}
