
class Base{
    public int x;

    // default constructor
    Base(){
        System.out.println("I am a base class constructor");
    }
    // parameterized constructor
    Base(int x){
        System.out.println("I am a constructor with value of a :"+x);
    }
    // getter method
    public int getX(){
        return x;
    }
    // setter method
    public void setX(int x){
        this.x=x;
    }
}
class Derived extends Base{
    public int y;
    // default constructor 
    Derived(){
        super(0);     // it called parameterized constructor of base class with 0 value otherwise it called default constructor of base class
        System.out.println("I am a derived class constructor");
    }
    // it called base class parameterized constructor
    Derived(int x,int y){
        super(x);
        System.out.println("I am an overloaded constructor of derived with value of x and y as :"+y);
    }
    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y=y;
    }
}
class chileOfDerived extends Derived{
    // it called derived class default constructor
    chileOfDerived(){
        System.out.println("I am a child of derived constructor");
    }
     
    // it called derived class parameterized constructor
    chileOfDerived(int x,int y,int z){
        super(x,y);
        System.out.println("I am overloaded constructor of derived with value of z as :"+z);
    }
}
public class Construct_In_Inheritance {
    public static void main(String[] args) {
        // Base b=new Base();       // object creation -> it called base class constructor
        // Derived d1=new Derived();    // object creation -> it called both constructors
        // Derived d2=new Derived(10,20);   //parameterized constructor
        chileOfDerived cd1 = new chileOfDerived();
        chileOfDerived cd2=new chileOfDerived(10,20,30);
    }
}
