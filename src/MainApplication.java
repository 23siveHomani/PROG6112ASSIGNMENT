import java.util.Scanner;

public class MainApplication {

    private static Library library = new Library();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            displayInitialMenu();
            String choice = scanner.nextLine();
            if (!choice.equals("1")) {
                System.out.println("Exiting application. Goodbye!");
                break;
            }
            processMainMenu();
        }
    }

    private static void displayInitialMenu() {
        System.out.println("LIBRARY MANAGEMENT SYSTEM");
        System.out.println("*");
        System.out.println("Enter (1) to launch menu or any other key to exit");
    }

    private static void displayMainMenu() {
        System.out.println("\nPlease select one of the following menu items:");
        System.out.println("(1) Add a new book.");
        System.out.println("(2) Search for a book.");
        System.out.println("(3) Delete a book.");
        System.out.println("(4) Print book report.");
        System.out.println("(5) Exit Application.");
    }

    private static void processMainMenu() {
        while (true) {
            displayMainMenu();
            System.out.print("Enter your choice: ");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    addNewBook();
                    break;
                case "2":
                    searchForBook();
                    break;
                case "3":
                    deleteBook();
                    break;
                case "4":
                    library.printReport();
                    break;
                case "5":
                    System.out.println("Exiting application. Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            System.out.print("Enter (1) to launch menu or any other key to exit: ");
            if (!scanner.nextLine().equals("1")) {
                return;
            }
        }
    }

    private static void addNewBook() {
        System.out.print("Enter book title: ");
        String title = scanner.nextLine();
        System.out.print("Enter book author: ");
        String author = scanner.nextLine();
        System.out.print("Enter book ISBN: ");
        String isbn = scanner.nextLine();
        // Use the custom Book class here
        Book book = new Book(title, author, isbn);
        library.addBook(book);
        System.out.println("Book added successfully!");
    }

    private static void searchForBook() {
        System.out.print("Enter book title to search: ");
        String title = scanner.nextLine();
        Book book = library.searchBook(title);
        if (book != null) {
            System.out.println("Book found: " + book);
        } else {
            System.out.println("No book found with the title: " + title);
        }
    }

    private static void deleteBook() {
        System.out.print("Enter book title to delete: ");
        String title = scanner.nextLine();
        if (library.deleteBook(title)) {
            System.out.println("Book deleted successfully!");
        } else {
            System.out.println("No book found with the title: " + title);
        }
    }
}