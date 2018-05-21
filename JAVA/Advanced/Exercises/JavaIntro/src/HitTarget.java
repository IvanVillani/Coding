import java.util.Scanner;

public class HitTarget {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        for (int i = 1; i < 21; i++) {

            for (int j = 1; j < 21; j++) {
                if (i + j == n) {
                    System.out.printf("%d + %d = %d%n", i, j, n);
                }else if (i - j == n){
                    System.out.printf("%d - %d = %d%n", i, j, n);
                }
            }
        }
    }
}
