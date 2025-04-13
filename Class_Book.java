// Create a class named book with two instance variables: title and author.create an object and assign values to 
// these variables.print the values

import java.util.Scanner;

class Book{
    private String bookName;
    private String authorName;
    public void setBookName(String bookName){
        this.bookName=bookName;
    }
    public void setAuthorName(String authorName){
        this.authorName=authorName;
    }
    String getBookName(){
        return bookName;
    }
    String getAuthorName(){
        return authorName;
    }
}

public class Class_Book {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter book name :");
        String bookName=sc.nextLine();
        System.out.println("Enter author name :");
        String authorName=sc.nextLine();
        Book b=new Book();
        b.setBookName(bookName);
        b.setAuthorName(authorName);
        System.out.println("Book Name :"+b.getBookName());
        System.out.println("Author Name :"+b.getAuthorName());
    }
}
