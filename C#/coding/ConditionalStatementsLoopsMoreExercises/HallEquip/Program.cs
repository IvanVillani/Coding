using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HallEquip
{
    class Program
    {
        static void Main(string[] args)
        {
            double budget = double.Parse(Console.ReadLine());
            int diffItems = int.Parse(Console.ReadLine());
            double total = 0.0;

            for (int i = 1; i <= diffItems; i++)
            {
                string itemName = Console.ReadLine();
                double itemPrice = double.Parse(Console.ReadLine());
                int count = int.Parse(Console.ReadLine());
                total += count * itemPrice;

                if (count > 1)
                {
                    itemName += "s";
                }
                Console.WriteLine("Adding {0} {1} to cart.", count, itemName);
            }

            Console.WriteLine("Subtotal: ${0:f2}", total);
            if (total <= budget)
            {
                Console.WriteLine("Money left: ${0:f2}", budget - total);
            }
            else
            {
                Console.WriteLine("Not enough. We need ${0:f2} more.", total - budget);
            }
        }
    }
}
