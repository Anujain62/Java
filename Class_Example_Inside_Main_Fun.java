// create a class named example inside the main method that declares a local variable num
// but does not assign any value to it. try to print num and observe the output

public class Class_Example_Inside_Main_Fun {
    public static void main(String[] args) {
        class Example {
             public int num;
        }
        Example e=new Example();
        System.out.println(" value of num :"+e.num);
        // it gives by default value 0
    }
}
