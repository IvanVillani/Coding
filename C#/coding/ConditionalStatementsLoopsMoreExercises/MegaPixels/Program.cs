using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MegaPixels
{
    class Program
    {
        static void Main(string[] args)
        {
            int width = int.Parse(Console.ReadLine());
            int height = int.Parse(Console.ReadLine());
            double result = Math.Round((width * height) * 0.000001, 1);
            Console.WriteLine("{0}x{1} => {2}MP", width, height, result);
        }
    }
}
