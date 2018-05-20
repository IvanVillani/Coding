using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CharMultiply
{
    class Program
    {
        static void Main(string[] args)
        {
            string[] input = Console.ReadLine().Split().ToArray();

            string str1 = input[0];
            string str2 = input[1];
            int maxLength = GetMaxLength(str1, str2);
            
            int sum = GetCharacterSum(str1, str2, maxLength);
            Console.WriteLine(sum);
        }

        static int GetMaxLength(string str1, string str2)
        {
            if (str1.Length > str2.Length)
            {
                return str1.Length;
            }
            else if (str1.Length == str2.Length)
            {
                return -1;
            }
            else
            {
                return str2.Length;
            }
        }

        static int GetCharacterSum(string str1, string str2, int maxLength)
        {
            int sum = 0;
            if (maxLength == str1.Length)
            {
                for (int i = 0; i <= str1.Length-1; i++)
                {
                    if (i < str2.Length)
                    {
                        sum += str1[i] * str2[i];
                    }
                    else
                    {
                        sum += str1[i];
                    }
                }
            }
            else if (maxLength == str2.Length)
            {
                for (int i = 0; i <= str2.Length - 1; i++)
                {
                    if (i < str1.Length)
                    {
                        sum += str1[i] * str2[i];
                    }
                    else
                    {
                        sum += str2[i];
                    }
                }
            }
            else
            {
                for (int i = 0; i <= str1.Length - 1; i++)
                {
                    sum += str1[i] * str2[i];
                }
            }


            return sum;
        }
    }
}
