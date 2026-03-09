import java.util.*;

class Book {
    int bookId;
    String title;
    String author;
    boolean isAvailable;

    Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    void display() {
        String status = isAvailable ? "Available" : "Borrowed";
        System.out.println("ID: " + bookId + " | Title: " + title + " | Author: " + author + " | Status: " + status);
    }

    void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Successfully borrowed: " + title);
        } else {
            System.out.println("Sorry, " + title + " is already borrowed.");
        }
    }

    void returnBook() {
        isAvailable = true;
        System.out.println("Returned: " + title);
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Book> library = new ArrayList<>();
        int choice;

        do {
            System.out.println("\n--- Library Menu ---");
            System.out.println("1. Add Book\n2. Display All\n3. Borrow Book\n4. Return Book\n5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: "); int id = sc.nextInt();
                    sc.nextLine(); // consume newline
                    System.out.print("Enter Title: "); String t = sc.nextLine();
                    System.out.print("Enter Author: "); String a = sc.nextLine();
                    library.add(new Book(id, t, a));
                    break;
                case 2:
                    for (Book b : library) b.display();
                    break;
                case 3:
                    System.out.print("Enter Book ID to borrow: ");
                    int bid = sc.nextInt();
                    for (Book b : library) if (b.bookId == bid) b.borrowBook();
                    break;
                case 4:
                    System.out.print("Enter Book ID to return: ");
                    int rid = sc.nextInt();
                    for (Book b : library) if (b.bookId == rid) b.returnBook();
                    break;
            }
        } while (choice != 5);
        sc.close();
    }
}