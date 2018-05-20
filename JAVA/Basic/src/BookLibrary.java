import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;

public class BookLibrary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        TreeMap<String, Double> data = new TreeMap<>();


        for (int i = 0; i < n; i++) {
            String[] arr = scan.nextLine().split(" ");
            Book book = new Book(arr[0], arr[1], arr[2], arr[3], arr[4], Double.parseDouble(arr[5]));
            if (!data.containsKey(book.getAuthor())) {
                data.put(book.getAuthor(), 0.0);
            }
            double current = data.get(book.getAuthor());
            data.put(book.getAuthor(), current + book.getPrice());
        }

        data
                .entrySet()
                .stream()
                .sorted((e1, e2) -> {
                    int compare = e2.getValue().compareTo(e1.getValue());
                    if (compare == 0) {
                        return  e1.getKey().compareTo(e2.getKey());
                    }else {
                        return compare;
                    }
                })
                .forEach(e -> System.out.printf("%s -> %.2f%n", e.getKey(), e.getValue()));


    }

    public static class Book {
        private String title;
        private String author;
        private String publisher;
        private String date;
        private String ISBN;
        private Double price;

        public Book(String title, String author, String publisher, String date, String isbn, Double price) {
            this.title = title;
            this.author = author;
            this.publisher = publisher;
            this.date = date;
            ISBN = isbn;
            this.price = price;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public String getPublisher() {
            return publisher;
        }

        public void setPublisher(String publisher) {
            this.publisher = publisher;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getISBN() {
            return ISBN;
        }

        public void setISBN(String ISBN) {
            this.ISBN = ISBN;
        }

        public Double getPrice() {
            return price;
        }

        public void setPrice(Double price) {
            this.price = price;
        }
    }

    public static class Library {
        private String name;
        private List<Book> books;

        public Library(String name, List<Book> books) {
            this.name = name;
            this.books = books;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<Book> getBooks() {
            return books;
        }

        public void setBooks(List<Book> books) {
            this.books = books;
        }
    }
}
