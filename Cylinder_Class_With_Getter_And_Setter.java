import java.util.Scanner;

class Cylinder{
    private int radius;
    private int height;

    // setter method
    public void setRedius(int r){
        radius = r;
    }
    public void setHeight(int h){
        height = h;
    }

    // getter method 
    public int getRedius(){
        return radius;
    }
    public int getHeight(){
        return height;
    }
    public float getArea(){
        return ((2*3.14f*radius*radius)+(2*3.14f*radius*height));
    }
    public float getVolume(){
        return (3.14f*radius*radius*height);
    }
}


public class Cylinder_Class_With_Getter_And_Setter {
    public static void main(String[] args) {

        // user input 
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius of cylinder :");
        int radius=sc.nextInt();
        System.out.println("Enter height of cylinder :");
        int height = sc.nextInt();

        //object creation
        Cylinder c=new Cylinder();

        //function call using object
        c.setRedius(radius);
        c.setHeight(height);
        System.out.println("Radius :"+c.getRedius());
        System.out.println("Height :"+c.getHeight());
        System.out.println("Area of Cylinder :"+c.getArea());
        System.out.println("Volume of Cylinder :"+c.getVolume());
    }
}
