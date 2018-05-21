import java.util.Scanner;

public class DiffDiagonals {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int [][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            String [] arr = scan.nextLine().split(" ");
            for (int j = 0; j < n; j++) {
                matrix[i][j] = Integer.parseInt(arr[j]);
            }
        }

        int first = 0;
        for (int i = 0; i < n; i++) {
            first += matrix[i][i];
        }

        int second = 0;
        for (int i = 0; i < n; i++) {
            second += matrix[i][n-1-i];
        }

        int diff = Math.abs(first - second);

        System.out.println(diff);

    }
}
