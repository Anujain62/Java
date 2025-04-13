// Create a class named dog with an instance variable name. create 3 objects of ths class
// and assign different name to each.print the names

import java.util.Scanner;

class Dog{
    private String name;
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
}

public class Class_Dog {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first dog name :");
        String name1=sc.nextLine();
        System.out.println("Enter second dog name :");
        String name2=sc.nextLine();
        System.out.println("Enter third dog name :");
        String name3=sc.nextLine();
        Dog d1=new Dog();
        d1.setName(name1);
        Dog d2=new Dog();
        d2.setName(name2);
        Dog d3=new Dog();
        d3.setName(name3);
        System.out.println("First dog name :"+d1.getName());
        System.out.println("Second dog name :"+d2.getName());
        System.out.println("Third dog name :"+d3.getName());
    }
}
