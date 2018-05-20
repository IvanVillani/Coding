using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Calories
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            int cal = 0;
            for (int i = 1; i <= n; i++)
            {
                string ingredient = Console.ReadLine().ToLower();
                if (ingredient == "cheese")
                {
                    cal += 500;
                }
                else if (ingredient == "tomato sauce")
                {
                    cal += 150;
                }
                else if (ingredient == "salami")
                {
                    cal += 600;
                }
                else if (ingredient == "pepper")
                {
                    cal += 50;
                }
            }
            Console.WriteLine("Total calories: " + cal);
        }
    }
}
