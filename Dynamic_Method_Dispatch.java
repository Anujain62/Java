
class One{
    public void greet(){
        System.out.println("Good Morning,Base class");
    }
    public void name(){
        System.out.println("My name is Java in class one");
    }
}
class Two extends One{
    public void hello(){
        System.out.println("Hello,Derived class");
    }
    public void name(){
        System.out.println("My name is Java in class two");
    } 
}

public class Dynamic_Method_Dispatch {
    public static void main(String[] args) {
        // One fobj=new One();
        // Two sobj=new Two();
        // fobj.name();
        // sobj.name();

        One obj1=new Two(); //this is valid(allowed),reference of supar-class is equal to obj of sub-class
        obj1.name();  //if function is not override so this conditon base class function is called,does not called function of derived class,this is called dynamic dispatch ,
        obj1.greet();   //if function is override, so this condition called derived class function because here actually object is created derived class
       
        //obj1.hello();  // Not allwed,this is called dynamic dispatch

        // Two obj2=new One();    // this is invalis(not allowed),because reference of sub-class is not equal to object of supar-class 


    }
}
