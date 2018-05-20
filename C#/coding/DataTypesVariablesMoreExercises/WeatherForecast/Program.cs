using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace WeatherForecast
{
    class Program
    {
        static void Main(string[] args)
        {
            string check = Console.ReadLine();
            try
            {
                long input = long.Parse(check);

                if (input >= sbyte.MinValue && input <= sbyte.MaxValue)
                {
                    Console.WriteLine("Sunny");
                    
                }
                else if (input >= int.MinValue && input <= int.MaxValue)
                {
                    Console.WriteLine("Cloudy");
                }
                else if (input >= long.MinValue && input <= long.MaxValue)
                {
                    Console.WriteLine("Windy");
                }
            }
            catch (Exception)
            {
                Console.WriteLine("Rainy");
            }
            
        }
    }
}
