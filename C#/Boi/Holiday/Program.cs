using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Holiday
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            string d = Console.ReadLine().ToLower();
            string t = Console.ReadLine().ToLower();
            double sum = 0.0;

            if (n <= 10)
            {
                if (d == "miami")
                {
                    sum = 2 * 24.99 + 3 * 14.99;
                }
                else if (d == "canary islands")
                {
                    sum = 2 * 32.50 + 3 * 28.50;

                }
                else if (d == "philippines")
                {
                    sum = 2 * 42.99 + 3 * 39.99;

                }
            }
            else if (n >= 11 && n <= 15)
            {
                if (d == "miami")
                {
                    sum = 2 * 22.99 + 3 * 11.99;
                }
                else if (d == "canary islands")
                {
                    sum = 2 * 30.50 + 3 * 25.60;

                }
                else if (d == "philippines")
                {
                    sum = 2 * 41.00 + 3 * 36.00;

                }
            }
            else if (n > 15)
            {
                if (d == "miami")
                {
                    sum = 2 * 20.00 + 3 * 10.00;
                }
                else if (d == "canary islands")
                {
                    sum = 2 * 28.00 + 3 * 22.00;

                }
                else if (d == "philippines")
                {
                    sum = 2 * 38.50 + 3 * 32.40;

                }
            }

            sum = sum * n;
            sum = sum + sum * 0.25;

            if (t == "train")
            {
                sum = sum + (2 * 22.30 + 3 * 12.50);
            }
            else if (t == "bus")
            {
                sum = sum + (2 * 45.00 + 3 * 37.00);

            }
            else if (t == "airplane")
            {
                sum = sum + (2 * 90.00 + 3 * 68.50);

            }

            Console.WriteLine("{0:f3}", sum);
        }
    }
}
