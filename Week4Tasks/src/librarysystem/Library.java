package librarysystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library extends Book {

    public Library(){
        super();
    }
    private String library_name;
    private int library_code;

    Book book = new Book();
    List<Book> bookList = new ArrayList<Book>();

    Scanner sc =new Scanner(System.in);
    public void addbook(){
        for (int i = 0; i < bookList.size(); i++) {
            System.out.println("Add Book ID");
            book.book_id=sc.nextInt();
            System.out.println("Add Book Title ");
            book.book_title= sc.next();
            System.out.println("Add Author Name");
            book.author_name= sc.next();
            System.out.println("Add Book Version");
            book.book_version= sc.next();
            System.out.println("The "+book.book_title+"Successfully added in the Library ");

        }

    }

    public void removebook(){
        System.out.println("Enter ID to Removed");
        book.book_id= sc.nextInt();
        bookList.remove(book);

    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public String getLibrary_name() {
        return library_name;
    }

    public void setLibrary_name(String library_name) {
        this.library_name = library_name;
    }

    public int getLibrary_code() {
        return library_code;
    }

    public void setLibrary_code(int library_code) {
        this.library_code = library_code;
    }
}
