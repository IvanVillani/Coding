using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SumArrays
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] arrNums1 = Console.ReadLine()
                .Split(' ')
                .Select(int.Parse)
                .ToArray();
            int[] arrNums2 = Console.ReadLine()
                .Split(' ')
                .Select(int.Parse)
                .ToArray();


            if (arrNums1.Length == arrNums2.Length)
            {
                int[] arrFinal = new int[arrNums1.Length];
                for (int i = 0; i < arrNums1.Length; i++)
                {
                    arrFinal[i] = arrNums1[i] + arrNums2[i];
                }
                Console.WriteLine(String.Join(" ", arrFinal));
            }
            else
            {
                MakingFinalArray(arrNums1, arrNums2);
            }
        }

        static void MakingFinalArray(int[] arrNums1, int[] arrNums2)
        {
            int [] arrNums11;
            int [] arrNums22;

            if (arrNums1.Length > arrNums2.Length)
            {
                arrNums22 = ArrNums2ToEqual(arrNums1, arrNums2);
                arrNums11 = arrNums1;
            }
            else
            {
                arrNums11 = ArrNums1ToEqual(arrNums1, arrNums2);
                arrNums22 = arrNums2;
            }

            int[] arrFinal = new int[arrNums11.Length];
            for (int i = 0; i < arrNums11.Length; i++)
            {
                arrFinal[i] = arrNums11[i] + arrNums22[i];
            }
            Console.WriteLine(String.Join(" ", arrFinal));
        }

        static int[] ArrNums1ToEqual(int[] arrNums1, int[] arrNums2)
        {
            int[] arrNums11 = new int[arrNums2.Length];
            for (int i = 0; i < arrNums1.Length; i++)
            {
                arrNums11[i] = arrNums1[i];
            }
            int temp = 0;
            for (int i = arrNums1.Length; i < arrNums2.Length; i++)
            {
                arrNums11[i] = arrNums1[temp];
                if (temp == arrNums1.Length - 1)
                {
                    temp = 0;
                }
                else
                {
                    temp++;
                }
            }
            return arrNums11;
        }

        static int [] ArrNums2ToEqual(int[] arrNums1, int[] arrNums2)
        {
            int[] arrNums22 = new int[arrNums1.Length];
            for (int i = 0; i < arrNums2.Length; i++)
            {
                arrNums22[i] = arrNums2[i];
            }
            int temp = 0;
            for (int i = arrNums2.Length; i < arrNums1.Length; i++)
            {
                arrNums22[i] = arrNums2[temp];
                if (temp == arrNums2.Length - 1)
                {
                    temp = 0;
                }
                else
                {
                    temp++;
                }
            }
            return arrNums22;
        }
    }
}
