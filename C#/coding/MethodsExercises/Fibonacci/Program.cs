using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Fibonacci
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            Console.WriteLine(Fib(n));
        }

        static int Fib(int n)
        {
            int firstNumber = 1;
            int secondNumber = 0;
            int output = 0;
            for (int i = 0; i <= n; i++)
            {
                output = firstNumber + secondNumber;
                firstNumber = secondNumber;
                secondNumber = output;
            }
            return output;
        } 
    }
}
