// methods are used inside the class and functions are used outside the class


import java.util.Scanner;

public class Methods {
    //static function is called only static function , normal function does called directly
//    static int logic(int x,int y){
//               int z;
//               if(x>y)
//                   z=x+y;
//               else
//                   z=(x+y)*5;
//           return z;
//    }



    //normal function will called using object
     int logic(int x,int y){
               int z;
               if(x>y)
                   z=x+y;
               else
                   z=(x+y)*5;
           return z;
    }



    //sum of two numbers 
    static int sum(int a,int b){    //function defintion time receives values called parameters
        return a+b;
    }


    // sum of all dgitis an number
    static int sum(int a){
        int sum=0;
        while(a>0){
            sum+=a%10;
            a/=10;
        }
        return sum;
    }

    static float sum(float a,float b){
        return a*b;
    }

    static char returnchar(char ch1,char ch2){
        return ch1;
    }

    // print maximum number in the sum of given numbers
    static int max(int a,int b){
        int sum=a+b;
        int max=0;
        while(sum>0){
            int rem=sum%10;
            if(rem>max)
              max=rem;
            sum/=10;
        }
        return max;
    }

    public static void main(String[] args) {
        // static function method
//        int a=5;
//        int b=7;
//        int c = logic(a,b);   // function calling time passed values called arguments
//        int a1=16;
//        int b1=14;
//        int c1=logic(a1,b1);
//        System.out.println(c);
//        System.out.println(c1);




        // normal function method
        // int a=5;
        // int b=7;
        // Methods obj = new Methods();
        // int c = obj.logic(a,b);
        // int a1=16;
        // int b1=14;
        // int c1=obj.logic(a1,b1);
        // System.out.println(c);
        // System.out.println(c1);




        // Scanner sc=new Scanner(System.in);
        // System.out.println("enter first number:");
        // int a=sc.nextInt();
        // System.out.println("Enter second number:");
        // int b=sc.nextInt();
        // System.out.println("sum "+sum(a, b));




        // Scanner sc=new Scanner(System.in);
        // System.out.println("enter first number:");
        // int a=sc.nextInt(); 
        // System.out.println("sum "+sum(a));




        // Scanner sc=new Scanner(System.in);
        // System.out.println("enter first number:");
        // float a=sc.nextFloat();
        // System.out.println("Enter second number:");
        // float b=sc.nextFloat();
        // System.out.println(sum(a, b));




        // Scanner sc=new Scanner(System.in);
        // System.out.println("enter first char:");
        // char a=sc.next().charAt(0);
        // System.out.println("enter second char:");
        // char b=sc.next().charAt(0);
        // System.out.println(returnchar(a, b));

        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number:");
        int a=sc.nextInt();
        System.out.println("Enter second number:");
        int b=sc.nextInt();
        System.out.println(max(a, b));

    }
}
