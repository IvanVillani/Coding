using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Decrypting
{
    class Program
    {
        static void Main(string[] args)
        {
            int key = int.Parse(Console.ReadLine());
            int n = int.Parse(Console.ReadLine());
            string str = "";
            for (int i = 0; i < n; i++)
            {
                string input = Console.ReadLine();
                str += input;
            }
            char[] arr = str.ToCharArray();
            for (int i = 0; i < n; i++)
            {
                Console.Write((char)(arr[i] + key));
            }
            Console.WriteLine();
        }
    }
}
