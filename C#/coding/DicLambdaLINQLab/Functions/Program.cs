using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Functions
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            List<double> input = new List<double>();

            for (int i = 0; i < n; i++)
            {
                input.Add(double.Parse(Console.ReadLine()));
            }

            Console.WriteLine("Sum = " + input.Sum());
            Console.WriteLine("Min = " + input.Min());
            Console.WriteLine("Max = " + input.Max());
            Console.WriteLine("Average = " + input.Average());
        }
    }
}
