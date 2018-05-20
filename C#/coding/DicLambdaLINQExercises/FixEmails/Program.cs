using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace FixEmails
{
    class Program
    {
        static void Main(string[] args)
        {
            Dictionary<string, string> dics = new Dictionary<string, string>();
            List<string> names = new List<string>();
            List<string> emails = new List<string>();
            

            for (; ; )
            {
                string name = Console.ReadLine();
                if (name == "stop") { break; }
                string email = Console.ReadLine();
                
                if (!email.EndsWith("us") || !email.EndsWith("uk"))
                {
                    names.Add(name);
                    emails.Add(email);
                }
                
            }

            for (int i = 0; i < names.Count; i++)
            {
                dics[names[i]] = emails[i];
            }

            foreach (KeyValuePair<string, string> item in dics)
            {
                Console.WriteLine(item.Key + " -> " + item.Value);
            }
        }
    }
}
