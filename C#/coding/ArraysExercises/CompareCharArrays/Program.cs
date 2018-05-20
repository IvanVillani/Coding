using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CompareCharArrays
{
    class Program
    {
        static void Main(string[] args)
        {
            string [] str1 = Console.ReadLine().Split(' ');
            string newStr1 = "";
            for (int i = 0; i < str1.Length; i++)
            {
                newStr1 += str1[i];
            }
            char[] arr1 = newStr1.ToCharArray();

            string[] str2 = Console.ReadLine().Split(' ');
            string newStr2 = "";
            for (int i = 0; i < str2.Length; i++)
            {
                newStr2 += str2[i];
            }
            char[] arr2 = newStr2.ToCharArray();

            if (arr1.Length == arr2.Length)
            {
                int check = 0;
                for (int i = 0; i < arr1.Length; i++)
                {
                    if (arr1[i] == arr2[i])
                    {
                        check++;
                    }
                }

                if (check == arr2.Length || arr1[0] == arr2[0])
                {
                    Console.WriteLine(new string(arr1));
                    Console.WriteLine(new string(arr1));
                }
                else
                {
                    if (arr1[0] < arr2[0])
                    {
                        Console.WriteLine(new string(arr1));
                        Console.WriteLine(new string(arr2));
                    }
                    else
                    {
                        Console.WriteLine(new string(arr2));
                        Console.WriteLine(new string(arr1));
                    }
                }
            }
            else
            {
                if (arr1[0] == arr2[0])
                {
                    if (arr1.Length > arr2.Length)
                    {
                        Console.WriteLine(new string(arr2));
                        Console.WriteLine(new string(arr1));
                    }
                    else
                    {
                        Console.WriteLine(new string(arr1));
                        Console.WriteLine(new string(arr2));
                    }
                }
                else
                {
                    if (arr1[0] < arr2[0])
                    {
                        Console.WriteLine(new string(arr1));
                        Console.WriteLine(new string(arr2));
                    }
                    else
                    {
                        Console.WriteLine(new string(arr2));
                        Console.WriteLine(new string(arr1));
                    }
                }
            }
        }
    }
}
