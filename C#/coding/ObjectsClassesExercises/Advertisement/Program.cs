using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Advertisement
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());

            string[] phrase = new string[] { "Excellent product.", "Such a great product.", "I always use that product.", "Best product of its category.",
                "Exceptional product.", "I can’t live without this product." };
            string[] events = new string[] { "Now I feel good.", "I have succeeded with this product.", "Makes miracles. I am happy of the results!",
                "I cannot believe but now I feel awesome.", "Try it yourself, I am very satisfied.", "I feel great!" };
            string[] authors = new string[] { "Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva" };
            string[] cities = new string[] { "Burgas", "Sofia", "Plovdiv", "Varna", "Ruse" };

            Random ran = new Random();

            for (int i = 1; i <= n; i++)
            {
                int phraseIndex = ran.Next(0, phrase.Length-1);
                int eventsIndex = ran.Next(0, events.Length-1);
                int authorsIndex = ran.Next(0, authors.Length-1);
                int citiesIndex = ran.Next(0, cities.Length-1);

                Console.WriteLine("{0} {1} {2} - {3}", phrase[phraseIndex], events[eventsIndex], authors[authorsIndex], cities[citiesIndex]);
            }
        }
    }
}
