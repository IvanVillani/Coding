using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace RectangleArea
{
    class Program
    {
        static void Main(string[] args)
        {
            double width = double.Parse(Console.ReadLine());
            double height = double.Parse(Console.ReadLine());
            double area = GetArea(width, height);
            Console.WriteLine(area);
        }

        static double GetArea(double w, double h)
        {
            return (w * h) / 2;
        }
    }
}
