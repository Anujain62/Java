import java.util.Scanner;

class Circle{
    private float radius;
    public void setRedius(float n){
        radius=n;
    }
    public int setArea(float a){
        float area =3.14f*radius*radius;
        if(a==area)
            return 1;
        else 
            return 0;
    }
    public int setPerimeter(float p){
        float perimeter=2*3.14f*radius;
        if(p==perimeter)
            return 1;
        else
            return 0;
    }
    public float getArea(){
        return (3.14f*radius*radius);
    }
    public float getPerimeter(){
        return (2*3.14f*radius);
    }
}

public class Getter_And_Setter_For_Circle_Area_And_Perimeter {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius of the circle :");
        float r=sc.nextFloat();
        float area = 3.2f*r*r;
        float perimeter = 2*3.14f*r;
        Circle c=new Circle();
        c.setRedius(r);
        int x=c.setArea(area);
        sc.close();

        float corrArea=c.getArea();
        if(x==1)
           System.out.println("Congrats! you calculate right area of the circle for radius "+r+" \nArea = "+area);
        else
           System.out.println("You calculate wrong area of the circle for radius "+r+" \nYour Answer = "+area+" \nCorrect Answer = "+corrArea);
        int y=c.setPerimeter(perimeter);

        float corrPerimeter=c.getPerimeter();
        if(y==1)
            System.out.println("Congrats! you calculate right perimeter of the circle for radius "+r+" \nPerimeter = "+perimeter);
        else
            System.out.println("You calculate wrong perimeter of the circle for radius "+r+" \nYour Answer = "+perimeter+" \nCorrect Answer = "+corrPerimeter);
    }
}






