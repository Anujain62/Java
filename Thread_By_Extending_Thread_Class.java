// multiproccessing and multithreading both are used to achieve multitasking
// threads use shared memory area 
// threads -> faster content switching
// a thread is light weight whereas a process is heavy-weight

// there are two ways to create a thread -> 1)by extending thread class  2)by implementing runable interfaces
 

class MyThread1 extends Thread{
 @Override
 public void run(){
  int i=0;
  while(i<5){
   System.out.println("My thread is running");
   System.out.println("I'm happy!");
   i++;
  }
 } 
}

class MyThread2 extends Thread{
 @Override
 public void run(){
  int i=0;
  while(i<5){
   System.out.println("Thread 2 is good");
   System.out.println("i am sad!");
   i++;
  }
 }
}

public class Thread_By_Extending_Thread_Class {
 public static void main(String[] args) {
  MyThread1 t1=new MyThread1();
  MyThread2 t2=new MyThread2();
  t1.start();
  t2.start();
 }
}
