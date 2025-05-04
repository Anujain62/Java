
// 1) create an arraylist and store names of 10 students inside it. print it using a for-each loop

// import java.util.ArrayList;
// import java.util.Scanner;

// public class Practice_Set {
//  public static void main(String[] args) {

//   Scanner sc=new Scanner(System.in);
//   ArrayList<String> arr=new ArrayList<>(10);
//   for(int i=1;i<=10;i++){
//    System.out.println("Enter name of "+i+" student :");
//    String str=sc.next();
//    arr.add(str);
//   }

//   System.out.println("List of students :");
//   for(String str: arr)
//     System.out.println(str);

//  }
// }






// 2) Use the date class in java to print in the following format -> 21:47:02

// import java.sql.Date;
// import java.util.*;

// public class Practice_Set {

//  public static void main(String[] args) {

//   Date d = new Date() ;    -> IT GIVES ERROR
//   System.out.println(d.getHours() + ":" + d.getMinutes() + ":" + d.getSeconds());
//  }
// }






// 3) Repeat question 2nd using the calendar class

// import java.util.Calendar;

// public class Practice_Set {

//  public static void main(String[] args) {

//   Calendar c=Calendar.getInstance();
//   System.out.println(c.get(Calendar.HOUR_OF_DAY)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));

//  }
// }






// 4) Repeat question 2nd using java.time API

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Practice_Set {

 public static void main(String[] args) {

  LocalDateTime dt=LocalDateTime.now();
  DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:MM:SS");
  String time=dt.format(dtf);
  System.out.println(time);

 }
}







// 5) create a set in java. try to store duplicate elements inside this set and verify that only one instance is stored

// import java.util.HashSet;
// import java.util.Scanner;

// public class Practice_Set {

//  public static void main(String[] args) {
//   Scanner sc=new Scanner(System.in);
//   HashSet<Integer> s=new HashSet<>();
//   System.out.println("Enter elements of set:");
//   boolean flag=true;

//   while (flag) {
//    int x=sc.nextInt();
//    s.add(x);
//    System.out.println("Do you want to continue:");
//    char ch=sc.next().charAt(0);
//    if(ch=='n' || ch=='N')
//      flag=false;
//   }

//   System.out.println(s);

//  }
// }





