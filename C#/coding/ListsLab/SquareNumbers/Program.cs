using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SquareNumbers
{
    class Program
    {
        static void Main(string[] args)
        {
            List<int> input = Console.ReadLine().Split(' ').Select(int.Parse).ToList();
            List<int> output = new List<int>();

            foreach (int a in input)
            {
                if (Math.Sqrt(a) == (int)Math.Sqrt(a))
                {
                    output.Add(a);
                }
            }

            output.Sort();
            output.Reverse();
            Console.WriteLine(String.Join(" ", output));
        }
    }
}
