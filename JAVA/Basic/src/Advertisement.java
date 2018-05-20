import java.util.Random;
import java.util.Scanner;

public class Advertisement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        Random ran = new Random();

        String [] phrases = new String[] {
                "Excellent product.", "Such a great product.", "I always use that product.", "Best product of its category.", "Exceptional product.", "I can't live without this product."
        };

        String [] events = new String[] {
                "Now I feel good.", "I have succeeded with this product.", "Makes miracles. I am happy of the results!", "I cannot believe but now I feel awesome.", "Try it yourself, I am very satisfied.", "I feel great!"        };

        String [] authors = new String[] {
                "Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"
        };

        String [] cities = new String[] {
                "Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"
        };


        for (int i = 0; i < n; i++) {
            int phrase = ran.nextInt(6);
            int event = ran.nextInt(6);
            int author = ran.nextInt(8);
            int city = ran.nextInt(5);

            System.out.printf("%s %s %s - %s%n",
                    phrases[phrase],
                    events[event],
                    authors[author],
                    cities[city]
                    );
        }


    }
}
