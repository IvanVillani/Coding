using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace WaterOverflow
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            int capacity = 255;
            int litres = 0;

            for (int i = 1; i <= n; i++)
            {
                int inputLiters = int.Parse(Console.ReadLine());
                if (litres + inputLiters <= capacity)
                {
                    litres += inputLiters;
                    
                }
                else
                {
                    Console.WriteLine("Insufficient capacity!");
                }

            }
            Console.WriteLine(litres);
        }
    }
}
