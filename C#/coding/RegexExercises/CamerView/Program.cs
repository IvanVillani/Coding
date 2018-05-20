using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Text.RegularExpressions;
using System.Threading.Tasks;

namespace CamerView
{
    class Program
    {
        static void Main(string[] args)
        {
            string[] numbers = Console.ReadLine().Split().ToArray();
            string text = Console.ReadLine();
            int index = int.Parse(numbers[0]);
            int n = int.Parse(numbers[1]);
            string pattern = @"\|\<[^|]+\b";
            Regex regex = new Regex(pattern);
            MatchCollection matches = regex.Matches(text);
            List<string> list = new List<string>();


            foreach (Match m in matches)
            {
                StringBuilder str = new StringBuilder();
                int howmany = 0;
                for (int i = index+2; i < m.Value.Length; i++)
                {
                    if (howmany == n) { break; }
                    str.Append(m.Value[i]);
                    howmany++;

                }
                list.Add(str.ToString());
            }
            Console.WriteLine(String.Join(", ", list));
        }
    }
}
