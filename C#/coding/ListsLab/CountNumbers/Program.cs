using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CountNumbers
{
    class Program
    {
        static void Main(string[] args)
        {
            List<int> input = Console.ReadLine().Split(' ').Select(int.Parse).ToList();
            int countOfNumber = 1;
            List<int> counts = new List<int>();
            input.Sort();
            for (int i = 0; i < input.Count; i++)
            {
                for (int j = i+1; j < input.Count; j++)
                {
                    if (input[i] == input[j])
                    {
                        countOfNumber++;
                        input.RemoveAt(j);
                        j--;
                    }
                    else
                    {
                        break;
                    }
                }
                counts.Add(countOfNumber);
                countOfNumber = 1;
            }

            for (int i = 0; i < input.Count; i++)
            {
                Console.WriteLine($"{input[i]} -> {counts[i]}");
            }
        }
    }
}
