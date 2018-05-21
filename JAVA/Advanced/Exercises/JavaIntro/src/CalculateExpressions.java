import java.util.Scanner;

public class CalculateExpressions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();

        double f1 = Math.pow((Math.pow(a, 2) + Math.pow(b, 2))/
                (Math.pow(a, 2) - Math.pow(b, 2)), ((a+b+c)/Math.sqrt(c)));

        double f2 = Math.pow((Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 3)), (a-b));

        double f3 = Math.abs((a+b+c)/3 - (f1+f2)/2);

        System.out.printf("F1 result: %.2f; F2 result: %.2f; Diff: %.2f",f1,f2,f3);

    }
}
