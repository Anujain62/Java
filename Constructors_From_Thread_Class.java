

class MyThread extends Thread{
 public MyThread(String name){
  super(name);
 }
 int i=0;
 public void run(){
  while (i<5) {
   System.out.println("I am a thread");
   i++;
  }
 }
}

public class Constructors_From_Thread_Class {
 public static void main(String[] args) {
  MyThread t1=new MyThread("anu");
  MyThread t2=new MyThread("ram");

  t1.start();
  t2.start();

  System.out.println("The id of the thread t1 is "+t1.threadId());
  System.out.println("The name of the thread t1 is "+t1.getName());

  System.out.println("The id of the thread t2 is "+t2.threadId());
  System.out.println("The name of the thread t2 is "+t2.getName());
 }
}
