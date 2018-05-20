using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Refractor2
{
    class Program
    {
        static void Main(string[] args)
        {
            int number = int.Parse(Console.ReadLine());
            int sum = 0;
            int check = 0;
            bool value = false;
            for (int i = 1; i <= number; i++)
            {
                check = i;
                while (check > 0)
                {
                    sum += check % 10;
                    check = check / 10;
                    
                }
                value = (sum == 5) || (sum == 7) || (sum == 11);
                Console.WriteLine($"{i} -> {value}");
                sum = 0;
                
            }

        }
    }
}
