using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HandsOfCards
{
    class Program
    {
        static void Main(string[] args)
        {
            Dictionary<string, List<string>> dics = new Dictionary<string, List<string>>();

            for (; ; )
            {
                string[] input = Console.ReadLine().Split(':').ToArray();
                
                if (input[0] == "JOKER")
                {
                    break;
                }
                List<string> inputList = input[1].Split(new char[] { ' ', ',' }, StringSplitOptions.RemoveEmptyEntries).ToList();
                if (dics.ContainsKey(input[0]))
                {
                    dics[input[0]] = dics[input[0]].Concat(inputList).Distinct().ToList();

                }
                else
                {
                    dics[input[0]] = inputList.Distinct().ToList();
                }
            }
            List<int> results = new List<int>();
            
            foreach (string item in dics.Keys)
            {
                int sum = 0;
                foreach (string str in dics[item])
                {
                    if (str.Length == 3)
                    {
                        sum += TakeFirst("10") * TakeSecond(str[2]);
                    }
                    else
                    {
                        sum += TakeFirst(str[0].ToString()) * TakeSecond(str[1]);
                    }
                }

                results.Add(sum);

            }
            int index = 0;
            foreach (string name in dics.Keys)
            {
                Console.WriteLine(name + ": " + results[index]);
                index++;
            }
        }

        static int TakeSecond(char second)
        {
            int secondNumber = 0;
            switch (second)
            {
                case 'S': secondNumber = 4; break;
                case 'H': secondNumber = 3; break;
                case 'D': secondNumber = 2; break;
                default: secondNumber = 1; break;
            }

            return secondNumber;
        }

        static int TakeFirst(string first)
        {
            int firstNumber = 0;
            switch (first)
            {
                case "J":
                    firstNumber = 11;
                    break;
                case "Q":
                    firstNumber = 12;
                    break;
                case "K":
                    firstNumber = 13;
                    break;
                case "A":
                    firstNumber = 14;
                    break;
                default:
                    firstNumber = int.Parse(first);
                    break;
            }

            return firstNumber;
        }
    }
}
