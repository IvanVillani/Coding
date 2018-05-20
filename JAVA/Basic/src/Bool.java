import java.util.Scanner;

public class Bool {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        boolean boo = Boolean.parseBoolean(input);
        if (boo) {
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
