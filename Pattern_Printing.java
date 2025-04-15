

import java.util.Scanner;

public class Pattern_Printing {
    public static void main(String[] args) {

        
//           ****
//           ***
//           **
//           *
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter number of lines :");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
