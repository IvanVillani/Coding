using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace GeometryCalc
{
    class Program
    {
        static void Main(string[] args)
        {
            string type = Console.ReadLine();
            double value;

            switch (type)
            {
                case "triangle": value = TriangleArea(double.Parse(Console.ReadLine()), double.Parse(Console.ReadLine()));
                    break;
                case "square":
                    value = SquareArea(double.Parse(Console.ReadLine()));
                    break;
                case "rectangle":
                    value = RectangleArea(double.Parse(Console.ReadLine()), double.Parse(Console.ReadLine()));
                    break;
                case "circle":
                    value = CircleArea(double.Parse(Console.ReadLine()));
                    break;
                default: value = 0;
                    break;
            }
            Console.WriteLine("{0:f2}", value);
        }

        static double CircleArea(double radius)
        {
            double value = Math.PI * radius * radius;
            return value;
        }

        static double RectangleArea(double width, double height)
        {
            double value = width * height;
            return value;
        }

        static double SquareArea(double side)
        {
            double value = side * side;
            return value;
        }

        static double TriangleArea(double side, double height)
        {
            double value = side * height / 2;
            return value;
        }
    }
}
