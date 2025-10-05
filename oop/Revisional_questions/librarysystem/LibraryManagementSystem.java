package Revisional_questions.librarysystem;

import java.util.Scanner;
import java.util.ArrayList;

public class LibraryManagementSystem {
    private Scanner scanner = new Scanner(System.in);
    private ArrayList<book> books = new ArrayList<>();
    private int nextId = 1; // Auto-increment book ID

    public static void main(String[] args) {
        LibraryManagementSystem system = new LibraryManagementSystem();
        system.run();
    }

    // Main loop
    public void run() {
        while (true) {
            System.out.println("\n===== Library Management System =====");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    addBook();
                    break;
                case 2:
                    viewBooks();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    // Add a book
    private void addBook() {
        System.out.print("Enter book title: ");
        String title = scanner.nextLine();
        System.out.print("Enter author name: ");
        String author = scanner.nextLine();

        books.add(new book(nextId++, title, author, false));
        System.out.println("Book added");
    }

    // View all books
    private void viewBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
        } else {
            System.out.println("\n📚 List of Books:");
            for (book b : books) {
                System.out.println(b);
            }
        }
    }
}
