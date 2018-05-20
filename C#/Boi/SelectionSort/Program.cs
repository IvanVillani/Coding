using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SelectionSort
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] numbers = new int[5] { 99, 98, 92, 97, 95 };
            int a = 0;
            int b = 0;
            for (int i = 0; i <= numbers.Length - 2; i++)
            {
                a = numbers[i];

                for (int z = i + 1; z <= numbers.Length - 1; z++)
                {
                    if (numbers[z] < a)
                    {
                        a = numbers[z];
                        b = z;
                    }
                    if (z == numbers.Length - 1)
                    {
                        numbers[b] = numbers[i];
                        numbers[i] = a;

                    }
                }


                

            }

            Console.WriteLine(String.Join(", ", numbers));
        }
    }
}
