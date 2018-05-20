using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Problem3
{
    class Program
    {
        static void Main(string[] args)
        {
            string a = Console.ReadLine();
            string[] sin = a.Split(' ');
            List<int> gogo = new List<int>();
            List<double> gosho = new List<double>();

            foreach (string n in sin)
            {
                int final;
                double fin;
                bool dam = int.TryParse(n, out final);
                if (dam == false)
                {
                    double.TryParse(n, out fin);
                    if (Math.Truncate(fin) * 1000 == fin * 1000)
                    {
                        final = (int)fin;
                        gogo.Add(final);
                    }
                    else
                    {
                        gosho.Add(fin);
                    }
                }
                
                else 
                {
                    gogo.Add(final);
                }
            }
            
            Console.Write("[");
            for (int i = 0; i <= gosho.Count - 1; i++)
            {
                Console.Write(gosho[i]);
                if (i < gosho.Count - 1)
                {
                    Console.Write(", ");
                }
                
            }
            gosho.Sort();
            Console.WriteLine("] -> min: {0}, max: {1}, sum: {2}, avg: {3}", gosho[0], gosho[gosho.Count - 1], gosho.Sum(), Math.Round(gosho.Sum()/gosho.Count(), 2));
            Console.Write("[");
            for (int i = 0; i <= gogo.Count - 1; i++)
            {
                Console.Write(gogo[i]);
                if (i < gogo.Count - 1)
                {
                    Console.Write(", ");
                }

            }
            gogo.Sort();
            Console.WriteLine("] -> min: {0}, max: {1}, sum: {2}, avg: {3}", gogo[0], gogo[gogo.Count - 1], (double)gogo.Sum(), gogo.Sum() / gogo.Count());
        }
    }
}
