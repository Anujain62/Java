
class MyThread1 implements Runnable{
 public void run(){
  int i=0;
  while(i<5){
   System.out.println("I am a thread 1 not a threat 1");
   i++;
  }
 } 
}

class MyThread2 implements Runnable{
 public void run(){
  int i=0;
  while (i<5) {
   System.out.println("I am a thread 2 not a threat 2");
   i++;
  }
 }
}

public class Thrad_Using_Runnable_Interface {
 public static void main(String[] args) {
  MyThread1 bullet1=new MyThread1();
  Thread gun1=new Thread(bullet1);

  MyThread2 bullet2=new MyThread2();
  Thread gun2=new Thread(bullet2);

  gun1.start();
  gun2.start();
 }
}
