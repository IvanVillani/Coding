using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CenterPoint
{
    class Program
    {
        static void Main(string[] args)
        {
            double x1 = double.Parse(Console.ReadLine());
            double y1 = double.Parse(Console.ReadLine());
            double x2 = double.Parse(Console.ReadLine());
            double y2 = double.Parse(Console.ReadLine());
            double xx1 = Math.Abs(x1);
            double yy1 = Math.Abs(y1);
            double xx2 = Math.Abs(x2);
            double yy2 = Math.Abs(y2);
            if (Check(xx1, yy1, xx2, yy2) == 1)
            {
                Console.WriteLine($"({x1}, {y1})");
            }
            else
            {
                Console.WriteLine($"({x2}, {y2})");

            }
        }

        static int Check(double x1, double y1, double x2, double y2)
        {
            int result = 0;
            if (x1 < x2 && y1 < y2)
            {
                result = 1;
            }
            else if (x1 < x2 && y1 == y2)
            {
                result = 1;
            }
            else if (x1 == x2 && y1 < y2)
            {
                result = 1;
            }
            else
            {
                
            }

            return result;
        }
    }
}
