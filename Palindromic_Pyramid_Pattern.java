import java.util.Scanner;

         //    1
         //   212
         //  32123
         // 4321234   



public class Palindromic_Pyramid_Pattern {
 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter number of lines :");
  int n=sc.nextInt();

  for(int i=1;i<=n;i++){
   for(int j=1;j<=n-i;j++)
     System.out.print("  ");
   for(int j=i;j>=1;j--)
     System.out.print(j+" ");
   for(int j=2;j<=i;j++)
     System.out.print(j+" ");
   System.out.println();
  }

 }
}
