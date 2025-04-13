// create a class named test with an instance variable value.create an object and try to
// print the value without assigning any value to it. observe the output

class  Test{
    public int value;
    public static int x;

}

public class Class_Test {
    public static void main(String[] args) {
        Test t=new Test();
        System.out.println("Value :"+t.value);
        System.out.println("value of x :"+Test.x);

        // it gives by default value 0
        // static variable is also gives value 0 by default
    }
}
