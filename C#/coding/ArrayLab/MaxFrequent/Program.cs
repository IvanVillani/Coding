using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MaxFrequent
{
    class Program
    {
        static void Main(string[] args)
        {
            string [] input = Console.ReadLine().Split(' ');
            int currValue = 1;
            int beforeValue = 0;
            int index = 0;
            for (int i = 0; i <= input.Length; i++)
            {
                beforeValue = currValue;
                if (input[i] == input[i+1])
                {
                    currValue++;
                }

                if (currValue > beforeValue)
                {
                    beforeValue = currValue;
                    index = i;
                }
            }
        }
    }
}
