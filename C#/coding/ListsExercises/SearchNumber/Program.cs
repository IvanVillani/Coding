using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SearchNumber
{
    class Program
    {
        static void Main(string[] args)
        {
            List<int> numbers = Console.ReadLine().Split(' ').Select(int.Parse).ToList();
            List<int> three = Console.ReadLine().Split(' ').Select(int.Parse).ToList();

            int test = 0;
            for (int i = three[0]; i < numbers.Count; i++)
            {
                numbers.RemoveAt(i);
                test++;
                if (test == numbers.Count + test - three[0])
                {
                    break;
                }
                i--;
            }

            int check = 0;
            for (int i = 0; i < numbers.Count; i++)
            {
                numbers.RemoveAt(i);
                check++;
                if (check == three[1])
                {
                    break;
                }
                i--;
            }
            bool ifExists = false;
            for (int i = 0; i < numbers.Count; i++)
            {
                if (three[2] == numbers[i])
                {
                    ifExists = true;
                }
            }

            if (ifExists)
            {
                Console.WriteLine("YES!");
            }
            else
            {
                Console.WriteLine("NO!");
            }
        }
    }
}
