using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Text.RegularExpressions;
using System.Threading.Tasks;

namespace Usernames
{
    class Program
    {
        static void Main(string[] args)
        {
            string input = Console.ReadLine();
            string pattern = @"\b[a-zA-Z][\w]{2,24}\b";
            Regex regex = new Regex(pattern);
            MatchCollection matches = regex.Matches(input);
            List<string> list = new List<string>();

            foreach (Match m in matches)
            {
                list.Add(m.ToString());
            }

            int maxlength = 0;
            int current = 0;
            string first = "";
            string second = "";

            for (int i = 0; i < list.Count-1; i++)
            {
                current = list[i].Length + list[i + 1].Length;
                if (current > maxlength)
                {
                    first = list[i].ToString();
                    second = list[i + 1].ToString();
                    maxlength = current;
                    
                }
            }
            Console.WriteLine(first);
            Console.WriteLine(second);
        }
    }
}
