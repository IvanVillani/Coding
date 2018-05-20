using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MagicLetter
{
    class Program
    {
        static void Main(string[] args)
        {
            string[] alpha = "A.B.C.D.E.F.G.H.I.J.K.L.M.N.O.P.Q.R.S.T.U.V.W.X.Y.Z".ToLower().Split('.');

            string a = Console.ReadLine();
            string b = Console.ReadLine();
            string check = Console.ReadLine();

            int first = 0;
            int second = 0;

            for (int i = 0; i <= alpha.Count() - 1; i++)
            {
                if (alpha[i] == a)
                {
                    first = i;
                }
                else if (alpha[i] == b)
                {
                    second = i;
                }
            }

            for (int i = first; i <= second; i++)
            {
                for (int j = first; j <= second; j++)
                {
                    for (int h = first; h <= second; h++)
                    {
                        if (alpha[i] != check && alpha[j] != check && alpha[h] != check)
                        {
                            Console.Write(alpha[i] + alpha[j] + alpha[h] + " ");

                        }
                        
                    }
                }
            }
            Console.WriteLine();
        }
    }
}
