public class Method_Overloading {
    // 1)
//    static void tellJoke(){
//        System.out.println("I invented a newnword!\n"+"Plagiarism");
//    }
//    static void change1(int a){
//        a=98;
//    }
   static void change2(int []arr){
        arr[0]=98;
       int n=arr.length;
       for(int i=1;i<n;i++)
           arr[i]=10;
   }


      // 2)
   static void fun(){
       System.out.println("Good Morning bro!");
   }
   static void fun(int a){
       System.out.println("Good Morning "+a+" bro");
   }
    static void fun(int a,int b){           //parameters
        System.out.println("Good Morning "+a+" bro");
        System.out.println("Good Morning "+b+" bro");
    }

    public static void main(String[] args) {

     // 2)
        // fun();
        // fun(30);
        // fun(10,20);      // Arguments are actual



        // 1)
//       //tellJoke();
//
//        //changing the integer
////        int x=45;
////        change1(x);        //it does not change the value of x,because its pass copy of the variable
////        System.out.println("The value of X after running change is "+x);


//        //changing the array
       int []marks =  {52,73,77,89,98,94};
       int n=marks.length;
       change2(marks);   //it is change the value of marks,because it passed reference/address
//        System.out.println("The value of marks[0] after running change is "+marks[0]);
       System.out.println("After changing array elements :");
       for (int i=0;i<n;i++)
           System.out.print(marks[i]+" ");
    }
}
