using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Pytagor_numbers
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            List<int> numbers = new List<int>();
            int a;
            int b;
            int c;
            int check = 0;

            for (int i = 1; i <= n; i++)
            {
                numbers.Add(int.Parse(Console.ReadLine()));
            }

            for (int i = 0; i < n; i++)
            {
                a = numbers[i];
                for (int j = 0; j < n; j++)
                {
                    b = numbers[j];
                    for (int h = 0; h < n; h++)
                    {
                        c = numbers[h];

                        if (a*a + b*b == c*c && a <= b)
                        {
                            check++;
                            Console.WriteLine(a + "*" + a + " + " + b + "*" + b + " = " + c + "*" + c);
                        }
                    }
                }
            }
            if (check == 0)
            {
                Console.WriteLine("No");
            }

        }
    }
}
