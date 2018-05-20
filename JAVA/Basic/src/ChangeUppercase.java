import java.util.Scanner;

public class ChangeUppercase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String text = scan.nextLine();


        while (text.contains("<upcase>")) {
            int startIndex = text.indexOf("<upcase>") + 8;
            int endIndex = text.indexOf("</upcase>");

            String lower = text.substring(startIndex, endIndex);
            String replacer = "<upcase>" + lower + "</upcase>";

            text = text.replace(replacer, lower.toUpperCase());

        }

        System.out.println(text);
    }
}
