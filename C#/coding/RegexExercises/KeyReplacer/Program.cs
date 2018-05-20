using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Text.RegularExpressions;
using System.Threading.Tasks;

namespace KeyReplacer
{
    class Program
    {
        static void Main(string[] args)
        {
            string input = Console.ReadLine();
            StringBuilder temp = new StringBuilder();
            for(int i = 0; i < input.Length; i++)
            {
               if (input[i] == '|' || input[i] == '<' || input[i] == '\\') { break; }
                temp.Append(input[i]);
            }
            string startKey = temp.ToString();

            temp = temp.Clear();
            for (int i = input.Length-1; i >= 0; i--)
            {
                if (input[i] == '|' || input[i] == '<' || input[i] == '\\') { break; }
                temp.Append(input[i]);
            }
            char[] arr = temp.ToString().ToCharArray();
            Array.Reverse(arr);
            string endKey = new string(arr);

            string text = Console.ReadLine();
            string pattern = $@"{startKey}([\w\W]*?){endKey}";
            Regex regex = new Regex(pattern);
            MatchCollection matches = regex.Matches(text);

            StringBuilder str = new StringBuilder();
            foreach (Match m in matches)
            {
                str.Append(m.Groups[1]);
            }
            string result = str.ToString();
            if (result == "") { Console.WriteLine("Empty result"); }
            else { Console.WriteLine(result); }

        }
    }
}
