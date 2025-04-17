// create an abstract class pen with methods write() and refill() as abstract methods
// use the pen class to create a concrete class fountain pen with additional method changeNib()

abstract class Pen{
 abstract void write();
 abstract void refill();
}

class FountainPen extends Pen{

 void write(){
  System.out.println("Write");
 }
 void refill(){
  System.out.println("Refill");
 }
 void changeNib(){
  System.out.println("Changing the nib");
 }

}

public class Create_Abstract_Class_Pen {
 public static void main(String[] args) {
  
  FountainPen pen = new FountainPen();
  pen.changeNib();

 }
}
