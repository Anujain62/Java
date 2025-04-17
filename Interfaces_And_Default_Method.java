// interfaces in english is a point where two systems meet and interact
// interface in java is  a group of related methods with empty bodies

// impliments keyword used in interface
// extents keyword used in inheritance

// we can create one drived class using multiple base class in interface
// but it is not posible in inheritance

// default methods enables us to add new functionality to existing interfaces

interface MyCamera {
  void takeSnap();
  void recordVideo();

  // private method does not called through the any class only called by the methods of same interface
  private void greet(){
   System.out.println("Good morning");
  }

  // if we add new method in interface it gives error but we use default keyword and 
  // define new method inside the infaces so it does not gives any error
  default void record4KVideo(){
   greet();     // it can be called private greet method because it is inside the same interfaces
   System.out.println("Recording in 4K");
  }
}

interface MyWifi{
 String[] getNetworks();
 void connectToNetwork(String network);
}

class MyCellPhone{

 void callNumber(int phoneNumber){
  System.out.println("Calling "+phoneNumber);
 }
 void pickCall(){
  System.out.println("Connecting....");
 }
 
}

class MySmartPhone extends MyCellPhone implements MyWifi , MyCamera{
 public void takeSnap(){
  System.out.println("Taking snap");
 }
 public void recordVideo(){
  System.out.println("Recording videos");
 }
 public String[] getNetworks(){
  System.out.println("Getting list of networks");
  String[] netWorkList={"Anu" , "Anki" , "Akanksha"};
  return netWorkList;
 }
 public void connectToNetwork(String network){
  System.out.println("Connect to "+network);
 }

 // default method can be override , if we override the default methods so it called override method 
 // not real method

 // public void record4KVideo(){
 //  System.out.println("Recording 4K video in my smartPhone class");
 // }

}

public class Interfaces_And_Default_Method {

 public static void main(String[] args) {
  
  MySmartPhone ms=new MySmartPhone();

  // ms.greet();    // it throughs the errror because it is private method of interface

  ms.record4KVideo();

  String[] networks = ms.getNetworks();
  for(String net: networks)
    System.out.println(net+" ");

  

 }
}