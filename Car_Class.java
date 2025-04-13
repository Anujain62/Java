/* create a class named car with an instance variable color.create and object and assign the color ret to it.print the color.
 */

import java.util.Scanner;

class Car{
    private String color;
    void setColor(String color){
        this.color=color;
    }
    String getColor(){
        return color;
    }
}
public class Car_Class {
    public static void main(String[] args) {
        Car c=new Car();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter car color :");
        String s=sc.next();
        c.setColor(s);
        System.out.println("You choose car color : "+c.getColor());
    }
}
