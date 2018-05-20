using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Stuck
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            string a = Console.ReadLine();
            string[] b = a.Split(' ');
          
            string first;
            string second;
            string third;
            string fourth;
            int d = 0;
            for (int i = 0; i <= n - 1; i++)
            {
                first = b[i];
                for (int j = 0; j <= n - 1; j++)
                {
                    second = b[j];
                    for (int h = 0; h <= n - 1; h++)
                    {
                        third = b[h];
                        for (int f = 0; f <= n - 1; f++)
                        {
                            fourth = b[f];

                            if (first + second == third + fourth && first != second && 
                                first != third && first != fourth && second != third && second != fourth && third != fourth)
                            {
                                Console.WriteLine(first + "|" + second + "==" + third + "|" + fourth);
                               d++;
                            }
                            
                        }
                    }
                }
                
            }
            if (d == 0)
            {
                Console.WriteLine("No");
            }
        }
    }
}
