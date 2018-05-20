using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Restaurant
{
    class Program
    {
        static void Main(string[] args)
        {
            int size = int.Parse(Console.ReadLine());
            string pack = Console.ReadLine();
            double price = 0.00;

            if (size <= 50 && size >= 0)
            {
                price += 2500;
                if (pack == "Normal")
                {
                    price += 500;
                    price = price - (price * 0.05);
                }
                else if (pack == "Gold")
                {
                    price += 750;
                    price = price - (price * 0.1);

                }
                else if (pack == "Platinum")
                {
                    price += 1000;
                    price = price - (price * 0.15);

                }
                price = price / size;
                Console.WriteLine("We can offer you the Small Hall");
                Console.WriteLine("The price per person is {0:f2}$", price);

            }
            else if (size > 50 && size <= 100)
            {
                price += 5000;
                if (pack == "Normal")
                {
                    price += 500;
                    price = price - (price * 0.05);
                }
                else if (pack == "Gold")
                {
                    price += 750;
                    price = price - (price * 0.1);

                }
                else if (pack == "Platinum")
                {
                    price += 1000;
                    price = price - (price * 0.15);

                }
                price = price / size;
                Console.WriteLine("We can offer you the Terrace");
                Console.WriteLine("The price per person is {0:f2}$", price);
            }
            else if (size > 100 && size <= 120)
            {
                price += 7500;
                if (pack == "Normal")
                {
                    price += 500;
                    price = price - (price * 0.05);
                }
                else if (pack == "Gold")
                {
                    price += 750;
                    price = price - (price * 0.1);

                }
                else if (pack == "Platinum")
                {
                    price += 1000;
                    price = price - (price * 0.15);

                }
                price = price / size;
                Console.WriteLine("We can offer you the Great Hall");
                Console.WriteLine("The price per person is {0:f2}$", price);
            }
            else
            {
                Console.WriteLine("We do not have an appropriate hall.");
            }
        }
    }
}
