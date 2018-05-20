using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace FindCount
{
    class Program
    {
        static void Main(string[] args)
        {
            string a = Console.ReadLine();
            string b = Console.ReadLine();
            int count = 0;
            
            int h = 1;
            int m = a.IndexOf(b, 0);
            
            if (m != -1)
            {
                count++;
                for (int i = 0; i <= h; i++)
                {
                    m = a.IndexOf(b, m + 1);

                    if (m != -1)
                    {
                        count++;
                        h++;
                    }
                    else
                    {
                        break;
                    }

                }
                Console.WriteLine(count);
            }
            
            
        }
    }
}
