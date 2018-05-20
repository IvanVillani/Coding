using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CountRealNumbers
{
    class Program
    {
        static void Main(string[] args)
        {
            SortedDictionary<double, int> dics = new SortedDictionary<double, int>();
            List<double> input = Console.ReadLine().Split().Select(double.Parse).ToList();

            for (int i = 0; i < input.Count; i++)
            {
                if (dics.ContainsKey(input[i]))
                {
                    dics[input[i]]++;
                }
                else
                {
                    dics[input[i]] = 1;
                }
            }

            foreach (double key in dics.Keys)
            {
                Console.WriteLine(key + " -> " + dics[key]);
            }
        }
    }
}
