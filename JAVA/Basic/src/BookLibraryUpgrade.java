import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;

public class BookLibraryUpgrade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        ArrayList<Book> list = new ArrayList<>();
        TreeMap<String, LocalDate> data = new TreeMap<>();


        for (int i = 0; i < n; i++) {
            String[] arr = scan.nextLine().split(" ");
            Book book = new Book(arr[0], arr[1], arr[2], LocalDate.parse(arr[3], DateTimeFormatter.ofPattern("dd.MM.yyyy")), arr[4], Double.parseDouble(arr[5]));
            list.add(book);
        }
        LocalDate endDate = LocalDate.parse(scan.nextLine(), DateTimeFormatter.ofPattern("dd.MM.yyyy"));

        for (Book book : list) {
            if (book.getDate().isAfter(endDate)) {
                data.put(book.getTitle(), book.getDate());
            }
        }

        data
                .entrySet()
                .stream()
                .sorted((e1, e2) -> {
                    int compare = e1.getValue().compareTo(e2.getValue());
                    if (compare == 0) {
                        return  e1.getKey().compareTo(e2.getKey());
                    }else {
                        return compare;
                    }
                })
                .forEach(e -> System.out.printf("%s -> %s%n", e.getKey(), e.getValue().format(DateTimeFormatter.ofPattern("dd.MM.yyyy"))));


    }

    public static class Book {
        private String title;
        private String author;
        private String publisher;
        private LocalDate date;
        private String ISBN;
        private Double price;

        public Book(String title, String author, String publisher, LocalDate date, String isbn, Double price) {
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

        public LocalDate getDate() {
            return date;
        }

        public void setDate(LocalDate date) {
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
