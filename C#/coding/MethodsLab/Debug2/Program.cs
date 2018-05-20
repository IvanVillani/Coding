using System;

class PriceChangeAlert
{
    static void Main()
    {
        int n = int.Parse(Console.ReadLine());
        double threshold = double.Parse(Console.ReadLine());
        double last = double.Parse(Console.ReadLine());

        for (int i = 0; i < n - 1; i++)
        {
            double input = double.Parse(Console.ReadLine());
            double diff = Proc(last, input);
            bool isSignificantDifference = imaliDif(diff, threshold);
            string message = Get(input, last, diff, isSignificantDifference);
            Console.WriteLine(message);

            last = input;
        }
    }

    private static string Get(double input, double last, double diff, bool etherTrueOrFalse)
    {
        string to = "";
        if (diff == 0)
        {
            to = string.Format("NO CHANGE: {0}", input);
           
        }
        else if (!etherTrueOrFalse)
        {
            to = string.Format("MINOR CHANGE: {0} to {1} ({2:F2}%)", last, input, diff*100);
        }
        else if (etherTrueOrFalse && (diff > 0))
        {
            to = string.Format("PRICE UP: {0} to {1} ({2:F2}%)", last, input, diff*100);
        }
        else if (etherTrueOrFalse && (diff < 0))
            to = string.Format("PRICE DOWN: {0} to {1} ({2:F2}%)", last, input, diff*100);
        return to;
    }

    private static bool imaliDif(double diff, double threshold)
    {
        if (Math.Abs(diff) >= threshold)
        {
            return true;
        }
        return false;
    }

    private static double Proc(double last, double input)
    {
        double diff = (input - last) / last;
        return diff;
    }
}
