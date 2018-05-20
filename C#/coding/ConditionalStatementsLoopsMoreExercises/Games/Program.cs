using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Games
{
    class Program
    {
        static void Main(string[] args)
        {
            double startMoney = double.Parse(Console.ReadLine());
            double gamePrice = 0.0D;
            double remainingMoney = startMoney;
            double spentMoney = 0.0D;
            

            for (int i = 1; i <= i+1; i++)
            {
                if (remainingMoney <= 0.0)
                {
                    Console.WriteLine("Out of money!");
                    break;
                }

                string gameTitle = Console.ReadLine();

                if (gameTitle == "OutFall 4")
                {
                    gamePrice = 39.99;
                }
                else if (gameTitle == "CS: OG")
                {
                    gamePrice = 15.99;
                }
                else if (gameTitle == "Zplinter Zell")
                {
                    gamePrice = 19.99;
                }
                else if (gameTitle == "Honored 2")
                {
                    gamePrice = 59.99;
                }
                else if (gameTitle == "RoverWatch")
                {
                    gamePrice = 29.99;
                }
                else if (gameTitle == "RoverWatch Origins Edition")
                {
                    gamePrice = 39.99;
                }
                else if (gameTitle == "Game Time")
                {
                    
                }
                else
                {
                    Console.WriteLine("Not Found");
                    gamePrice = 0;
                }
                






                if (gameTitle != "Game Time" && gamePrice != 0)
                {

                    if (remainingMoney <= 0.0)
                    {
                        Console.WriteLine("Out of money!");
                        break;
                    }
                    else if (remainingMoney != 0 && remainingMoney >= gamePrice)
                    {
                        remainingMoney -= gamePrice;
                        Console.WriteLine("Bought " + gameTitle);
                        
                        spentMoney += gamePrice;
                    }
                    else if (remainingMoney != 0.0 && remainingMoney < gamePrice)
                    {
                        Console.WriteLine("Too Expensive");
                    }
                }
                else if (gameTitle == "Game Time")
                {
                    if (remainingMoney <= 0.0)
                    {
                        Console.WriteLine("Out of money!");
                        break;
                    }
                    Console.WriteLine("Total spent: ${0:f2}. Remaining: ${1:f2}", spentMoney, remainingMoney);
                    break;
                }
                
                
            }
        }
    }
}
