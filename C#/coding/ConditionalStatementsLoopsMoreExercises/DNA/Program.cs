using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DNA
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            string s = "A C G T";
            string [] arr = s.Split(' ');
            string output = "";
            int sum = 0;
            int check = 0;
            int first = 0;
            int second = 0;
            int third = 0;



            for (int i = 0; i < arr.Count(); i++)
            {
                
                if (arr[i] == "A")
                {
                    first = 1;
                }
                else if (arr[i] == "C")
                {
                    first = 2;
                }
                else if (arr[i] == "G")
                {
                    first = 3; 
                }
                else if (arr[i] == "T")
                {
                    first = 4;
                }
                for (int j = 0; j < arr.Count(); j++)
                {
                    
                    if (arr[j] == "A")
                    {
                        second = 1;
                    }
                    else if (arr[j] == "C")
                    {
                        second = 2;
                    }
                    else if (arr[j] == "G")
                    {
                        second = 3;
                    }
                    else if (arr[j] == "T")
                    {
                        second = 4;
                    }
                    for (int h = 0; h < arr.Count(); h++)
                    {
                        output = arr[i] + arr[j] + arr[h];


                        if (arr[h] == "A")
                        {
                            third = 1;
                        }
                        else if (arr[h] == "C")
                        {
                            third = 2;
                        }
                        else if (arr[h] == "G")
                        {
                            third = 3;
                        }
                        else if (arr[h] == "T")
                        {
                            third = 4;
                        }
                        sum = first + second + third;

                        if (sum >= n)
                        {
                            Console.Write("O" + output + "O ");
                            check++;
                            if (check == 4)
                            {
                                check = 0;
                                Console.WriteLine();
                            }
                            sum = 0;
                            output = "";
                        }
                        else
                        {
                            Console.Write("X" + output + "X ");
                            check++;
                            if (check == 4)
                            {
                                check = 0;
                                Console.WriteLine();
                            }
                            sum = 0;
                            output = "";
                        }

                    }
                }
            }
        }
    }
}
