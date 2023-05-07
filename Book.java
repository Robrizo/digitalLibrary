public class Book{
    //variable declaration

    String title, author, isbn, publisher;
    int year, num_pages;
    float price;

    //Book constructor
    public Book(String title, String author, String isbn, String publisher, int year, int num_pages, float price){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.publisher = publisher;
        this.year = year;
        this.num_pages = num_pages;
        this.price = price;
    }

    //A method for displaying book information
    public void display_book_info() {
        System.out.println("Title\t\t: " + title + "\nAuthor\t\t: " + author + "\nISBN\t\t: " + isbn + "\nPublisher\t: " + publisher + "\nYear\t\t: " + year + "\nBook pages\t: " + num_pages + "\nPrice\t\t: K" + price + "\n_____________________________________________________");
    }
}