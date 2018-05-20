using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Hotel
{
    class Program
    {
        static void Main(string[] args)
        {
            string month = Console.ReadLine();
            int nights = int.Parse(Console.ReadLine());
            double studio = 0.0;
            double doube = 0.0;
            double suit = 0.0;

            if (month == "May" || month == "October")
            {
                if (nights > 7 && month == "October")
                {
                    studio = (nights - 1) * (50 - (50 * 0.05));
                }
                else if (nights > 7 && month != "October")
                {
                    studio = nights * (50 - (50 * 0.05));

                }
                else
                {
                    studio = 50 * nights;
                }
                doube = 65 * nights;
                suit = 75 * nights;
            }
            else if (month == "June" || month == "September")
            {
                if (nights > 14)
                {
                    doube = nights * (72 - (72 * 0.1));
                }
                else
                {
                    doube = 72 * nights;
                }
                if (nights > 7 && month == "September")
                {
                    studio = 60 * (nights - 1);
                }
                else
                {
                    studio = 60 * nights;

                }
                suit = 82 * nights;
            }
            else if (month == "July" || month == "August" || month == "December")
            {
                if (nights > 14)
                {
                    suit = nights * (89 - (89 * 0.15));
                }
                else
                {
                    suit = 89 * nights;
                }
                studio = 68 * nights;
                doube = 77 * nights;
            }

            Console.WriteLine("Studio: {0:f2} lv.", studio);
            Console.WriteLine("Double: {0:f2} lv.", doube);
            Console.WriteLine("Suite: {0:f2} lv.", suit);
        }
    }
}
