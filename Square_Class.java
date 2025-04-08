import java.util.Scanner;

class Square{
    int side;
    public void setSide(int n){
        side=n;
    }
    public int getArea(){
        return side*side;
    }
    public int getPerimeter(){
        return 4*side;
    }
}


public class Square_Class {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the side of Square :");
        int side=sc.nextInt();
        Square s=new Square();
        s.setSide(side);
        System.out.println("Area of square is :"+s.getArea());
        System.out.println("Perimeter of square is :"+s.getPerimeter());
    }
}
