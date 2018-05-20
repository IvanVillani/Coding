using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ChooseDrink
{
    class Program
    {
        static void Main(string[] args)
        {
            string prof = Console.ReadLine();
            int n = int.Parse(Console.ReadLine());
            double price = 0;

            if (prof == "Athlete")
            {
                price = n * 0.70;
                
            }
            else if (prof == "Businessman" || prof == "Businesswoman")
            {
                price = n * 1.00;
            }
            else if (prof == "SoftUni Student")
            {
                price = n * 1.70;
            }
            else
            {
                price = n * 1.20;
            }

            Console.WriteLine($"The {prof} has to pay {price:f2}.");

        }
    }
}
