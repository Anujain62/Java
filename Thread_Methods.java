
// class MyThread1 extends Thread {
//  int i=0;
//  public void run(){
//   while (i<15) {
//    System.out.println("Thank you 1");

//    // this function is sleep in milli seconds
//    try{
//     Thread.sleep(2000);   //it blocks runable thread at a particular time
//    }
//    catch(InterruptedException e){
//     e.printStackTrace();
//    }

//    i++;
//   }
//  }
// }

// class MyThread2 extends Thread {
//  int i=0;
//  public void run(){
//   while (i<15) {
//    System.out.println("Thank you 2");
//    i++;
//   }
//  }
// }

// public class Thread_Methods {
//  public static void main(String[] args) {
//   MyThread1 t1=new MyThread1();
//   MyThread2 t2=new MyThread2();
//   t1.start();
//   // if we want first finish the t1 and than start other methods of main function

//   try{
//    t1.join();
//   }
//   catch(Exception e){
//    System.out.println(e);
//   }

//   t2.start();
//  }
// }





// class MyThread extends Thread{
//  public void run(){
//   for(int i=1;i<=10;i++){
//   System.out.println(getName()+" thread is running");
//   Thread.yield(); // it blocks runable thread at a random time 
//  }
//  }
// }

// public class Thread_Methods {
//  public static void main(String[] args) {
//   MyThread t1 = new MyThread();
//   MyThread t2 = new MyThread();
//   t1.setName("Low Priority");
//   t2.setName("High priority");

//   t1.setPriority(Thread.MIN_PRIORITY);
//   t2.setPriority(Thread.MAX_PRIORITY);

//   t1.start();
//   t2.start();
//  }
// }



// wait notify 

class WaitNotify extends Thread{
 private boolean isSignal = false;
 public synchronized void sendSignal(){
  isSignal = true;
  System.out.println("Producer : Signal sending...");
  notify();
 }
 public synchronized void waitSignal(){
  while (!isSignal) {
   try{
    System.out.println("Consumer : waiting...");
    wait();
   }
   catch(InterruptedException ex){

   }
  }
  System.out.println("Consumer : gets processing..." );
 }
}

public class Thread_Methods {
 public static void main(String[] args) {
  WaitNotify obj = new WaitNotify();
  Thread consumer = new Thread(()->{
   obj.waitSignal();
  });
  Thread producer = new Thread(()-> {
   try {
    Thread.sleep(2000);
   } catch (InterruptedException e) {
    e.printStackTrace();
   }
   obj.sendSignal();
  });
  consumer.start();
  producer.start();
 }
}