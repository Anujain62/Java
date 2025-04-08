
class Base{
    int a;
    Base(int a){
        this.a=a;    
        // this is a way for us to reference an object of the class 
        //which is being created referenced
    }
    public int getA(){
        return a;
    }
    public int returnNone(){
        return 1;
    }
}
class Derived extends Base {
    Derived(int c){       // by default its called default constructor of base class 
        super(c);          //using super keyword with parameter ,its called parameterized constructor of base class
        // super -> a reference variable used to refer immidiate parent class object
        System.out.println("I am a derived class constructor");
    }
}

public class Super_And_This_Keyword {
    public static void main(String[] args) {

        // for this keyword

        // Base b=new Base(65);
        // System.out.println("Value of a :"+b.getA());


        //for super keyword
        Derived d=new Derived(5);
        System.out.println("value of a :"+d.getA());
    }
}
