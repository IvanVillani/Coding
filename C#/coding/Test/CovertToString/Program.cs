using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CovertToString
{
    class Program
    {
        static void Main(string[] args)
        {
            List<int> list = Console.ReadLine().Split().Select(int.Parse).ToList();
            GetCombination(list);
        }

        static void GetCombination(List<int> list)
        {
            List<int> before = new List<int>();
            List<int> current = new List<int>();

            double count = Math.Pow(2, list.Count);
            for (int i = 1; i <= count - 1; i++)
            {
                string str = Convert.ToString(i, 2).PadLeft(list.Count, '0');
                for (int j = 0; j < str.Length; j++)
                {
                    if (str[j] == '1')
                    {
                        current.Add(list[j]);
                    }
                }
                bool checker = true;
                if (current.Count > 1)
                {
                    for (int h = 1; h < current.Count; h++)
                    {
                        if (current[h] > current[h - 1])
                        {

                        }
                        else
                        {
                            checker = false;
                        }
                    }
                }


                if (current.Count >= before.Count && checker)
                {
                    before.Clear();
                    for (int g = 0; g < current.Count; g++)
                    {
                        before.Add(current[g]);
                    }
                }
                current.Clear();
            }

            Console.WriteLine(String.Join(" ", before));
        }
    }
}
