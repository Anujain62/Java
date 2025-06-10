// You have to create a custom calculator with following operations:
// 1) addition
// 2) subtraction
// 3) multiplication
// 4) division

// which throws the following exceptions:
// 1) invalid input exception  ex: 8 & 9
// 2) cannot divide by 0 exception
// 3) max input exception if any of the input is greater than 100000
// 4) max multiplier reached exception -> don't allow any multiplication input to be greater than 7000


class Calculator{
 private int ans , a , b;
 private double result , x , y;

 void setValue(int a,int b){
  this.a = a;
  this.b = b;
 }
 
 int addition(){
  ans = a+b;
  return ans;
 }
 
 int subtraction(){
  ans = a-b;
  return ans;
 }

 int multiplication(){
  ans = a*b;
  return ans;
 }

 double division(){

  result = a/b;
  return result;
 }


}


public class Custom_Calculator {
 public static void main(String[] args) {
  
 }
}
