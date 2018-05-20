using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Back30
{
    class Program
    {
        static void Main(string[] args)
        {
            int h = int.Parse(Console.ReadLine());
            int m = int.Parse(Console.ReadLine());

            if (m <= 29)
            {
                m += 30;
                Console.WriteLine(h + ":" + m);
            }
            else
            {
                m = m + 30 - 60;
                h++;
                if (h == 24)
                {
                    Console.WriteLine(0 + ":" + "{0:d2}", m);
                }
                else
                {
                    Console.WriteLine(h + ":" + "{0:d2}", m);

                }
            }
        }
    }
}
