public class Variable_Arguments {

    // 1)
    //function overloading
//    static int sum(int a,int b){
//        return a+b;
//    }
//    static int sum(int a,int b,int c){
//        return a+b+c;
//    }
//    static int sum(int a,int b,int c,int d){
//        return a+b+c+d;
//    }


    // it is decrease function overloading
    static int sum(int ...arr){
        // Available as int [] array
        int result=0;
        for(int a:arr)
            result+=a;
        return result;
    }


    public static void main(String[] args) {
        System.out.println("Welcome to varargs tutorial");
        System.out.println("Sum of nothing "+sum());         // it gives 0
        System.out.println("Sum of a and b "+sum(2,3));
        System.out.println("Sum of a,b and c "+sum(2,3,4));
        System.out.println("Sum of a,b,c and d  "+sum(2,3,4,5));
    }
}
