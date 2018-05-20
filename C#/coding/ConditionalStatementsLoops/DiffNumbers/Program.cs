using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DiffNumbers
{
    class Program
    {
        static void Main(string[] args)
        {
            int a = int.Parse(Console.ReadLine());
            int b = int.Parse(Console.ReadLine());

            if (b-a >= 5)
            {
                for (int i = a; i <= b; i++)
                {
                    int n1 = i;
                    for (int j = a; j <= b; j++)
                    {
                        int n2 = j;
                        for (int h = a; h <= b; h++)
                        {
                            int n3 = h;
                            for (int g = a; g <= b; g++)
                            {
                                int n4 = g;
                                for (int f = a; f <= b; f++)
                                {
                                    int n5 = f;
                                    if (n1 < n2 && n2 < n3 && n3 < n4 && n4 < n5)
                                    {
                                        Console.WriteLine("{0} {1} {2} {3} {4}", n1, n2, n3, n4, n5);
                                    }
                                }
                            }
                        }
                    }
                } 
            }
            else
            {
                Console.WriteLine("No");
            }
        }
    }
}
