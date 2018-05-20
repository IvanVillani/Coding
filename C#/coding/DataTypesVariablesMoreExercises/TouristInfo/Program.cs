using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TouristInfo
{
    class Program
    {
        static void Main(string[] args)
        {
            string input = Console.ReadLine();
            double value = double.Parse(Console.ReadLine());
            double newValue = 0.0;
            string newName = "";
            switch (input)
            {
                case "miles":
                    newValue = value * 1.6;
                    newName = "kilometers";
                    break;
                case "inches":
                    newValue = value * 2.54;
                    newName = "centimeters";
                    break;
                case "feet":
                    newValue = value * 30;
                    newName = "centimeters";
                    break;
                case "yards":
                    newValue = value * 0.91;
                    newName = "meters";
                    break;
                case "gallons":
                    newValue = value * 3.8;
                    newName = "liters";
                    break;
            }
            Console.WriteLine($"{value} {input} = {newValue:f2} {newName}");
        }
    }
}
