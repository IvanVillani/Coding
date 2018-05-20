using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SumBigNumbs
{
    class Program
    {
        static void Main(string[] args)
        {
            string str1 = new string(Console.ReadLine().TrimStart('0').ToCharArray().Reverse().ToArray());
            string str2 = new string(Console.ReadLine().TrimStart('0').ToCharArray().Reverse().ToArray());
            StringBuilder str = new StringBuilder();
            int minLength = Math.Min(str1.Length, str2.Length);

            int currSum = 0;
            int remainder = 0;
            for (int i = 0; i < minLength; i++)
            {
                currSum = (int)Char.GetNumericValue(str2[i]) + (int)Char.GetNumericValue(str1[i]) + remainder;
                if (currSum >= 10)
                {
                    str.Append(currSum % 10);
                    remainder = currSum / 10;
                    currSum = 0;
                }
                else
                {
                    str.Append(currSum);
                    remainder = 0;
                    currSum = 0;
                }
            }

            if (str1.Length > str2.Length)
            {
                for (int i = minLength; i < str1.Length; i++)
                {
                    currSum = (int)Char.GetNumericValue(str1[i]) + remainder;
                    if (currSum >= 10)
                    {
                        str.Append(currSum % 10);
                        remainder = currSum / 10;
                        currSum = 0;
                    }
                    else
                    {
                        str.Append(currSum);
                        remainder = 0;
                        currSum = 0;
                    }
                }
                if (remainder > 0)
                {
                    str.Append(remainder);
                }
            }
            else if (str2.Length > str1.Length)
            {
                for (int i = minLength; i < str2.Length; i++)
                {
                    currSum = (int)Char.GetNumericValue(str2[i]) + remainder;
                    if (currSum >= 10)
                    {
                        str.Append(currSum % 10);
                        remainder = currSum / 10;
                        currSum = 0;
                    }
                    else
                    {
                        str.Append(currSum);
                        remainder = 0;
                        currSum = 0;
                    }
                }
                if (remainder > 0)
                {
                    str.Append(remainder);
                }
            }
            else
            {
                if (remainder > 0)
                {
                    str.Append(remainder);
                }
            }

            string result = new string(str.ToString().ToCharArray().Reverse().ToArray());
            Console.WriteLine(result);

        }


    }
}
