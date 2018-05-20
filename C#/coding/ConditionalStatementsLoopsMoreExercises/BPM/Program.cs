using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace BPM
{
    class Program
    {
        static void Main(string[] args)
        {
            int BPM = int.Parse(Console.ReadLine());
            int beats = int.Parse(Console.ReadLine());
            double bars = Math.Round(beats / 4.0, 1);
            Console.Write("{0} bars - ", bars);
            double seconds = beats * 60.0 / BPM;
            int minutes = (int) seconds / 60;
            seconds -= minutes * 60;
            seconds = Math.Floor(seconds);
            Console.Write("{0}m {1}s", minutes, seconds);
            Console.WriteLine();

        }
    }
}
