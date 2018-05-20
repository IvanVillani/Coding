using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MMMM
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] numbers = new int[5] { 99, 98, 92, 97, 95 };
            int a = 0;
            for (int i = 0; i <= numbers.Length - 1; i++)
            {
                for (int z = 0; z <= numbers.Length - 2; z++)
                {
                    if (numbers[z] > numbers[z+1])
                    {
                        a = numbers[z+1];
                        numbers[z+1] = numbers[z];
                        numbers[z] = a;
                    }
                }
                

            }

            Console.WriteLine(String.Join(", " , numbers));
        }
    }
}
