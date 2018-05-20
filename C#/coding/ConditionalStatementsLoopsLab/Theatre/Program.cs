using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Theatre
{
    class Program
    {
        static void Main(string[] args)
        {
            string when = Console.ReadLine();
            int age = int.Parse(Console.ReadLine());
            int h = 0;

            if (when == "Weekday")
            {
                if (age >= 0 && age <= 18)
                {
                    h = 12;
                }
                else if (age > 18 && age <= 64)
                {
                    h = 18;
                }
                else if (age > 64 && age <= 122)
                {
                    h = 12;
                }
                
            }
            else if (when == "Weekend")
            {
                if (age >= 0 && age <= 18)
                {
                    h = 15;
                }
                else if (age > 18 && age <= 64)
                {
                    h = 20;
                }
                else if (age > 64 && age <= 122)
                {
                    h = 15;
                }
            }
            else if (when == "Holiday")
            {
                if (age >= 0 && age <= 18)
                {
                    h = 5;
                }
                else if (age > 18 && age <= 64)
                {
                    h = 12;
                }
                else if (age > 64 && age <= 122)
                {
                    h = 10;
                }
            }
            
            if (h != 0)
            {
                Console.WriteLine(h + "$");
            }
            else
            {
                Console.WriteLine("Error!");
            }
        }
    }
}
