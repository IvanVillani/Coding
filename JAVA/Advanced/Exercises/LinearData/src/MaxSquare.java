import java.util.Scanner;

public class MaxSquare {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String [] arr = scan.nextLine().split(" ");

        int rows = Integer.parseInt(arr[0]);
        int cols = Integer.parseInt(arr[1]);

        int [][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            String [] input = scan.nextLine().split(" ");
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = Integer.parseInt(input[j]);
            }
        }

        int startRow = 0;
        int startCol = 0;
        int max = 0;

        for (int i = 0; i < rows - 2; i++) {
            for (int j = 0; j < cols - 2; j++) {
                int curr = Calculate(matrix,i, j);

                if (curr > max) {
                    max = curr;
                    startRow = i;
                    startCol = j;
                }
            }
        }

        System.out.println("Sum = " + max);
        PrintMatrix(matrix, startRow, startCol);


    }

    private static void PrintMatrix(int[][] matrix, int startRow, int startCol) {
        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int Calculate(int[][] matrix, int row, int col) {
        int sum = 0;

        for (int i = row; i < row + 3; i++) {
            for (int j = col; j < col + 3; j++) {
                sum += matrix[i][j];
            }
        }

        return sum;
    }
}
