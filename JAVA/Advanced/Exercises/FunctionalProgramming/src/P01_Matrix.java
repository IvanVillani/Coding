import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;

public class P01_Matrix {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        int n = Integer.parseInt(reader.readLine());

        String[] commands = reader.readLine().split(", ");

        int[][] matrix = new int[n][n];
        int[] pos = new int[2];
        int food = 0;

        for (int i = 0; i < n; i++) {
            String[] input = reader.readLine().split(" ");
            for (int j = 0; j < n; j++) {
                if ("s".equals(input[j])) {
                    pos[0] = i;
                    pos[1] = j;
                    matrix[i][j] = 0;
                }else if ("f".equals(input[j])){
                    food++;
                    matrix[i][j] = 1;
                }else if ("e".equals(input[j])){
                    matrix[i][j] = 2;
                }else {
                    matrix[i][j] = 0;
                }
            }
        }
        int snake = 1;
        for (String command : commands) {
            switch (command) {
                case "up":
                    pos[0] = pos[0] - 1;
                    if (pos[0] < 0) {
                        pos[0] = n-1;
                    }
                    break;
                case "down":
                    pos[0] = pos[0] + 1;
                    if (pos[0] == n) {
                        pos[0] = 0;
                    }
                    break;
                case "left":
                    pos[1] = pos[1] - 1;
                    if (pos[1] < 0) {
                        pos[1] = n-1;
                    }
                    break;
                case "right":
                    pos[1] = pos[1] + 1;
                    if (pos[1] == n) {
                        pos[1] = 0;
                    }
                    break;
                    default:
                        break;
            }
            if (matrix[pos[0]][pos[1]] == 1) {
                food--;
                snake++;
                if (food == 0) {
                    System.out.printf("You win! Final snake length is %d%n", snake);
                    return;
                }
            }else if (matrix[pos[0]][pos[1]] == 2) {
                System.out.println("You lose! Killed by an enemy!");
                return;
            }
        }

        if (food > 0) {
            System.out.printf("You lose! There is still %d food to be eaten.", food);
        }
    }
}
