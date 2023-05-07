import java.util.ArrayList;
import java.util.Scanner;

public class Catalog {
    
    public ArrayList<Book> libraryBooks;

    //Catalog constructor
    public Catalog(){
        this.libraryBooks = new ArrayList<>();
    }

    //A method for adding books
    public void add_book(Book book){
        libraryBooks.add(book);
    }

    //A method for viewing books
    public void view_books(){
        for(Book book : libraryBooks){
            book.display_book_info();
        }
    }

//A method for allowing a user to add books
    public void userAddBook(){
    Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter book information\n");

        System.out.println("Title: ");
        String title = scanner.nextLine();

        System.out.println("Author: ");
        String author = scanner.nextLine();

        System.out.println("ISBN: ");
        String isbn = scanner.nextLine();

        System.out.println("Publisher: ");
        String publisher = scanner.nextLine();

        System.out.println("Year");
        int year = scanner.nextInt();

        System.out.println("Book Pages: ");
        int num_pages = scanner.nextInt();

        System.out.println("Price: ");
        float price = scanner.nextFloat();

        Book book = new Book(title, author, isbn, publisher, year, num_pages, price);
        libraryBooks.add(book);

        System.out.println("\nYour book has been added successfully!!!");
    }

    public static void main(String[] args) {
        Catalog libraryCatalog = new Catalog();

        // Catalog objects that add book to the book list
        libraryCatalog.add_book(new Book("Learning Web Design", "Robbins, J. N", "978-1-491-96020-2", "O’Reilly Media.",
                2018, 810, 13520.00F));
        libraryCatalog.add_book(new Book("Operating System Concepts", "Siberschatz/Galvin/Gagne", "978-1-11806333-0",
                "Wiley", 2012, 944, 7520.00F));
        libraryCatalog.add_book(new Book("Intro to Statistics and probability", "Mendenhall/Beaver/Beaver",
                "978-1-133-10375-2", "Cengage Learning", 2013, 753, 12520.00F));

        int choice;
        int x;

        do {
            System.out.println("-----------------------------------------------------");
            System.out.println("\t\t\t\tDIGITAL LIBRARY");
            System.out.println("\t\t\tCreated by Robert Chunga");
            System.out.println("_____________________________________________________\n");

            System.out.print("Select your choice.\n1. View Books\n2. Add Books\n3. Search Books\n-> ");
            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Books available in the library\n");
                    libraryCatalog.view_books();
                    break;
                case 2:
                    libraryCatalog.userAddBook();
            }
            System.out.print("\nPress \n1. Menu\n2. exit\n-> ");
            x = scanner.nextInt();
        } while (x != 2);
    }
}
