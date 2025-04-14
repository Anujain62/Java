// create a method that prints "welcome to java methods" twice without using loop

public class Print_Two_Times_Same_Value_Without_Using_Loop {

    static void method(int n){
        if(n>0){
            System.out.println("Welcome to Java Methods");
            method(n-1);
        }
    }

    public static void main(String[] args) {
        method(2);
    }
}
