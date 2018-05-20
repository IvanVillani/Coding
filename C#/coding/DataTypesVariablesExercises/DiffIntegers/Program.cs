using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DiffIntegers
{
    class Program
    {
        static void Main(string[] args)
        {
            string input = Console.ReadLine();
            try
            {
                long number = long.Parse(input);

                List<string> types = new List<string>();

                if (number >= sbyte.MinValue && number <= sbyte.MaxValue)
                {
                    types.Add("sbyte");
                }
                if (number >= byte.MinValue && number <= byte.MaxValue)
                {
                    types.Add("byte");
                }
                if (number >= short.MinValue && number <= short.MaxValue)
                {
                    types.Add("short");
                }
                if (number >= ushort.MinValue && number <= ushort.MaxValue)
                {
                    types.Add("ushort");
                }
                if (number >= int.MinValue && number <= int.MaxValue)
                {
                    types.Add("int");
                }
                if (number >= uint.MinValue && number <= uint.MaxValue)
                {
                    types.Add("uint");
                }
                if (number >= long.MinValue && number <= long.MaxValue)
                {
                    types.Add("long");
                }
                Console.WriteLine("{0} can fit in: ", number);
                for (int i = 0; i < types.Count; i++)
                {
                    Console.WriteLine("* {0} ", types[i]);
                }

            }
            catch (OverflowException)
            {
                Console.WriteLine("{0} can't fit in any type ", input);

            }


        }
    }
}
