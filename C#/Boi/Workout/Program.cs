using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Workout
{
    class Program
    {
        static void Main(string[] args)
        {
            int d = int.Parse(Console.ReadLine());
            double f = double.Parse(Console.ReadLine());
            double sum = 0.0;
            double a = 0.0;
            double g = f;
            double last = 0.0;
            
            for (int i = 1; i <= d; i++)
            {
                int proc = int.Parse(Console.ReadLine());
                a = f + f * proc / 100;
                sum = sum + a;
                f = a;
            }

            sum = sum + g;

            if (sum >= 1000)
            {
                last = sum - 1000;
                Console.WriteLine("You've done a great job running {0} more kilometers!", Math.Ceiling(last));
            }
            else
            {
                last = 1000 - sum;
                Console.WriteLine("Sorry Mrs. Ivanova, you need to run {0} more kilometers", Math.Ceiling(last));
            }
        }
    }
}
