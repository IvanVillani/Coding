using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace LargestCommonEnd
{
    class Program
    {
        static void Main(string[] args)
        {
            string[] input1 = Console.ReadLine().Split(' ');
            string[] input2 = Console.ReadLine().Split(' ');
            int leftNum = 0;
            int rightNum = 0;
            int diff = 0;
            string [] smallerArr;
            string[] biggerArr;


            if (input1.Length > input2.Length)
            {
                smallerArr = input2;
                biggerArr = input1;
                diff = input1.Length - input2.Length;
            }
            else if (input1.Length == input2.Length)
            {
                smallerArr = input1;
                biggerArr = input2;
                diff = 0;
            }
            else
            {
                smallerArr = input1;
                biggerArr = input2;
                diff = input2.Length - input1.Length;
            }


            for (int i = 0; i < smallerArr.Length; i++)
            {
                if (smallerArr[i] == biggerArr[i])
                {
                    leftNum++;
                }
                else
                {
                    break;
                }
            }

            for (int i = smallerArr.Length - 1; i >= 0; i--)
            {
                if (smallerArr[i] == biggerArr[i+diff])
                {
                    rightNum++;
                }
                else
                {
                    break;
                }
            }

            if (leftNum > rightNum)
            {
                Console.WriteLine(leftNum);
            }
            else if (rightNum > leftNum)
            {
                Console.WriteLine(rightNum);
            }
            else if (rightNum == 0 && leftNum == 0)
            {
                Console.WriteLine(0);
            }
            else
            {
                Console.WriteLine(leftNum);
            }
        }
    }
}
