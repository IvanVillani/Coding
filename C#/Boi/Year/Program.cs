using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Year
{
    class Program
    {
        static void Main(string[] args)
        {
            int a = int.Parse(Console.ReadLine());
            int b = int.Parse(Console.ReadLine());
            int k = 0;
            int d = 0;
            double fire = 0;
            double dar = 0;
            int div = 0;

            k = a * 20;
            


            if (k < b)
            {
                d = b - k;
                fire = d * 0.4;
                dar = d - fire;

                Console.WriteLine("Yes! {0} lv are for fireworks and {1} lv are for donation.", Math.Round(fire), Math.Round(dar));
            }
            else
            {
                div = k - b;
                Console.WriteLine("They won't have enough money to pay the covert. They will need {0} lv more.", div);
            }


        }
    }
}
