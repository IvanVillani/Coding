using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace RotateSum
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] inputArr = Console.ReadLine().Split(' ').Select(int.Parse).ToArray();
            int n = int.Parse(Console.ReadLine());
            int[] reversed = new int[inputArr.Length];
            int[] summed = new int [inputArr.Length];


            for (int i = 1; i <= n; i++)
            {
                
                for (int j = 0; j < inputArr.Length; j++)
                {
                    if (j == 0)
                    {
                        reversed[j] = inputArr[inputArr.Length - 1];
                    }
                    else
                    {
                        reversed[j] = inputArr[j - 1];
                    }
                }

                for (int j = 0; j < inputArr.Length; j++)
                {
                    summed[j] = summed[j] + reversed[j];
                }

                for (int j = 0; j < inputArr.Length; j++)
                {
                    inputArr[j] = reversed[j];
                }
            }

            Console.WriteLine(String.Join(" ", summed));
        }
    }
}
