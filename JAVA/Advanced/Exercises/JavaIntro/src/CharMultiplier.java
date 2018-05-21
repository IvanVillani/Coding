import java.util.Scanner;

public class CharMultiplier {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String [] strr = scan.nextLine().split(" ");
        String longer;
        String shorter;

        if (strr[0].length() > strr[1].length()) {
            longer = strr[0];
            shorter = strr[1];
        }else {
            shorter = strr[0];
            longer = strr[1];
        }

        int diff = longer.length() - shorter.length();
        long sum = 0;

        for (int i = 0; i < shorter.length(); i++) {
            sum+=shorter.charAt(i) * longer.charAt(i);
        }
        if (diff > 0) {
            for (int i = longer.length() - 1; i > longer.length()-(diff+1); i--) {
                sum+=longer.charAt(i);
            }
        }
        System.out.printf("%d", sum);
    }
}
