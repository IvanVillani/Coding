import java.util.Scanner;

public class CensorEmails {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        String[] arr = input.split("@");
        String text = scan.nextLine();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < arr[0].length(); i++) {
            sb.append('*');
        }
        sb.append('@');
        sb.append(arr[1]);
        text = text.replaceAll(input, sb.toString());

        System.out.println(text);
    }
}
