// Return an int array length 3 containing the first 3 digits of pi, {3, 1, 4}.
// makePi() → [3, 1, 4]

public class Return_Array {
 public static int[] makePi() {
  int [] arr = {3,1,4};
  return arr;
}
 public static void main(String[] args) {
  int[] arr=makePi();
  for(int ele:arr)
     System.out.print(ele+" ");
 }
}
