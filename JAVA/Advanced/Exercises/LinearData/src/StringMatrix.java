import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class StringMatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split("\\W+");

        List<String> list = new ArrayList<>();

        int maxlength = 0;

        for (;;) {
            String in = scan.nextLine();
            if (in.equals("END")) {
                break;
            }else {
                if (in.length() > maxlength) {
                    maxlength = in.length();
                }
                list.add(in);
            }
        }

        String [] strr = MakeEqualLength(list, maxlength);


        int degrees = Integer.parseInt(input[1]);

        if ((degrees < 360 && degrees > 0) || degrees > 360) {
            if (degrees > 360) {
                int times = degrees / 360;
                degrees = degrees - (times * 360);
            }

            if (degrees == 90) {
                char [][] matrix = new char[maxlength][strr.length];
                for (int i = 0; i < maxlength; i++) {
                    for (int j = strr.length - 1, g = 0; j >= 0 && g < strr.length; j--, g++) {
                        matrix[i][g] = strr[j].charAt(i);
                    }
                }
                PrintMatrix(matrix);
            }else if (degrees == 180) {
                char [][] matrix = new char[strr.length][maxlength];
                for (int i = strr.length - 1, h = 0; i >= 0 && h < strr.length; i--, h++) {
                    for (int j = maxlength - 1, g = 0; j >= 0 && g < maxlength; j--, g++) {
                        matrix[h][g] = strr[i].charAt(j);
                    }
                }
                PrintMatrix(matrix);
            }else if (degrees == 270) {
                char [][] matrix = new char[maxlength][strr.length];
                for (int i = maxlength - 1, h = 0; i >= 0 && h < maxlength; i--, h++) {
                    for (int j = 0; j < strr.length; j++) {
                        matrix[h][j] = strr[j].charAt(i);
                    }
                }
                PrintMatrix(matrix);
            }else {
                char [][] matrix = new char[strr.length][maxlength];
                for (int i = 0; i < strr.length; i++) {
                    for (int j = 0; j < maxlength; j++) {
                        matrix[i][j] = strr[i].charAt(j);
                    }
                }
                PrintMatrix(matrix);
            }
        }else{
            char [][] matrix = new char[strr.length][maxlength];
            for (int i = 0; i < strr.length; i++) {
                for (int j = 0; j < maxlength; j++) {
                    matrix[i][j] = strr[i].charAt(j);
                }
            }
            PrintMatrix(matrix);
        }
    }

    private static String [] MakeEqualLength(List<String> list, int maxlength) {
        String [] strr = new String[list.size()];
        int index = 0;
        for (String str : list) {
            if (str.length() < maxlength) {
                int diff = maxlength - str.length();
                StringBuilder sb = new StringBuilder(str);
                for (int i = 0; i < diff; i++) {
                    sb.append(" ");
                }
                str = sb.toString();
                strr[index] = str;
                index++;
            }else {
                strr[index] = str;
                index++;
            }
        }

        return strr;
    }

    private static void PrintMatrix(char[][] matrix) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sb.append(matrix[i][j]);
            }
            System.out.println(sb.toString());
            sb = new StringBuilder();
        }
    }
}
