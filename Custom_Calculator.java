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
 private int ans , a , b,p,q,s,t;
 private double result , x , y;

 void setValAdd(int a,int b){
  this.a = a;
  this.b = b;
 }
 void getVarAdd(){
  System.out.println("a = "+a+"\nb = "+b);
 }
 int addition(){
  ans = a+b;
  return ans;
 }

 void setValSub(int p,int q){
  this.p = p;
  this.q = q;
 }
 void getVarSub(){
  System.out.println("p = "+p+"\nq = "+q);
 }
 int subtraction(){
  ans = p-q;
  return ans;
 }

 void setValMul(int s,int t){
  this.s = s;
  this.t = t;
 }
 void getVarMul(){
  System.out.println("s = "+s+"\nt = "+t);
 }
 int multiplication(){
  ans = a*b;
  return ans;
 }

 void setValDiv(int x,int y){
  this.x = x;
  this.y = y;
 }
 void getVarDiv(){
  System.out.println("x = "+x+"\ny = "+y);
 }
 double division(){
  int result = a/b;
  return result;
 }


}


public class Custom_Calculator {
 public static void main(String[] args) {
  
 }
}
