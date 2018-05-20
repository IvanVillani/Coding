using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace BoatSim
{
    class Program
    {
        static void Main(string[] args)
        {
            string str1 = Console.ReadLine();
            string str2 = Console.ReadLine();
            string two = str1 + str2;
            char[] arrChars = two.ToCharArray();
            int n = int.Parse(Console.ReadLine());
            int firstMoves = 0;
            int secondMoves = 0;
            int charDiff = 0;
            string winner = "";

            for (int i = 1; i <= n; i++)
            {
                string input = Console.ReadLine();
                if (input == "UPGRADE")
                {
                    charDiff = charDiff + 3;
                }
                else
                {
                    if (i % 2 != 0)
                    {
                        firstMoves += input.Length; 
                        if (firstMoves >= 50)
                        {
                            winner = "first";
                            break;
                        }
                    }
                    else
                    {
                        secondMoves += input.Length;
                        if (secondMoves >= 50)
                        {
                            winner = "second";
                            break;
                        }
                    }
                }
            }

            if (winner == "")
            {
                bool checkBest = firstMoves > secondMoves;
                if (checkBest)
                {
                    Console.WriteLine((char)(arrChars[0] + charDiff));
                }
                else
                {
                    Console.WriteLine((char)(arrChars[1] + charDiff));
                }
            }
            else if (winner == "first")
            {
                Console.WriteLine((char)(arrChars[0] + charDiff));
            }
            else if (winner == "second")
            {
                Console.WriteLine((char)(arrChars[1] + charDiff));

            }

        }
    }
}
