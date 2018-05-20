using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MultiplyBigNumber
{
    class Program
    {
        static void Main(string[] args)
        {
            string str1 = new string(Console.ReadLine().TrimStart('0').ToCharArray().Reverse().ToArray());
            int secondNumber = int.Parse(Console.ReadLine());
            if (secondNumber != 0)
            {
                StringBuilder str = new StringBuilder();
                int currSum = 0;
                int remainder = 0;
                for (int i = 0; i < str1.Length; i++)
                {
                    currSum = secondNumber * (int)Char.GetNumericValue(str1[i]) + remainder;
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

                if (remainder > 10)
                {
                    str.Append(remainder % 10);
                    remainder /= 10;
                    str.Append(remainder);
                }
                else if (remainder < 10 && remainder > 0)
                {
                    str.Append(remainder);
                }

                string result = new string(str.ToString().ToCharArray().Reverse().ToArray());
                Console.WriteLine(result);
            }
            else
            {
                Console.WriteLine(0);
            }
            

            
        }
    }
}
