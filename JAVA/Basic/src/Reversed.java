import java.util.Scanner;

public class Reversed {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 3; i++) {
            sb.append(scan.nextLine());
        }
        StringBuilder sss = new StringBuilder();
        for (int i = 2; i >= 0; i--) {
            sss.append(sb.charAt(i));
        }
        System.out.println(sss.toString());

    }
}
