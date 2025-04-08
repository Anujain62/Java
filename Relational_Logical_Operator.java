public class Relational_Logical_Operator {
    public static void main(String[] args) {

        //relational operators ->  ==(equal) , >= , <= , !=
        //logical operator ->      && - AND , || - OR , ! - NOT

        boolean a= true;
        boolean b= false;
        System.out.println("For Logical AND...");
        if(a && b)
            System.out.println("Y");
        else
            System.out.println("N");
        System.out.println("For Logical OR...");
        if(a || b)
            System.out.println("Y");
        else
            System.out.println("N");
        System.out.println("For Logical Not..");
        System.out.print("Not a is ");
        System.out.println(!a);
    }
}
