import java.util.Scanner;

public class FormattingNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstNumber = scan.nextInt();

        double secondNumber = scan.nextDouble();
        double thirdNumber = scan.nextDouble();

        System.out.printf("|%-10X|%s|%10.2f|%-10.3f|",
                firstNumber,
                String.format("%10s", Integer.toBinaryString(firstNumber)).replace(' ', '0'),
                secondNumber,
                thirdNumber);

    }

}

