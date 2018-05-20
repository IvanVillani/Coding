using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Rounding
{
    class Program
    {
        static void Main(string[] args)
        {
            double[] arrNums = Console.ReadLine()
                .Split(' ')
                .Select(double.Parse)
                .ToArray();

            for (int i = 0; i < arrNums.Length; i++)
            {
                Console.WriteLine("{0} => {1}", arrNums[i], Math.Round(arrNums[i], 0, MidpointRounding.AwayFromZero));
            }
        }
    }
}
