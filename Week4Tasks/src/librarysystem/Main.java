package librarysystem;

import librarysystem.Book;
import librarysystem.Library;
import librarysystem.User;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x ;
        int n;
        User user = new User();
        Library lb = new Library();
        Book book= new Book();




        Library[] books = new Library[]{new Library()};

        Scanner sc = new Scanner(System.in);
        x=sc.nextInt();


            System.out.println("Welcome to Library System");
            System.out.println("============================");

            System.out.println("1.Enter the user name and ID and Borrowed of Books");
            System.out.println("2.Delete the Book in the Library");
            System.out.println("3.Display All Books");
            System.out.println("4.Display of Specific Book");
            System.out.println("5.Enter the Number of Books where to add the Library");
            System.out.println("6.Exit");


            switch (x)
            {
                case 1:
                    user.borrowbook();
                    break;
                case 2:
                    lb.removebook();
                case 3:
                    for (int i = 0; i <books.length ; i++) {
                        System.out.println(books[i].getBook_title());
                        break;
                    }
                case 4:
                    for (int i = 0; i <books.length ; i++) {
                        System.out.println(books[i].getBook());
                        break;

                    }
                case 5:
                    for (int i = 0; i < books.length; i++) {

                        books[i].addbook();
                    }

                case 6:
                    System.out.println("Thanks for Using Library System");
            }




       ;





    }
}