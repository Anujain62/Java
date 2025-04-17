import java.util.Scanner;

public class Common_Elements_In_Two_Array {
 public static void main(String[] args) {
  
   Scanner sc=new Scanner(System.in);

  System.out.println("Enter size of first array:");
  int size1=sc.nextInt();

  System.out.println("Enter size of second array:");
  int size2=sc.nextInt();

  int [] arr1=new int[size1];
  System.out.println("Enter elemnets of first array:");
  for(int i=0;i<size1;i++){
   arr1[i]=sc.nextInt();
  }

  int [] arr2=new int[size2];
  System.out.println("Enter elements of second array:");
  for(int i=0;i<size2;i++){
   arr2[i]=sc.nextInt();
  }

  int [] temp=new int[size1+size2];
  int k=0;

  int i;
  int j;
   for(i=0;i<size1;i++){
    for(j=0;j<size2;j++){
     if(arr1[i]==arr2[j]){
      temp[k]=arr1[i];
      k++;
     }
    }
   }

   System.out.println("Common elements :");
   for(int x=0;x<k;x++)
     System.out.print(temp[x]+" ");
 
 }
}
