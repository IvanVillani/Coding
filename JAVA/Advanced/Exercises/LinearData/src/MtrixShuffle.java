import java.util.Scanner;

public class MtrixShuffle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String [] arr = scan.nextLine().split(" ");

        int rows = Integer.parseInt(arr[0]);
        int cols = Integer.parseInt(arr[1]);

        String [][] matrix = new String[rows][cols];

        for (int i = 0; i < rows; i++) {
            String [] input = scan.nextLine().split(" ");
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = input[j];
            }
        }

        for (;;) {
            String[] input = scan.nextLine().split(" ");
            if (input.length == 5 && input[0].equals("swap") &&
                    Integer.parseInt(input[1]) <= rows &&
                    Integer.parseInt(input[2]) <= cols &&
                    Integer.parseInt(input[3]) <= rows &&
                    Integer.parseInt(input[4]) <= cols){
                String temp = "";
                String first = matrix[Integer.parseInt(input[1])][Integer.parseInt(input[2])];
                String second = matrix[Integer.parseInt(input[3])][Integer.parseInt(input[4])];
                temp = first;
                matrix[Integer.parseInt(input[1])][Integer.parseInt(input[2])] = second;
                matrix[Integer.parseInt(input[3])][Integer.parseInt(input[4])] = temp;

                PrintMatrix(matrix);


            }else if (input[0].equals("END")) {
                break;
            }else {
                System.out.println("Invalid input!");
            }
        }
    }

    private static void PrintMatrix(String[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

}
