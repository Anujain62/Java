public class Break_Continue_Statement {
    public static void main(String[] args) {

        // break statement
//        for (int i=0;i<5;i++){
//            System.out.println(i);
//            if(i==2){
//                System.out.println("Ending the loop");
//                break;
//            }
//        }
//        System.out.println("Loop ends here");

        for (int i=0;i<5;i++){
            if(i==2){
                System.out.println("Ending the loop");
                continue;
            }
            System.out.println(i);
        }
        System.out.println("Loop ends here");
    }
}
