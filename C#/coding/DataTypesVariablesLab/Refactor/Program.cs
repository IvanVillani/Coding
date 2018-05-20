using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Refactor
{
    class Program
    {
        static void Main(string[] args)
        {
            
            Console.Write("Length: ");
            double Lenght = double.Parse(Console.ReadLine());
            Console.Write("Width: ");
            double Width = double.Parse(Console.ReadLine());
            Console.Write("Height: ");
            double Heigth = double.Parse(Console.ReadLine());
            
            double Volume = (Lenght * Width * Heigth) / 3;
            Console.WriteLine("Pyramid Volume: {0:F2}", Volume);

        }
    }
}
