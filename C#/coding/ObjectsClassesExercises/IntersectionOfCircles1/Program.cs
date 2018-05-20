using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace IntersectionOfCircles1
{

    class Program
    {
        class Circle
        {
            public int X { get; set; }
            public int Y { get; set; }
            public double R { get; set; }
        }

        static void Main(string[] args)
        {
            string[] firstInput = Console.ReadLine().Split().ToArray();
            string[] secondInput = Console.ReadLine().Split().ToArray();

            Circle c1 = new Circle() { X = int.Parse(firstInput[0]), Y = int.Parse(firstInput[1]), R = double.Parse(firstInput[2])};
            Circle c2 = new Circle() { X = int.Parse(secondInput[0]), Y = int.Parse(secondInput[1]), R = double.Parse(secondInput[2])};

            double d = c1.R + c2.R;
            double distance = CalcDistance(c1, c2);

            if (distance <= d)
            {
                Console.WriteLine("Yes");
            }
            else
            {
                Console.WriteLine("No");
            }
        }

        static double CalcDistance(Circle c1, Circle c2)
        {
            double distance = Math.Sqrt((c1.X - c2.X) * (c1.X - c2.X) + (c1.Y - c2.Y) * (c1.Y - c2.Y));
            return distance; 
        }
    }
}
