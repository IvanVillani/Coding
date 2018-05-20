using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SpeedUnits
{
    class Program
    {
        static void Main(string[] args)
        {
            float meters = float.Parse(Console.ReadLine());
            float kmeters = meters / 1000;
            float miles = meters / 1609;
            float hours = float.Parse(Console.ReadLine());
            float minutes = float.Parse(Console.ReadLine());
            float seconds = float.Parse(Console.ReadLine());
            float hoursTime = hours + minutes / 60 + seconds / 3600;
            float secondsTime = hours * 3600 + minutes * 60 + seconds;
            Console.WriteLine(meters / secondsTime);
            Console.WriteLine(kmeters / hoursTime);
            Console.WriteLine(miles / hoursTime);


        }
    }
}
