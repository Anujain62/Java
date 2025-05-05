import java.util.Scanner;

class MyEmployee1{
    private int id;
    private String name;

    // default constructor
    public MyEmployee1(){
        id=45;
        name ="anu jain";
    }

    // parameterized contructor
    public MyEmployee1(int i,String n){
        id=i;
        name =n;
    }

    // getter method
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }

    // Setter method -> it creates problem in large programs

    // public void setName(String n){
    //     this.name=n;
    // }
    // public void setId(int i){
    //     this.id=i;
    // }
}

public class Constructor {

    public static void main(String[] args) {

        // user input 
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name :");
        String name=sc.nextLine();
        System.out.println("Enter your id :");
        int id =sc.nextInt();

        // object creation and default constructor
        MyEmployee obj1=new MyEmployee();
        System.out.println("Default constructor values :");
        System.out.println("Name :"+obj1.getName());
        System.out.println("Id :"+obj1.getId());

        // again new object creation and perameterized constructor
        MyEmployee1 obj2=new MyEmployee1(id,name);
        System.out.println("Parameterized constructor values :");
        System.out.println("Name :"+obj2.getName());
        System.out.println("Id :"+obj2.getId());
    }
}