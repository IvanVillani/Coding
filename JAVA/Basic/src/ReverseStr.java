import java.util.Scanner;

public class ReverseStr {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();

        StringBuilder sb = new StringBuilder();

        for (int i = str.length() - 1; i >= 0 ; i--) {
            sb.append(str.charAt(i));
        }

        System.out.println(sb.toString());
    }
}