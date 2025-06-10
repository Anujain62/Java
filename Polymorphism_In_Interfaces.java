

interface MyCamera {
 void takeSnap();
 void recordVideo();

 private void greet(){
  System.out.println("Good morning");
 }

 default void record4KVideo(){
  greet();    
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
 public void sampleMeth(){
  System.out.println("Sample Meth");
 }
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
}


public class Polymorphism_In_Interfaces {
 public static void main(String[] args) {
  
  //MyCamera cam=new MySmartPhone();  // this is a smartphone but, use it as a camera

  // cam.getNetworks();    // not allowed because smartphone use like camera so we can not access wifi
  //cam.sampleMeth();

 // cam.record4KVideo();


  MySmartPhone s=new MySmartPhone();   // it can be access all methods 
  s.getNetworks();
  s.record4KVideo();
  s.sampleMeth();
  s.callNumber(9893);

 }
}
