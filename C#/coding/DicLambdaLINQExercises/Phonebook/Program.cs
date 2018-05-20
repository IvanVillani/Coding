﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Phonebook
{
    class Program
    {
        static void Main(string[] args)
        {
            Dictionary<string, string> dics = new Dictionary<string, string>();
            for (; ; )
            {
                string[] input = Console.ReadLine().Split().ToArray();
                if (input[0] == "A")
                {
                    dics[input[1]] = input[2];
                }
                else if (input[0] == "S")
                {
                    if (dics.ContainsKey(input[1]))
                    {
                        Console.WriteLine(input[1] + " -> " + dics[input[1]]);
                    }
                    else
                    {
                        Console.WriteLine("Contact {0} does not exist.", input[1]);
                    }
                }
                else
                {
                    break;
                }
            }
        }
    }
}