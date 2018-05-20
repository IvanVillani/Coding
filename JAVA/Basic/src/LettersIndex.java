import java.util.Scanner;

public class LettersIndex {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char[] arr = scan.nextLine().toLowerCase().toCharArray();

        for (char c : arr) {
            int index = c - 97;
            System.out.printf("%s -> %d%n", String.valueOf(c), index);
        }
    }
}
