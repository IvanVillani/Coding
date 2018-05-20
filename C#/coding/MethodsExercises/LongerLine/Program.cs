using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace LongerLine
{
    class Program
    {
        static void Main(string[] args)
        {
            double x1 = double.Parse(Console.ReadLine());
            double y1 = double.Parse(Console.ReadLine());
            double x2 = double.Parse(Console.ReadLine());
            double y2 = double.Parse(Console.ReadLine());
            double x3 = double.Parse(Console.ReadLine());
            double y3 = double.Parse(Console.ReadLine());
            double x4 = double.Parse(Console.ReadLine());
            double y4 = double.Parse(Console.ReadLine());
            double xx1 = Math.Abs(x1);
            double yy1 = Math.Abs(y1);
            double xx2 = Math.Abs(x2);
            double yy2 = Math.Abs(y2);
            double xx3 = Math.Abs(x3);
            double yy3 = Math.Abs(y3);
            double xx4 = Math.Abs(x4);
            double yy4 = Math.Abs(y4);

            

            if (CompareLines(x1,y1,x2,y2,x3,y3,x4,y4))
            {
                if (Check(xx1, yy1, xx2, yy2))
                {
                    Console.Write($"({x1}, {y1})");
                    Console.WriteLine($"({x2}, {y2})");

                }
                else
                {
                    Console.Write($"({x2}, {y2})");
                    Console.WriteLine($"({x1}, {y1})");

                }
            }
            else
            {
                if (Check(xx3, yy3, xx4, yy4))
                {
                    Console.Write($"({x3}, {y3})");
                    Console.WriteLine($"({x4}, {y4})");

                }
                else
                {
                    Console.Write($"({x4}, {y4})");
                    Console.WriteLine($"({x3}, {y3})");

                }
            }



            
        }

        static bool Check(double x1, double y1, double x2, double y2)
        {
            double firstPointLine = Math.Sqrt(x1 * x1 + y1 * y1);
            double secondPointLine = Math.Sqrt(x2 * x2 + y2 * y2);
            bool isFirstCloser = true;
            if (firstPointLine <= secondPointLine)
            {
                isFirstCloser = true;
            }
            else
            {
                isFirstCloser = false;
            }
            return isFirstCloser;
        }

        static bool CompareLines(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4)
        {
            bool lineCheck = false;
            double line1 = Math.Sqrt(Math.Pow(x1 - x2, 2) + Math.Pow(y1 - y2, 2)); ;
            double line2 = Math.Sqrt(Math.Pow(x3 - x4, 2) + Math.Pow(y3 - y4, 2)); ;
            if (line1 >= line2)
            {
                lineCheck = true;
            }
            return lineCheck;
        }
    }
}
