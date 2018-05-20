using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CubeProperties
{
    class Program
    {
        static void Main(string[] args)
        {
            double n = double.Parse(Console.ReadLine());
            string type = Console.ReadLine();
            double value;
            switch (type)
            {
                case "face": value = Face(n); break;
                case "space": value = Space(n); break;
                case "volume": value = Volume(n); break;
                case "area": value = Area(n); break;
                default: value = 0; break;
            }
            Console.WriteLine("{0:f2}", value);
        }

        static double Area(double n)
        {
            double value = 6 * n * n;
            return value;
        }

        static double Volume(double n)
        {
            double value = n * n * n;
            return value;
        }

        static double Space(double n)
        {
            double value = Math.Sqrt(3 * n * n);
            return value;
        }

        static double Face(double n)
        {
            double value = Math.Sqrt(2 * n * n);
            return value;
        }
    }
}
