import java.util.Scanner;

public class FillMatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String [] arr = scan.nextLine().split("\\W+");

        int n = Integer.parseInt(arr[0]);
        int [][] matrix;

        if (arr[1].equals("A")) {
            matrix = FillTypeA(n);
        }else {
            matrix = FillTypeB(n);
        }

        PrintMatrix(matrix);


    }

    private static void PrintMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] FillTypeA(int n) {
        int [][] matrix = new int[n][n];
        int filler = 1;
        for (int col = 0; col < n; col++) {
            for (int row = 0; row < n; row++) {
                matrix[row][col] = filler;
                filler++;
            }
        }
        return  matrix;
    }

    private static int[][] FillTypeB(int n) {
        int [][] matrix = new int[n][n];
        int filler = 1;
        for (int col = 0; col < n; col++) {
            if (col == 0 || col % 2 == 0) {
                for (int row = 0; row < n; row++) {
                    matrix[row][col] = filler;
                    filler++;
                }
            }else {
                for (int row = n-1; row >= 0; row--) {
                    matrix[row][col] = filler;
                    filler++;
                }
            }
        }
        return  matrix;
    }
}
