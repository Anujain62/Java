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
    public static void main(String[] args) {
        // static function method
//        int a=5;
//        int b=7;
//        int c = logic(a,b);
//        int a1=16;
//        int b1=14;
//        int c1=logic(a1,b1);
//        System.out.println(c);
//        System.out.println(c1);


        // normal function method
        int a=5;
        int b=7;
        Methods obj = new Methods();
        int c = obj.logic(a,b);
        int a1=16;
        int b1=14;
        int c1=obj.logic(a1,b1);
        System.out.println(c);
        System.out.println(c1);


    }
}
