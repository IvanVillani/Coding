using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ExtractSentence
{
    class Program
    {
        static void Main(string[] args)
        {
            string word = Console.ReadLine().ToLower();

            string[] sentences = Console.ReadLine().Split(new char[] { '.', '!', '?' }, StringSplitOptions.RemoveEmptyEntries).ToArray();
            foreach (string sentence in sentences)
            {
                string[] words = sentence.Split(new char[] { ' ', ',', '<', '>', '/', '\\', '/', '@', '#', '$', '%', '^', '&', '*', '(', ')', '[', ']', '{', '}', '|' });

                if (words.Contains(word))
                {
                    Console.WriteLine(sentence.Trim());
                }
            }
        }
    }
}
