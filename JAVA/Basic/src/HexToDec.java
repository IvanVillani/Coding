import java.util.Scanner;

public class HexToDec {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        int hex = Integer.parseInt(input, 16);
        System.out.println(hex);
    }
}
