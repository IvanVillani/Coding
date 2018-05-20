using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Problem5
{
    class Program
    {
        static void Main(string[] args)
        {
            string n = Console.ReadLine();
            string[] all = n.Split(' ');
            List<int> gogo = new List<int>();
            int a = 1;
            int b = 0;
            int c = 0;
            foreach (string el in all)
            {
                int il;
                int.TryParse(el, out il);
                gogo.Add(il);
            }
            for (int i = 0; i <= gogo.Count()-2; i++)
            {
                if (i == 0)
                {
                    Console.Write(gogo[i]);

                }
                if (gogo[i] < gogo[i+1])
                {
                    Console.Write(" " + gogo[i+1]);
                    a++;
                    if (i == gogo.Count()-2 && a > b)
                    {
                        c = i + 1;
                        b = a;
                        break;
                        
                    }
                    
                    if (i == gogo.Count() - 2 && a == b)
                    {
                        b ++;
                        c--;
                    }
                    
                }
                else 
                {
                    if (a > b)
                    {
                        c = i + 1;
                        b = a;
                        a = 1;
                    }
                    else if (a == b)
                    {
                        a = 1;
                    }
                    Console.WriteLine();
                    Console.Write(gogo[i + 1]);
                   
                }
                
            }
            Console.WriteLine();
            Console.Write("Longest: ");
            for (int j = c-b+2; j <=c; j++)
            {
                Console.Write(gogo[j] + " ");
            }

            
        }
    }
}
