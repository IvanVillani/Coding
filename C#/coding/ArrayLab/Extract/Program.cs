using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Extract
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] arrNums = Console.ReadLine()
                .Split(' ')
                .Select(int.Parse)
                .ToArray();

            if (arrNums.Length == 1)
            {
                Console.WriteLine("{0}", arrNums[0]);
            }
            else if (arrNums.Length % 2 == 0)
            {
                Console.WriteLine("{0}, {1}", arrNums[(arrNums.Length / 2) - 1], arrNums[arrNums.Length / 2]);
            }
            else
            {
                Console.WriteLine("{0}, {1}, {2}", arrNums[(arrNums.Length / 2) - 1], arrNums[arrNums.Length / 2], arrNums[(arrNums.Length / 2) + 1]);

            }
        }
    }
}
