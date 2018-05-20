using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PhotoGallery
{
    class Program
    {
        static void Main(string[] args)
        {
            int number = int.Parse(Console.ReadLine());
            int day = int.Parse(Console.ReadLine());
            int month = int.Parse(Console.ReadLine());
            int year = int.Parse(Console.ReadLine());
            int hours = int.Parse(Console.ReadLine());
            int minutes = int.Parse(Console.ReadLine());
            double size = double.Parse(Console.ReadLine());
            int width = int.Parse(Console.ReadLine());
            int height = int.Parse(Console.ReadLine());
            string orientation = "";

            if (width > height)
            {
                orientation = "(landscape)";
            }
            else if (height > width)
            {
                orientation = "(portrait)";
            }
            else
            {
                orientation = "(square)";
            }


            Console.WriteLine("Name: DSC_{0:D4}.jpg", number);
            Console.WriteLine("Date Taken: {0:D2}/{1:D2}/{2} {3:D2}:{4:D2}", day,month,year,hours,minutes);
            size = size * 0.000001;
            if (size < 1)
            {
                size = size * 1000;
                if (size < 1)
                {
                    size = size * 1000;
                    Console.WriteLine("Size: {0}B", size);
                }
                else
                {
                    Console.WriteLine("Size: {0}KB", size);

                }

            }
            else
            {
                size = Math.Round(size, 1);
                Console.WriteLine("Size: {0}MB", size);

            }
            
            Console.WriteLine("Resolution: {0}x{1} {2}",width,height,orientation);
        }
    }
}
