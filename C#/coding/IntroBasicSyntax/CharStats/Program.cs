using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CharStats
{
    class Program
    {
        static void Main(string[] args)
        {
            string name = Console.ReadLine();
            int currh = int.Parse(Console.ReadLine());
            int maxh = int.Parse(Console.ReadLine());
            int curre = int.Parse(Console.ReadLine());
            int maxe = int.Parse(Console.ReadLine());

            Console.WriteLine("Name: " + name);
            Console.WriteLine("Health: " + "|" + new string ('|', currh) + new string ('.', maxh - currh) + "|");
            Console.WriteLine("Energy: " + "|" + new string('|', curre) + new string('.', maxe - curre) + "|");

        }
    }
}
