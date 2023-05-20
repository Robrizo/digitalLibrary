import java.util.ArrayList;

public class Library {
    String name;
    public ArrayList<Book> libraryBooks;

    // Library constructor
    public Library(String name) {
        this.name = name;
        this.libraryBooks = new ArrayList<Book>();
    }

    // Method for adding books to the library
    public void addBook(Book book) {
        libraryBooks.add(book);
    }

    // A method for removing books in the library
    public void removeBook(Book book) {
        libraryBooks.remove(book);
    }

    // added a method to display books added in the array list
    public void viewBook() {
        System.out.println(name + "\n--------------------------------------------------------");
        for (Book book : libraryBooks) {
            book.displayBooks();
        }
    }

    public static void main(String[] args) {
        Library myBook = new Library("\t\tMZUZU UNIVERSITY LIBRARY");

        Book book1 = new Book("Robbins, J. N", "Learning Web Design", "978-1-491-96020-2", 2018, 10);
        Book book2 = new Book("Siberschatz/Galvin/Gagne", "Operating System Concepts", "978-1-11806333-0", 2012, 3);
        Book book3 = new Book("Mendenhall/Beaver/Beaver", "Intro to Statistics and probability", "978-1-133-10375-2",
                2013, 6);

        myBook.addBook(book1);
        myBook.addBook(book2);
        myBook.addBook(book3);

        // testing library functionality
        myBook.viewBook();
    }
}
