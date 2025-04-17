import java.util.Scanner;

public class Unique_Elements_In_Two_Arrays {
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

  // elements of 1nd array whose not present in 2st array

  for(i=0;i<size1;i++){
   for(j=0;j<size2;j++){
    if(arr1[i]==arr2[j])
       break;
   }
   if(j==size2){
    temp[k]=arr1[i];
    k++;
   }
  }

  // elements of 2nd array whose not present in 1st array

  for(i=0;i<size2;i++){
   for(j=0;j<size1;j++){
    if(arr2[i]==arr1[j])
       break;
   }
   if(j==size1){
    temp[k]=arr2[i];
    k++;
   }
  }

  System.out.println("Unique elements:");
  for(int x=0;x<k;x++)
     System.out.print(temp[x]+" ");



 }
}
