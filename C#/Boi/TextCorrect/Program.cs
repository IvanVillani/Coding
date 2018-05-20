using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TextCorrect
{
    class Program
    {
        static void Main(string[] args)
        {
            string a = Console.ReadLine();
            string[] gogo = a.Split(',', ' ');
            string text = Console.ReadLine();
            foreach (string gog in gogo)
            {
                if (text.Contains(gog))
                {
                    text = text.Replace(gog, new string('*', gog.Length));
                }
            }
            Console.WriteLine(text);

        }
    }
}
