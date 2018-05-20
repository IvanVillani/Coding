using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Triples
{
    class Program
    {
        static void Main(string[] args)
        {
            int [] arrNums = Console.ReadLine()
                .Split(' ')
                .Select(int.Parse)
                .ToArray();

            int first = 0;
            int second = 0;
            long sum = 0;
            int checkIfExist = 0;

            for (int i = 0; i < arrNums.Length; i++)
            {
                first = arrNums[i];

                for (int j = i + 1; j < arrNums.Length; j++)
                {
                    second = arrNums[j];

                    sum = first + second;
                    for (int h = 0; h < arrNums.Length; h++)
                    {
                        if (sum == arrNums[h])
                        {
                            Console.WriteLine($"{first} + {second} == {sum}");
                            checkIfExist++;
                            break;
                        }
                    }
                }
            }

            if (checkIfExist == 0)
            {
                Console.WriteLine("No");
            }
        }
    }
}
