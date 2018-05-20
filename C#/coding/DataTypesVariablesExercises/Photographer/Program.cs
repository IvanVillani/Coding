using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Photographer
{
    class Program
    {
        static void Main(string[] args)
        {
            long all = long.Parse(Console.ReadLine());
            long filterTime = long.Parse(Console.ReadLine());
            long  filterFactor= long.Parse(Console.ReadLine());
            long uploadTime = long.Parse(Console.ReadLine());
            long filterPics = (long) Math.Ceiling(all * (filterFactor * 0.01));
            long filtring = all * filterTime;
            long uploading = filterPics * uploadTime;
            long total = filtring + uploading;
            long min = 0;
            long sec = 0;
            long h = 0;
            long d = 0;
            if (total > 59)
            {
                min = total / 60;
                sec = total - min * 60;
                if (min > 59)
                {
                    h = min / 60;
                    min -= h * 60;
                    if (h > 23)
                    {
                        d = h / 24;
                        h -= d * 24;
                    }
                }

            }
            else
            {
                sec = total;
            }
            Console.WriteLine($"{d}:{h:d2}:{min:d2}:{sec:d2}");
            

        }
    }
}
