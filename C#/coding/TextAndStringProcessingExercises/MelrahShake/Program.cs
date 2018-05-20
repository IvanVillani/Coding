using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MelrahShake
{
    class Program
    {
        static void Main(string[] args)
        {
            string input = Console.ReadLine();
            string pattern = Console.ReadLine();
            int index = 0;
            int checker = 0;

            while (true)
            {
                if (pattern == String.Empty || pattern == null || pattern == "" || pattern.Length * 2 > input.Length)
                {
                    Console.WriteLine("No shake.");
                    Console.WriteLine(input);
                    break;
                }
                if (input.Contains(pattern))
                {
                    string tempinput = input;
                    index = tempinput.IndexOf(pattern);
                    checker++;
                    tempinput = tempinput.Remove(index, pattern.Length);
                    if (tempinput.Contains(pattern))
                    {
                        index = tempinput.LastIndexOf(pattern);
                        checker++;
                        tempinput = tempinput.Remove(index, pattern.Length);
                    }

                    if (checker == 2)
                    {
                        input = tempinput;
                        pattern = pattern.Remove(pattern.Length / 2, 1);
                        Console.WriteLine("Shaked it.");
                        checker = 0;
                    }
                    else
                    {
                        Console.WriteLine("No shake.");
                        Console.WriteLine(input);
                        break;
                    }

                }
                else
                {
                    Console.WriteLine("No shake.");
                    Console.WriteLine(input);
                    break;
                }
            }
        }
    }
}
