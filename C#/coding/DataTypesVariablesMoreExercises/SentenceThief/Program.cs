using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SentenceThief
{
    class Program
    {
        static void Main(string[] args)
        {
            string type = Console.ReadLine();
            long n = long.Parse(Console.ReadLine());
            sbyte sbyteResult = 0;
            int intResult = 0;
            long longResult = 0;
            long finalResult = long.MinValue;

            for (int i = 1; i <= n; i++)
            {
                string input = Console.ReadLine();

                if (type == "sbyte")
                {
                    bool ifParse = sbyte.TryParse(input, out sbyteResult);
                    if (ifParse)
                    {
                        if (finalResult <= sbyteResult)
                        {
                            finalResult = sbyteResult;
                        }
                    }

                }
                else if (type == "int")
                {
                    bool ifParse = int.TryParse(input, out intResult);
                    if (ifParse)
                    {
                        if (finalResult <= intResult)
                        {
                            finalResult = intResult;
                        }
                    }
                }
                else if (type == "long")
                {
                    bool ifParse = long.TryParse(input, out longResult);
                    if (ifParse)
                    {
                        if (finalResult <= longResult)
                        {
                            finalResult = longResult;
                        }
                    }
                }
            }
            double years = 0.0;
            if (finalResult < 0)
            {
                years = (double) finalResult / -128;
                if (years >= 1.0)
                {
                    Console.WriteLine($"Prisoner with id {finalResult} is sentenced to {Math.Ceiling(years)} years");
                }
                else
                {
                    Console.WriteLine($"Prisoner with id {finalResult} is sentenced to {Math.Ceiling(years)} year");
                }
            }
            else
            {
                years = (double)finalResult / 127;
                if (years >= 1.0)
                {
                    Console.WriteLine($"Prisoner with id {finalResult} is sentenced to {Math.Ceiling(years)} years");
                }
                else
                {
                    Console.WriteLine($"Prisoner with id {finalResult} is sentenced to {Math.Ceiling(years)} year");
                }
            }
        }
    }
}
