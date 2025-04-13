import java.util.Scanner;

class Circle{
    private int radius;

    // default constructor
    Circle(){
        radius=0;
    }
    // parameterized constructor
    Circle(int r){
        System.out.println("Inside the circle!");
        this.radius=r;
    }

    public void setRadius(int radius){
        this.radius=radius;
    }
    public int getRedius(){
        return radius;
    }
    public float getArea(){
        return 3.14f*radius*radius;
    }
    public float getPerimeter(){
        return 2*3.14f*radius;
    }
    public int getDiameter(){
        return 2*radius;
    }
}

class Cylinder extends Circle{
    private int height;
    Cylinder(int r,int h){
        super(r);
        System.out.println("Inside the cylinder!");
        this.height=h;
    }
    public void setHieght(int height){
        this.height=height;
    }
    public int getHeight(){
        return height;
    }
    public float getVolume(){
        return 3.14f*getRedius()*getRedius()*height;
    }
    public float getSurfaceArea(){
        return 2*3.14f*getRedius()*height;
    }
    public float getTotalArea(){
        return (2*3.14f*getRedius())*(height+getRedius());
    }
}

public class Base_Class_Circle_and_Derived_Class_Cylinder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius :");
        int radius=sc.nextInt();
        System.out.println("Enter height :");
        int height=sc.nextInt();


        // here we can initilized radius and height two different types -> 1) using constructor 2) using setter(set) function 
        
        // 1) through the constructor
        Cylinder cy=new Cylinder(radius,height);

        // 2) through the setter function
        // cy.setRadius(radius);
        // cy.setHieght(height);

        // we can access all methods(functions) or properties using derived class object
        System.out.println("Redius :"+cy.getRedius());
        System.out.println("Height :"+cy.getHeight());
        System.out.println("Area of circle :"+cy.getArea());
        System.out.println("Perimeter of circle :"+cy.getPerimeter());
        System.out.println("Diameter of circle :"+cy.getDiameter());
        System.out.println("Volume of cylinder :"+cy.getVolume());
        System.out.println("Surface area of cylinder :"+cy.getSurfaceArea());
        System.out.println("Total surface area of cylinder :"+cy.getTotalArea());

        Circle ci=new Circle();   //it called default constructor of circle class
        ci.setRadius(radius);
        System.out.println("Redius :"+ci.getRedius());
        System.out.println("Area of circle :"+ci.getArea());
        System.out.println("Perimeter of circle :"+ci.getPerimeter());
        System.out.println("Diameter of circle :"+ci.getDiameter());


        // it gives error because we can not called derived class functions using base class object 
        // because base class does not derived any properties of derived class so we can't access any method
        // or property of the derived class through the base class object

        // System.out.println("Height :"+ci.getHeight());
        // System.out.println("Volume of cylinder :"+ci.getVolume());
        // System.out.println("Surface area of cylinder :"+ci.getSurfaceArea());
        // System.out.println("Total surface area of cylinder :"+ci.getTotalArea());

    }
}
