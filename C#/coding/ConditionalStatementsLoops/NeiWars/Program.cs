using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace NeiWars
{
    class Program
    {
        static void Main(string[] args)
        {
            int kick = int.Parse(Console.ReadLine());
            int fist = int.Parse(Console.ReadLine());

            int checkfor3 = 0;

            int PeshoHealth = 100;
            int GoshoHealth = 100;


            for (int i = 1; i < i + 1; i++)
            {
                checkfor3++;
                if (i % 2 != 0)
                {
                    GoshoHealth -= kick;
                    if (GoshoHealth <= 0)
                    {
                        Console.WriteLine("Pesho won in {0}th round.", i);
                        break;
                    }
                    else
                    {
                        Console.WriteLine("Pesho used Roundhouse kick and reduced Gosho to {0} health.", GoshoHealth);
                    }
                }
                else
                {
                    PeshoHealth -= fist;
                    if (PeshoHealth <= 0)
                    {
                        Console.WriteLine("Gosho won in {0}th round.", i);
                        break;
                    }
                    else
                    {
                        Console.WriteLine("Gosho used Thunderous fist and reduced Pesho to {0} health.", PeshoHealth);
                    }
                }
                if (checkfor3 == 3)
                {
                    GoshoHealth += 10;
                    PeshoHealth += 10;
                    checkfor3 = 0;
                }
            }

        }
    }
}
