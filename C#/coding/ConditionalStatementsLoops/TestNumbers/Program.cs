using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TestNumbers
{
    class Program
    {
        static void Main(string[] args)
        {
            int a = int.Parse(Console.ReadLine());
            int b = int.Parse(Console.ReadLine());
            int check = int.Parse(Console.ReadLine());

            int first;
            int second;
            int sum = 0;
            int count = 0;

            for (int i = a; i >= 1; i--)
            {
                if (sum >= check)
                {
                    
                    break;
                }
                first = i;
                for (int j = 1; j <= b; j++)
                {
                    second = j;
                     sum = sum + 3 * first * second;
                    count++;
                    if (sum >= check)
                    {
                        Console.WriteLine(count + " combinations");
                        Console.WriteLine("Sum: {0} >= {1}", sum, check);
                        break;
                    }
                }
            }

            if (sum < check)
            {
                Console.WriteLine(count + " combinations");
                Console.WriteLine("Sum: " + sum);
            }
            
        }
    }
}
