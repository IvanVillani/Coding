using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SumAdjacentEqualNimb
{
    class Program
    {
        static void Main(string[] args)
        {
            List<double> input = Console.ReadLine().Split(' ').Select(double.Parse).ToList();
            int count = input.Count();
            for (int i = 0; i < count; i++)
            {
                if (i != count - 1)
                {
                    if (input[i] == input[i + 1])
                    {
                        input[i] = input[i] + input[i + 1];
                        input.RemoveAt(i + 1);
                        count = input.Count();
                        i = -1;
                    }
                }
            }

            Console.WriteLine(String.Join(" ", input));
        }
    }
}
