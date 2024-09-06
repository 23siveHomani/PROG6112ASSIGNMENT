import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    Scanner scanner = new Scanner(System.in);

    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public Book searchBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    public boolean deleteBook(String title) {
        Book book = searchBook(title);
        if (book != null) {
            books.remove(book);
            return true;
        }
        return false;
    }

    public void printReport() {
        if (books.isEmpty()) {
            System.out.println("No books available in the library.");
        } else {
            System.out.println("Library Report:");
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }
}