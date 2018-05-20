import java.util.Scanner;

public class IsVowel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        if (tryParse(input)) {
            System.out.println("digit");
        }else {
            switch (input) {
                case "a":
                    System.out.println("vowel");
                    break;
                case "e":
                    System.out.println("vowel");
                    break;
                case "u":
                    System.out.println("vowel");
                    break;
                case "i":
                    System.out.println("vowel");
                    break;
                case "o":
                    System.out.println("vowel");
                    break;
                default:
                    System.out.println("other");
                    break;

            }
        }

    }
    static boolean tryParse(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}
