using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MinerTask
{
    class Program
    {
        static void Main(string[] args)
        {
            Dictionary<string, int> dics = new Dictionary<string, int>();
            List<int> ints = new List<int>();
            List<string> strs = new List<string>();
            bool thisIsFirstTime = true;
            int indexOfLastTime = 0;

            for (; ; )
            {
                string input = Console.ReadLine();
                if (input == "stop")
                {
                    break;
                }
                int inputNumb = 0;
                bool checker = int.TryParse(input, out inputNumb);
                if (checker)
                {
                    if (!thisIsFirstTime)
                    {
                        ints[indexOfLastTime] += inputNumb;
                        thisIsFirstTime = true;
                        indexOfLastTime = 0;
                    }
                    else
                    {
                        ints.Add(inputNumb);
                    }
                }
                else
                {
                    if (strs.Contains(input))
                    {
                        thisIsFirstTime = false;
                        for (int i = 0; i < strs.Count; i++)
                        {
                            if (strs[i] == input)
                            {
                                indexOfLastTime = i;
                            }
                        }
                    }
                    else
                    {
                        strs.Add(input);
                    }
                }
            }

            for (int i = 0; i < strs.Count; i++)
            {
                dics[strs[i]] = ints[i];
            }

            foreach (KeyValuePair<string, int> item in dics)
            {
                Console.WriteLine(item.Key + " -> " + item.Value);
            }
        }
    }
}
