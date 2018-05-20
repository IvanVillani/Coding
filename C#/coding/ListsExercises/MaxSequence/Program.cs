using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MaxSequence
{
    class Program
    {
        static void Main(string[] args)
        {
            List<double> input = Console.ReadLine().Split(' ').Select(double.Parse).ToList();
            int beforeMax = 1;
            int currMax = 1;
            double index = 0;
            for (int i = 0; i < input.Count; i++)
            {
                if (input.Count > 1)
                {
                    if (i != input.Count - 1)
                    {
                        if (input[i] == input[i + 1])
                        {
                            currMax++;
                            if (currMax > beforeMax)
                            {
                                beforeMax = currMax;
                                index = input[i];
                            }

                        }
                        else
                        {
                            currMax = 1;
                        }

                    }
                    else
                    {
                        if (beforeMax == 1)
                        {
                            index = input[0];
                        }
                    }
                }
                else
                {
                    index = input[0];
                    break;
                }
            }
            
            if (input.Count > 1)
            {
                for (int i = 1; i < beforeMax; i++)
                {
                    Console.Write(index + " ");
                }
            }
            Console.WriteLine(index);
        }
    }
}
