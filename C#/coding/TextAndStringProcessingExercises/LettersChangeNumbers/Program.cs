using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace LettersChangeNumbers
{
    class Program
    {
        static void Main(string[] args)
        {
            string[] input = Console.ReadLine().Trim().Split(new char[] { ' ', '\t' }, StringSplitOptions.RemoveEmptyEntries).ToArray();
            char[] alpha = "0ABCDEFGHIJKLMNOPQRSTUVWXYZ".ToCharArray();
            double sum = 0.0;

            for (int i = 0; i < input.Length; i++)
            {
                string upperTemp = input[i].ToUpper();
                double tempSum = 0.0;


                char firstUpper = upperTemp[0];
                int firstValue = 0;
                for (int g = 0; g < alpha.Length; g++)
                {
                    if (firstUpper == alpha[g])
                    {
                        firstValue = g;
                        break;
                    }
                }
                char secondUpper = upperTemp[upperTemp.Length-1];
                int secondValue = 0;
                for (int g = 0; g < alpha.Length; g++)
                {
                    if (secondUpper == alpha[g])
                    {
                        secondValue = g;
                        break;
                    }
                }
                int numb = GetNumber(input[i]);
                string str = input[i];

                if (char.IsLower(str[0]))
                {
                    tempSum = (double)numb * firstValue;
                }
                else
                {
                    tempSum = (double)numb / firstValue;
                }

                if (char.IsLower(str[str.Length -1]))
                {
                    tempSum += (double)secondValue;
                }
                else
                {
                    tempSum -= (double)secondValue;
                }

                sum += tempSum;

            }

            Console.WriteLine("{0:f2}", sum);
        }

        static int GetNumber(string str)
        {
            StringBuilder sbuilder = new StringBuilder();
            string str1 = new string(str.ToCharArray().Reverse().ToArray());

            for (int i = 1; i < str.Length - 1; i++)
            {
                sbuilder.Append(str1[i]);
            }

            string str2 = new string(sbuilder.ToString().ToCharArray().Reverse().ToArray());
            return int.Parse(str2);
        }
    }
}
