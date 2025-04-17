// create an interface TVRemote and use it to inherit another interface SmartTvRemote
// create a class TV which implements SmartTVRemote interface


interface TVRemote{
 void changeChanel();
 void volume();
}

interface SmartTVRemote extends TVRemote{
 void voiceControl();
 void wifiConnection();
}

class TV implements SmartTVRemote  {
 @Override
 public void voiceControl() {
  System.out.println("voice control");
 } 
 public void wifiConnection(){
  System.out.println("Wifi connected");
 }
 public void changeChanel(){
  System.out.println("Change Chanel");
 }
 public void volume(){
  System.out.println("Increase or decrease volume");
 }
}

public class Practice_Create_Interfaces_And_Inherits {
 public static void main(String[] args) {
  TV tv=new TV();
  tv.changeChanel();
  tv.wifiConnection();
  tv.volume();
  tv.voiceControl();
 }
}
