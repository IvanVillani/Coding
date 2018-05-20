using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace BeerKegs
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            string realType = "";
            double volume = 0.0;

            for (int i = 1; i <= n; i++)
            {
                string checkType = Console.ReadLine();
                double radius = double.Parse(Console.ReadLine());
                int height = int.Parse(Console.ReadLine());
                double currVolume = Math.PI * radius * radius * height;
                if (currVolume > volume)
                {
                    realType = checkType;
                    volume = currVolume;
                }
                

            }

            Console.WriteLine(realType);
        }
    }
}
