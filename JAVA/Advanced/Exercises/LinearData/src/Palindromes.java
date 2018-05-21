import java.util.Scanner;

public class Palindromes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String [] arr = scan.nextLine().split("\\s+");

        int row = Integer.parseInt(arr[0]);
        int col = Integer.parseInt(arr[1]);

        String [][] matrix = FillTypeA(row, col);



        PrintMatrix(matrix);


    }

    private static void PrintMatrix(String[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static String[][] FillTypeA(int row, int col) {
        String [][] matrix = new String[row][col];
        int side = 97;
        int middle;
        StringBuilder sb = new StringBuilder();

        for (int r = 0; r < row; r++, side++) {
            middle = side;
            for (int c = 0; c < col; c++, middle++) {
                sb.append((char)side).append((char)middle).append((char)side);
                matrix[r][c] = sb.toString();
                sb = new StringBuilder();
            }

        }
        return  matrix;
    }


}
