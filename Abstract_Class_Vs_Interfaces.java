// interface method is compulsory for implementation in implemented class

// we can create multiple interfaces but can't create multiple abstract classes

interface Bicycle {
 int a=45;
  void applyBrake(int decrement);
  void speedUp(int increment);
}

interface HornBicycle{
 void blowHornK3G();
 void blowHornMhN();
}

// all methods of interfaces defines public in implements class

class AvonCycle implements Bicycle,HornBicycle{
 void blowHorn(){
  System.out.println("Pee Pee");
 }
 public void applyBrake(int decrement){
  System.out.println("Applying brake");
 }
 public void speedUp(int increment){
  System.out.println("Applying speedup");
 }
 public void blowHornK3G(){
  System.out.println("Pee Poo Pee Poo");
 }
 public void blowHornMhN(){
  System.out.println("Poo Poo Poo ");
 }

}

public class Abstract_Class_Vs_Interfaces {
 public static void main(String[] args) {
  
   AvonCycle cycle=new AvonCycle();
   cycle.blowHorn();
   cycle.applyBrake(1);
   cycle.speedUp(5);
   System.out.println(cycle.a);
   cycle.blowHornK3G();
   cycle.blowHornMhN();

   // you can not modify the properties in interfaces as they are final
   
   // cycle.a=70;

 }
}
