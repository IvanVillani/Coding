using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Beverage
{
    class Program
    {
        static void Main(string[] args)
        {
            string name = Console.ReadLine();
            int a = int.Parse(Console.ReadLine());
            int b = int.Parse(Console.ReadLine());
            int c = int.Parse(Console.ReadLine());
            double energy = a * (b * 0.01);
            double sugar = a * (c * 0.01);
            Console.WriteLine(a + "ml" + " " + name + ":");
            Console.WriteLine(energy + "kcal, " + sugar + "g sugars");
        }
    }
}
