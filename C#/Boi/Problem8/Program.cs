using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Text.RegularExpressions;
using System.Threading.Tasks;

namespace Problem8
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            List<int> all = new List<int>();
            List<int> first = new List<int>();
            List<int> second = new List<int>();
            int v;
            int c;
            int d;
            for (int i = 1; i <= n; i++)
            {
                string a = Console.ReadLine();
                string[] b = a.Split(new char[] { }, StringSplitOptions.RemoveEmptyEntries);
                first.Add(b.Count());
                for (int j = 0; j <= b.Count() - 1; j++)
                {
                    v = int.Parse(b[j]);
                    all.Add(v);
                }
            }

            for (int i = 1; i <= n; i++)
            {
                string a = Console.ReadLine();
                string[] b = a.Split(new char[] { }, StringSplitOptions.RemoveEmptyEntries);
                second.Add(b.Count());
                for (int j = 0; j <= b.Count() - 1; j++)
                {
                    v = int.Parse(b[j]);
                    all.Add(v);
                }
            }

            int barba = 0;
            for (int i = 0; i <= n - 1; i++)
            {
                barba = barba + first[i];
            }

            int k = 0;
            int q = 0;
            
            int w = 0;
            List<int> gogo = new List<int>();
            for (int i = 0; i <= n-1; i++)
            {

                for (int j = 1; j <= first[i]; j++)
                {
                    
                    gogo.Add(all[k]);
                    k++;
                }
                w = barba + second[i] + q - 1;
                for (int h = barba + q; h <= barba + second[i] + q - 1; h++)
                {
                    

                    gogo.Add(all[w]);
                    w--;
                }
                
                q = q + second[i];

            }
            

            
            c = first[0] + second[0];
            int check = 1;

            for (int i = 1; i <= n-1; i++)
            {
                d = first[i] + second[i];
                if (d == c)
                {
                    check++;
                }
                else
                {
                    Console.WriteLine("The total number of cells is: " + gogo.Count());
                    break;
                }
            }


            
            int e = c - 1;
            int y = 0;
            if (check == n)
            {
                for (int i = 1; i <= n; i++)
                {
                    Console.Write("[");
                    if (i > 1)
                    {
                        y = e + 1;
                        e = e + c;
                    }
                    for (int p = y; p <= e; p++)
                    {
                        
                        
                        if (p == e)
                        {
                            
                            Console.Write(gogo[p] + "]");
                            Console.WriteLine();
                            


                        }
                        else
                        {
                            Console.Write(gogo[p] + ", ");
                        }
                       
                    }
                }
            }
        }
    }
}
