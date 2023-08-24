package librarysystem;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Book {

   protected   String book_title;
    protected String author_name;
    protected   int book_id;
    protected String book_version;
    protected boolean book_status;
    List<Book> bookList = new ArrayList<Book>();

    public Book() {

    }


    public String getBook_title() {
        return book_title;
    }

    public void setBook_title(String book_title) {
        this.book_title = book_title;
    }

    public String getAuthor_name() {
        return author_name;
    }

    public void setAuthor_name(String author_name) {
        this.author_name = author_name;
    }

    public int getBook_id() {
        return book_id;
    }

    public Book(String book_title, String author_name, int book_id, String book_version, boolean book_status) {
        this.book_title = book_title;
        this.author_name = author_name;
        this.book_id = book_id;
        this.book_version = book_version;
        this.book_status = book_status;
    }



    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public String getBook_version() {
        return book_version;
    }

    public void setBook_version(String book_version) {
        this.book_version = book_version;
    }

    public boolean getBook_status() {
        return book_status;
    }

    public void setBook_status(boolean book_status) {
        this.book_status = book_status;
    }
}
