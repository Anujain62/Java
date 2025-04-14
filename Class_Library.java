// create a class named library with a static variable total books and an instance variable book name. inside the
// main method increment total books and assigned a book name. print the total books and book name.

import java.util.Scanner;

public class Class_Library {
    public static void main(String[] args) {

        class Library {
            public static int total_books;
            private String bookName;
            public void setBookName(String bookName){
                this.bookName=bookName;
                total_books++;
            }
            public String getBookName(){
                return bookName;
            }
        }

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter book name :");
        String bookName=sc.nextLine();
        Library l=new Library();
        l.setBookName(bookName);
        System.out.println("Enter book name :");
        bookName=sc.nextLine();
        l.setBookName(bookName);
        System.out.println("Last Book Added :"+l.getBookName());
        System.out.println("Total books :"+Library.total_books);
    }
}
