using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ChangeList
{
    class Program
    {
        static void Main(string[] args)
        {
            List<string> input = Console.ReadLine().Split(' ').ToList();
            bool even = true;

            for (; ; )
            {
                List<string> commands = Console.ReadLine().Split(' ').ToList();
                if (commands[0] == "Even" || commands[0] == "Odd")
                {
                    if (commands[0] == "Odd")
                    {
                        even = false;
                    }
                    break;
                }
                else if (commands[0] == "Delete")
                {
                    for (int i = 0; i < input.Count; i++)
                    {
                        if (input[i] == commands[1])
                        {
                            input.RemoveAt(i);
                            i--;
                        }
                    }
                }
                else if (commands[0] == "Insert")
                {
                    input.Insert(int.Parse(commands[2]), commands[1]);
                }
            }

            if (even)
            {
                List<string> evenResult = new List<string>();
                for (int i = 0; i < input.Count; i++)
                {
                    if (int.Parse(input[i]) % 2 == 0)
                    {
                        evenResult.Add(input[i]);
                    }
                }
                Console.WriteLine(String.Join(" ", evenResult));
            }
            else
            {
                List<string> oddResult = new List<string>();
                for (int i = 0; i < input.Count; i++)
                {
                    if (int.Parse(input[i]) % 2 != 0)
                    {
                        oddResult.Add(input[i]);
                    }
                }
                Console.WriteLine(String.Join(" ", oddResult));

            }
        }
    }
}
