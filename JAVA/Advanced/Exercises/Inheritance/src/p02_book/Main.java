package p02_book;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.instrument.IllegalClassFormatException;
import java.lang.reflect.Method;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        String author = reader.readLine();
        String title = reader.readLine();
        double price = Double.parseDouble(reader.readLine());

        try {
            Book book = new Book(title, author, price);
            GoldenEditionBook goldenEditionBook = new GoldenEditionBook(title, author, price);
            Method[] goldenBookDeclaredMethods =
                    GoldenEditionBook.class.getDeclaredMethods();

            if (goldenBookDeclaredMethods.length > 1) {
                throw new IllegalClassFormatException(
                        "Code duplication in GoldenEditionBook!");
            }

            System.out.println(book.toString());
            System.out.println(goldenEditionBook.toString());
        }catch (IllegalArgumentException | IllegalClassFormatException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
