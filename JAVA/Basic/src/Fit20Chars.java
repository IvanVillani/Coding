import java.util.Scanner;

public class Fit20Chars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();

        if (str.length() >= 20) {
            System.out.println(str.substring(0, 20));
        } else {
            System.out.println(PadRight(str, 20, '*'));
        }
    }

    private static String PadRight(String s, Integer len, Character del) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < len; i++) {
            if (i <= s.length()-1) {
                sb.append(s.charAt(i));
            }else {
                sb.append(del);
            }
        }
        return sb.toString();
    }
}
