using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Text.RegularExpressions;
using System.Threading.Tasks;

namespace ExtractEmails
{
    class Program
    {
        static void Main(string[] args)
        {
            string text = Console.ReadLine();
            string pattern = @"\s+[A-Za-z0-9]+[-_.]*[A-Za-z0-9]+\@[A-Za-z\-]+(\.[A-Za-z\-]+)+";

            Regex regex = new Regex(pattern);
            MatchCollection matches = regex.Matches(text);

            foreach (Match m in matches)
            {
                Console.WriteLine(m.Value);
            }
        }
    }
}
