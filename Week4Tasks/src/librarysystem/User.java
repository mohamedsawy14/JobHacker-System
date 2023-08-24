package librarysystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class User extends Book  {
    private String user_name;
    private int user_id;

    Book book = new Book();
    List<Book> bookList = new ArrayList<Book>();

    Scanner sc = new Scanner(System.in);
    public  void borrowbook(){
        System.out.println("Enter USRE_ID");
        user_id= sc.nextInt();
        System.out.println("Enter User_name");
        user_name= sc.next();
        System.out.println("Enter ID_Book ");
        book.book_id=sc.nextInt();
        System.out.println("Enter THe Book was borrowed  ");
        book.book_title=sc.next();
        System.out.println("The User ID "+user_id+" is Successfully borrowed of Book "+book_title);
    }
    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }
}
