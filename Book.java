public class Book {
    String author, title, isbn;
    int publicationYear, availableCopies, totalCopies;

    //Book constructor
    public Book(String author, String title, String isbn, int publicationYear, int totalCopies){
        this.author = author;
        this.title = title;
        this.isbn = isbn;
        this.publicationYear = publicationYear;
        this.totalCopies = totalCopies;
        this.availableCopies = totalCopies;
    }

    public void displayBooks(){
        System.out.println("Author\t\t: " + author + "\nTitle\t\t: " + title + "\nISBN\t\t: " + isbn + "\nPublication Year: " + publicationYear + "\nTotal Copies\t: " + totalCopies + "\nAvailable Copies: " + availableCopies + "\n--------------------------------------------------------");
    }
}
