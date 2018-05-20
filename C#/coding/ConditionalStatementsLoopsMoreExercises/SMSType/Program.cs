using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SMSType
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());


            for (int i = 1; i <= n; i++)
            {
                int number = int.Parse(Console.ReadLine());
                if (number == 0)
                {
                    Console.Write(" ");
                }
                else
                {
                    int digit = number % 10;
                    int howManyDigits = 0;
                    int test = number;
                    for (int j = 1; j <= 4; j++)
                    {
                        int check = test % 10;
                        if (check != 0)
                        {
                            howManyDigits++;
                            test = test / 10;
                        }
                        else
                        {
                            break;
                        }
                    }

                    int offset = 0;

                    if (digit != 8 && digit != 9)
                    {
                        offset = (digit - 2) * 3;

                    }
                    else
                    {
                        offset = (digit - 2) * 3 + 1;

                    }

                    offset = offset + howManyDigits - 1;

                    Console.Write((char)(97 + offset));
                }
                
                
            }
            Console.WriteLine();
        }
    }
}
