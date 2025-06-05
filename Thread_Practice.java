// 1) WAP tp print "good morning" and "well come" continuously on the screen in java using thread

// class MyThread1 extends Thread{
//  int i=0;
//  public void run(){
//   while (i<15) {
//    System.out.println("Good Morning");
//    i++;
//   }
//  }
// }

// class MyThread2 extends Thread{
//  int i=0;
//  public void run(){
//   while (i<15) {
//    System.out.println("Wel Come");
//    i++;
//   }
//  }
// }

// public class Thread_Practice {
//  public static void main(String[] args) {
//   MyThread1 t1=new MyThread1();
//   MyThread2 t2=new MyThread2();
//   t1.start();
//   t2.start();
//  }
// }




// 2) add a sleep method in welcome thread of question 1 and delay its execution for 200ms

// class MyThread1 extends Thread{
//  int i=0;
//  public void run(){
//   while (i<50) {
//    System.out.println("Good Morning");
//    i++;
//   }
//  }
// }

// class MyThread2 extends Thread{
//  int i=0;
//  public void run(){
//   while (i<50) {
//    System.out.println("Wel Come");
//    try{
//     Thread.sleep(200);
//    }
//    catch(InterruptedException e){
//     e.printStackTrace();
//    }
//    i++;
//   }
//  }
// }

// public class Thread_Practice {
//  public static void main(String[] args) {
//   MyThread1 t1=new MyThread1();
//   MyThread2 t2=new MyThread2();
//   t1.start();
//   t2.start();
//  }
// }



// 3) Demonstrate getPriority() and setPriority() methods in java threads

// class MyThread1 extends Thread{
//  int i=0;
//  public void run(){
//   while (i<50) {
//    System.out.println("Good Morning");
//    i++;
//   }
//  }
// }

// class MyThread2 extends Thread{
//  int i=0;
//  public void run(){
//   while (i<50) {
//    System.out.println("Wel Come");
//    i++;
//   }
//  }
// }

// public class Thread_Practice {
//  public static void main(String[] args) {
//   MyThread1 t1=new MyThread1();
//   MyThread2 t2=new MyThread2();
//   t1.setPriority(Thread.MAX_PRIORITY);
//   t2.setPriority(Thread.MIN_PRIORITY);
//   t1.start();
//   t2.start();
//   System.out.println(t1.getPriority());
//   System.out.println(t2.getPriority());
//  }
// }




// 4) how do you get state of a given thread in java

// class MyThread1 extends Thread{
//  int i=0;
//  public void run(){
//   while (i<50) {
//    System.out.println("Good Morning");
//    i++;
//   }
//  }
// }

// class MyThread2 extends Thread{
//  int i=0;
//  public void run(){
//   while (i<50) {
//    System.out.println("Wel Come");
//    i++;
//   }
//  }
// }

// public class Thread_Practice {
//  public static void main(String[] args) {
//   MyThread1 t1=new MyThread1();
//   MyThread2 t2=new MyThread2();
//   System.out.println("Before staring state of t1 "+t1.getState());
//   t1.start();
//   t2.start();
//   System.out.println("After starting state of t2 "+t2.getState());
//  }
// }





// 5) how do you get reference to the current thread in java

// class MyThread1 extends Thread{
//  int i=0;
//  public void run(){
//   while (i<50) {
//    System.out.println("Good Morning");
//    i++;
//   }
//  }
// }

// class MyThread2 extends Thread{
//  int i=0;
//  public void run(){
//   while (i<50) {
//    System.out.println("Wel Come");
//    i++;
//   }
//  }
// }

// public class Thread_Practice {
//  public static void main(String[] args) {
//   MyThread1 t1=new MyThread1();
//   MyThread2 t2=new MyThread2();
//   System.out.println("before starting Reference of t1 "+Thread.currentThread().getState());
//   t1.start();
//   t2.start();
//   System.out.println("after starting Reference of t2 "+Thread.currentThread().getState());
//  }
// }



// 6) Amount withdraw
// problem -> unwanted withdraw

class Amount implements Runnable{
 static int amount = 1000;
 int tempAmt;
 Amount(int tempAmt){
  this.tempAmt = tempAmt;
 }
 public void run(){
  if(tempAmt>amount){
  System.out.println("Insufficient amount for withdraw request "+tempAmt);
  }
  else{
   System.out.println("Withdraw amount "+tempAmt);
   amount-=tempAmt;
   System.out.println("Remaining amount "+amount);
  }
 }
}
public class Thread_Practice {

 public static void main(String[] args) {
  Amount t1 = new Amount(800);
  Thread x= new Thread(t1);
  Amount t2 = new Amount(500);
  Thread y= new Thread(t2);
  x.start();
  y.start();
 }
}


// solution for unwanted withdraw

// class Amount implements Runnable{
//  static int amount = 1000;
//  int tempAmt;
//  Amount(int tempAmt){
//   this.tempAmt = tempAmt;
//  }
//  public void run(){
//   synchronized(Amount.class){
//    if(tempAmt>amount){
//     System.out.println("Insufficient amount for withdraw request "+tempAmt);
//    }
//    else{
//     System.out.println(Thread.currentThread().getName());
//     System.out.println("Withdraw amount "+tempAmt);
//     amount-=tempAmt;
//     System.out.println("Remaining amount "+amount);
//    }
//   }
//  }
// }
// public class Thread_Practice {

//  public static void main(String[] args) {
//   Amount t1 = new Amount(800);
//   Thread x= new Thread(t1);
//   Amount t2 = new Amount(500);
//   Thread y= new Thread(t2);
//   x.start();
//   y.start();
//  }
// }

