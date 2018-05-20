using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Language
{
    class Program
    {
        static void Main(string[] args)
        {
            string land = Console.ReadLine();
            if (land == "England" || land == "USA")
            {
                Console.WriteLine("English");
            }
            else if (land == "Mexico" || land == "Argentina" || land == "Spain")
            {
                Console.WriteLine("Spanish");
            }
            else
            {
                Console.WriteLine("unknown");
            }
        }
    }
}
