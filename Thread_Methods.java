
class MyThread1 extends Thread {
 int i=0;
 public void run(){
  while (i<15) {
   System.out.println("Thank you 1");

   // this function is sleep in milli seconds
   try{
    Thread.sleep(2000);
   }
   catch(InterruptedException e){
    e.printStackTrace();
   }

   i++;
  }
 }
}

class MyThread2 extends Thread {
 int i=0;
 public void run(){
  while (i<15) {
   System.out.println("Thank you 2");
   i++;
  }
 }
}

public class Thread_Methods {
 public static void main(String[] args) {
  MyThread1 t1=new MyThread1();
  MyThread2 t2=new MyThread2();
  t1.start();
  // if we want first finish the t1 and than start other methods of main function

  try{
   t1.join();
  }
  catch(Exception e){
   System.out.println(e);
  }

  t2.start();
 }
}
