using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MaxFrequent
{
    class Program
    {
        static void Main(string[] args)
        {
            string[] input = Console.ReadLine().Split(' ');
            int currValue = 0;
            int beforeValue = 0;
            string index = "";
            for (int j = 0; j < input.Length; j++)
            {
                for (int i = 0; i < input.Length; i++)
                {
                    if (input[j] == input[i])
                    {
                        currValue++;
                    }

                    if (currValue > beforeValue)
                    {
                        beforeValue = currValue;
                        index = input[j];
                    }
                }
                currValue = 0;
            }
            Console.WriteLine(index);
        }
    }
}
