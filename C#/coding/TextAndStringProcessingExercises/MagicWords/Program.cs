using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MagicWords
{
    class Program
    {
        static void Main(string[] args)
        {
            string[] input = Console.ReadLine().Trim().Split(new char[] { ' ' }, StringSplitOptions.RemoveEmptyEntries).ToArray();
            string str1 = input[0];
            string str2 = input[1];
            long maxLength = GetMaxLength(str1, str2);

            Dictionary<char, char> map = new Dictionary<char, char>();

            if (maxLength == -1)
            {
                bool check = true;
                for (int i = 0; i <= str1.Length - 1; i++)
                {
                    if (map.ContainsKey(str1[i]))
                    {
                        if (map[str1[i]] != str2[i])
                        {
                            check = false;
                            break;
                        }
                    }
                    else
                    {
                        if (map.ContainsValue(str2[i]))
                        {
                            check = false;
                            break;
                        }
                        map[str1[i]] = str2[i];
                    }
                }

                if (check) { Console.WriteLine("true"); }
                else { Console.WriteLine("false"); }
            }
            else if (maxLength == str1.Length)
            {
                bool check = true;
                for (int i = 0; i <= str2.Length - 1; i++)
                {
                    if (map.ContainsKey(str2[i]))
                    {
                        if (map[str2[i]] != str1[i])
                        {
                            check = false;
                            break;
                        }
                    }
                    else
                    {
                        if (map.ContainsValue(str1[i]))
                        {
                            check = false;
                            break;
                        }
                        map[str2[i]] = str1[i];
                    }
                }

                if (check)
                {
                    int index = str1.Length - (str1.Length - str2.Length);
                    for (int i = index; i <= str1.Length - 1; i++)
                    {
                        if (!map.ContainsValue(str1[i]))
                        {
                            check = false;
                        }
                    }
                    if (check)
                    {
                        Console.WriteLine("true");
                    }
                    else
                    {
                        Console.WriteLine("false");
                    }
                }
                else
                {
                    Console.WriteLine("false");
                }
            }
            else if (maxLength == str2.Length)
            {
                bool check = true;
                for (int i = 0; i <= str1.Length - 1; i++)
                {
                    if (map.ContainsKey(str1[i]))
                    {
                        if (map[str1[i]] != str2[i])
                        {
                            check = false;
                            break;
                        }
                    }
                    else
                    {
                        if (map.ContainsValue(str2[i]))
                        {
                            check = false;
                            break;
                        }
                        map[str1[i]] = str2[i];
                    }
                }

                if (check)
                {
                    int index = str2.Length - (str2.Length - str1.Length);
                    for (int i = index; i <= str2.Length - 1; i++)
                    {
                        if (!map.ContainsValue(str2[i]))
                        {
                            check = false;
                            break;
                        }
                    }
                    if (check)
                    {
                        Console.WriteLine("true");
                    }
                    else
                    {
                        Console.WriteLine("false");
                    }
                }
                else
                {
                    Console.WriteLine("false");
                }
            }
        }

        static long GetMaxLength(string str1, string str2)
        {
            if (str1.Length > str2.Length)
            {
                return str1.Length;
            }
            else if (str1.Length == str2.Length)
            {
                return -1;
            }
            else
            {
                return str2.Length;
            }
        }
    }
}
