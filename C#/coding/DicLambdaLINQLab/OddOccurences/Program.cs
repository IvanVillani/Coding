using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace OddOccurences
{
    class Program
    {
        static void Main(string[] args)
        {
            string[] input = Console.ReadLine().ToLower().Split().ToArray();
            Dictionary<string, int> dics = new Dictionary<string, int>();

            for (int i = 0; i < input.Length; i++)
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

            List<string> output = new List<string>();

            foreach (KeyValuePair<string, int> n in dics)
            {
                if (n.Value % 2 != 0)
                {
                    output.Add(n.Key);
                }
            }

            Console.WriteLine(String.Join(", ", output));
        }
    }
}
