public class Predict_Output {
 public static void main(String[] args) {
  
       

   // int n=11_0_00;
   // int m=1_100_0;           //m=_1_1000 -> it gives error
   // System.out.println(n+m);



   // int x=10;
   // if(x==10)
   //   if(x<5)
   //     System.out.println("hello");
   //   else
   //     System.out.println("hii");
   // else
   //   System.out.println("bye");



   // int x=10;
   // if(x=5)             // error -> connot convert int to boolean
   //   System.out.println("hello");
   // else 
   //   System.out.println("hii");



   // int x=3;
   // switch(x){
   //  case 1: 
   //     System.out.println("hello");
   //     break;
   //  case 2:
   //  case 3:
   //      System.out.println("hii");
   //      break;
   //  default:
   //      System.out.println("bye");
   // }





   // int x=2;
   // switch(x+2){
   //  case 3:
   //     System.out.println("hello");
   //     break;
   //  case 4:
   //     System.out.println("hii");
   //     break;
   //  default:
   //     System.out.println("bye");
   // }





   // if(true)
   //   break;     ->error -> break is used only inside the loop or switch statement




   // System.out.println('j'+'a'+'v'+'a');
   // here all characters are considered as char and gives output after adding ASCCI values of all characters




   // range of Integer -128 to 127

   // Integer num1 = 100; 
   // Integer num2 = 100; 
   // Integer num3 = 500; 
   // Integer num4 = 500; 
     
   // if(num1==num2){ 
   //     System.out.println("num1 == num2"); 
   // } 
   // else{ 
   //     System.out.println("num1 != num2"); 
   // } 
   // if(num3 == num4){ 
   //     System.out.println("num3 == num4"); 
   // } 
   // else{ 
   //     System.out.println("num3 != num4"); 
   // } 
   // We always thought that whenever two object references are compared using “==”, it always evaluates to “false”. 
   // But here Integer caching changes the results.Integer class has a caching range of -128 to 127. Whenever a number is between this range and autoboxing is used, 
   // it assigns the same reference. That’s why for value 100, both num1 and num2 will have the same reference, but for the value 500 (not in the range of -128 to 127), num3 and num4 will have different reference.





   // public static void main(String arr){ 
          
   // } 
   // We can overload main() too. 
   // But JVM will always call main() that has String[] argument.





/* 
    // the line below this gives an output 
    // \u000d //System.out.println("comment executed"); 
    
    //The reason for this is that the Java compiler parses the unicode character \u000d as a new line and gets transformed into:
*/





    // loop1: 
    // for (int i = 0; i < 5; i++) 
    //  { 
    //     for (int j = 0; j < 5; j++)  
    //     { 
    //         if (i == 3) 
    //             break loop1; 
    //         System.out.println("i = " + i + " j = " + j); 
    //     } 
    // } 





    // for(int i=0;i<5;i++)
    //   for(int j=0;j<5;j++)
    //      System.out.println(i+" "+j);
    //      System.out.println("hii");




    // for(int i=0;i<5;i++)
    //   for(int j=0;j<5;j++);
    //     System.out.println("hii");



    // int i=1;
    // while(i++<=5){
    //     if(i==3)
    //        continue;
    //     System.out.println(i+" ");
    // }



    // int a=5;
    // int b=a++ + ++a;
    // System.out.println(b);



    // int a=10;
    // System.out.println(a);
    // changeA(a);
    // System.out.println(a);



    // int[] arr={10,20,30,40};
    // System.out.println("Original array:");
    // for(int i:arr)
    //   System.out.println(i);
    // changeArr(arr);
    // System.out.println("After changing array:");
    // for(int i:arr)
    // System.out.println(i);




 }

 public static void changeA(int a){
    a=20;
 }

 public static void changeArr(int[] arr){
    arr[0]=5;
    arr[1]=8;
 }


}
