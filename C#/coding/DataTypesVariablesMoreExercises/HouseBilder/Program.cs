using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HouseBilder
{
    class Program
    {
        static void Main(string[] args)
        {
            string first = Console.ReadLine();
            string second = Console.ReadLine();
            sbyte sbyteValue = 0;
            int intValue = 0;
            bool check = sbyte.TryParse(first, out sbyteValue);
            if (check)
            {
                sbyteValue = sbyte.Parse(first);
                intValue = int.Parse(second);
            }
            else
            {
                sbyteValue = sbyte.Parse(second);
                intValue = int.Parse(first);
            }
            long result = (long)intValue * 10 + 4 * sbyteValue;
            Console.WriteLine(result);
        }
    }
}
