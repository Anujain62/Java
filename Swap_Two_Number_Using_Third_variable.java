public class Swap_Two_Number_Using_Third_variable {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int c;
        System.out.println("Original value of a and b :"+a+" "+b);
        c=a;
        a=b;
        b=c;
        System.out.println("After swaping values of a and b :"+a+" "+b);
    }
}
