using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Text.RegularExpressions;
using System.Threading.Tasks;

namespace Wheather
{
    class Program
    {
        class Wheather
        {
            public string City { get; set; }
            public double Temp { get; set; }
            public string Type { get; set; }
        }

        static void Main(string[] args)
        {
            StringBuilder str = new StringBuilder();
            for (; ; )
            {
                string input = Console.ReadLine();
                if (input == "end") { break; }
                str.Append(input);
            }
            string text = str.ToString();
            string pattern = @"(?<city>[A-Z]{2})(?<temp>[0-9]+\.[0-9]+)(?<type>[A-Za-z]+)\|";

            Regex regex = new Regex(pattern);
            MatchCollection matches = regex.Matches(text);
            Dictionary<string, Wheather> dics = new Dictionary<string, Wheather>();

            foreach (Match m in matches)
            {
                dics[m.Groups[1].ToString()] = new Wheather() { City = m.Groups[1].ToString(), Temp = double.Parse(m.Groups[2].ToString()), Type = m.Groups[3].ToString() };
            }

            dics = dics.OrderBy(s => s.Value.Temp).ToDictionary(pair => pair.Key, pair => pair.Value);
            foreach (KeyValuePair<string, Wheather> pair in dics)
            {
                Console.WriteLine("{0} => {1:f2} => {2}", pair.Key, pair.Value.Temp, pair.Value.Type);
            }
        }
    }
}
