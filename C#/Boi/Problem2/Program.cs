using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Problem4
{
    class Program
    {
        static void Main(string[] args)
        {
            string n = Console.ReadLine();
            string[] sing = n.Split(' ');
            int f = 0;
            
            for (int i = f; i <= sing.Count(); i++)
            {
                if (i > sing.Count() - 1)
                {
                    Console.WriteLine();
                    break;
                }
                Console.Write(sing[i]);
                
                for (int j = i + 1; j <= sing.Count()-1; j++)
                {
                    if (sing[i] == sing [j])
                    {
                        Console.Write(" ");
                        Console.Write(sing[j]);
                        i++;
                    }
                    else
                    {
                        Console.WriteLine();
                        
                        break;
                    }
                }
            }

        }
    }
}
