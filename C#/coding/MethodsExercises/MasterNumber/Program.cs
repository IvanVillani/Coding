using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MasterNumber
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            for (int i = 1; i <= n; i++)
            {
                CheckIfMaster(i);
            }
        }

        static void CheckIfMaster(int number)
        {
            int checkFor3Statements = 0;
            int checkEven = 0;

            int tempNumb = number;
            int reversed = 0;
            while (tempNumb != 0)
            {
                int diff = tempNumb % 10;
                reversed = reversed * 10 + diff;
                tempNumb = tempNumb / 10;
            }
            if (number == reversed)
            {
                checkFor3Statements++;
            }

            int sumOfDigits = 0;
            int tempNumber = number;
            while (tempNumber != 0)
            {
                sumOfDigits += tempNumber % 10;
                tempNumber /= 10;
            }

            if (sumOfDigits % 7 == 0)
            {
                checkFor3Statements++;
            }


            int tempNumber1 = number;
            while (tempNumber1 != 0)
            {
                checkEven = tempNumber1 % 10;
                if (checkEven % 2 == 0)
                {
                    checkFor3Statements++;
                    break;
                }
                tempNumber1 = tempNumber1 / 10;
            }

            if (checkFor3Statements == 3)
            {
                Console.WriteLine(number);
            }
        }
    }
}
