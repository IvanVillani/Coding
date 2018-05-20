using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AppendList
{
    class Program
    {
        static void Main(string[] args)
        {
            List<string> input = Console.ReadLine().Split('|').ToList();
            input.Reverse();
            string temp = String.Join(" ", input);
            List<string> result = temp.Split(new char[] { ' ' }, StringSplitOptions.RemoveEmptyEntries).ToList();
            Console.WriteLine(String.Join(" ", result));
        }
    }
}
