// min priority = 1
// normal priority = 5
// max priority = 10

class MyThread extends Thread {
 public MyThread(String name){
  super(name);
 }
 public void run(){
  int i=0;
  while (i<5) {
   System.out.println("Thank you "+this.getName());
   i++;
  }
 }
}

public class Thread_Priorities {
 public static void main(String[] args) {
  MyThread t1=new MyThread("anu1");
  MyThread t2=new MyThread("anu2");
  MyThread t3=new MyThread("anu3");
  MyThread t4=new MyThread("anu4");
  MyThread t5=new MyThread("anu5 (most important)");

  t5.setPriority(Thread.MAX_PRIORITY);
  t1.setPriority(Thread.MIN_PRIORITY);
  t2.setPriority(Thread.MIN_PRIORITY);
  t1.start();
  t2.start();
  t3.start();
  t4.start();
  t5.start();
 }
}
