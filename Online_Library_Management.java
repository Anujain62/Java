/*   You have to implement a library using java class library
      methods : add book,issue book, return book , show available book
 */

import java.util.Scanner;

class Library{
    private static int totalBook = 0;
    private String[] name=new String[100];
    private String[] bookName=new String[100];
    private static int nameList=0;

    Scanner sc=new Scanner(System.in);

    private void RemoveBook(int n){
        for(int i=n;i<=totalBook;i++)
           bookName[i]=bookName[i+1];
        totalBook--;
    }

    public void AddBook(){
        System.out.println("Enter book name:");
        bookName[totalBook]=sc.nextLine();
        totalBook++;
    }

    public int TotalBook(){
        return totalBook;
    }

    public void availableBook(){
        System.out.println("Available books:");
        for(int i=0;i<totalBook;i++)
           System.out.println(bookName[i]);
    }

    public void listOfBook(){
        for(int i=0;i<totalBook;i++)
           System.out.println(i+" -> "+bookName[i]);
    }

    public void listOfStudents(){
        System.out.println("List of students:");
        for(int i=0;i<nameList;i++)
           System.out.println(name[i]);
    }

    public void IssueBook(){
        System.out.println("Enter your name :");
        name[ nameList++]=sc.nextLine();
        System.out.println("Total books :"+TotalBook());
        System.out.println("List of Books:");
        listOfBook();
        System.out.println("enter your choice:");
        int x=sc.nextInt();
        RemoveBook(x);
        System.out.println("Issued Successfully!");
    }

    public void ReturnBook(){
        System.out.println("Enter your name:");
        String User=sc.nextLine();
        int i;
        for(i=0;i<nameList;i++){
            if(name[i]==User)
                break;
        }
        if(i==nameList)
          System.out.println("Your name not found!");
        else{
            for(int j=i;j<nameList;j++)
                name[j]=name[j+1];
            nameList--;
            AddBook();
        }

    }

}

public class Online_Library_Management {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Library l=new Library();
        System.out.println("1 -> add book \n 2 -> issue book \n 3 -> return book \n 4 -> available book");
        char ch='y';
        while(ch=='y' || ch=='Y'){
            System.out.println("Enter your choice :");
            int x=sc.nextInt();
            switch (x) {
                case 1: l.AddBook();
                        break;
                case 2: l.IssueBook();
                        break;
                case 3: l.ReturnBook();
                        break;
                case 4: l.availableBook();
                        break;
                default : System.out.println("Invalid choice!");
            }
            System.out.println("You want to continue process?");
            ch=sc.next().charAt(0);
        }
        l.listOfStudents();

    }
}
