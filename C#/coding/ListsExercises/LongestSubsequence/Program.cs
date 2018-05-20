
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace LongestSubsequence
{
    class Program
    {
        static void Main(string[] args)
        {
            List<int> input = Console.ReadLine().Split(' ').Select(int.Parse).ToList();
            List<int> changed = new List<int>();
            List<int> temp = new List<int>();
            int checkEqual = 1;
            for (int g = 1; g < input.Count; g++)
            {
                if (input[0] == input[g])
                {
                    checkEqual++;
                }
            }
            if (checkEqual == input.Count)
            {
                Console.WriteLine(input[0]);
            }
            else
            {
                for(int i = 0; i < input.Count; i++)
            {
                    if (i == 0)
                    {
                        changed.Add(input[i]);
                    }
                    else
                    {
                        if (temp.Count != 0)
                        {
                            if (input[i] > temp[temp.Count - 1])
                            {
                                temp.Add(input[i]);


                            }
                            else
                            {
                                if (input[i] < temp[temp.Count - 1] && input[i] > temp[temp.Count - 2])
                                {
                                    bool checkForBigger = false;
                                    int moreThan1 = 0;
                                    for (int h = i + 1; h < input.Count; h++)
                                    {
                                        if (input[h] > input[i])
                                        {
                                            checkForBigger = true;
                                            moreThan1++;
                                        }
                                    }
                                    if (checkForBigger && moreThan1 > 1)
                                    {
                                        temp.RemoveAt(temp.Count - 1);
                                        temp.Add(input[i]);
                                    }
                                    
                                }
                                
                            }
                        }
                        if (input[i] > changed[changed.Count - 1])
                        {
                            changed.Add(input[i]);

                        }
                        else
                        {
                            if (input[i] < changed[changed.Count - 1] && i == 1)
                            {
                                changed.RemoveAt(i - 1);
                                changed.Add(input[i]);
                            }
                            else
                            {
                                if (input[i] < changed[changed.Count - 1] && input[i] < changed[changed.Count - 1] && !temp.Any())
                                {
                                    for (int j = 0; j < changed.Count; j++)
                                    {
                                        if (changed[j] >= input[i])
                                        {

                                            break;
                                        }
                                        else
                                        {
                                            temp.Add(changed[j]);
                                        }
                                    }
                                    temp.Add(input[i]);
                                }
                                else if (input[i] < changed[changed.Count - 1] && input[i] > changed[changed.Count - 2])
                                {
                                    bool checkForBigger = false;
                                    int moreThan1 = 0;
                                    for (int h = i + 1; h < input.Count; h++)
                                    {
                                        if (input[h] > input[i])
                                        {
                                            checkForBigger = true;
                                        }
                                    }
                                    if (checkForBigger && moreThan1 > 1)
                                    {
                                        changed.RemoveAt(changed.Count - 1);
                                        changed.Add(input[i]);
                                    }
                                }
                            }
                        }
                    }
                    if (temp.Count > changed.Count)
                    {
                        for (int j = 0; j < temp.Count; j++)
                        {
                            if (j <= changed.Count - 1)
                            {
                                changed[j] = temp[j];
                            }
                            else
                            {
                                changed.Add(temp[j]);
                            }
                        }
                        temp.Clear();
                    }
                }
                Console.WriteLine(String.Join(" ", changed));
            }
            
            
        }
            
            
        
    }
}
