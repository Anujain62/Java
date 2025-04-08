// Base class / Parent class / Super class
class Base{
    private int x;
    public int getX(){
        return x;
    }
    public void setX(int x){
        this.x=x;
    }
    public void printMe(){
        System.out.println("I Am a constructor");
    }
}

// Derived class / Child class / Sub class
class Derived extends Base{
        private int y;
        public int getY(){
            return y;
        }
        public void setY(int y){
            this.y=y;
        }
}

public class Inheritance {
    public static void main(String[] args) {

        // Accessbility using base class object
        Base b=new Base();
        b.setX(4);
        System.out.println("Value of X using base class object :"+b.getX());

        //Accessbility using derived class object
        Derived d=new Derived();
        d.setX(10);
        System.out.println("Value of X using derived class object :"+d.getX());
    }
}
