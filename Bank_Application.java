import java.time.*;
import java.util.ArrayList;
import java.util.Scanner;

class Transaction{
 String type;
 double amount;
 LocalTime time;
 public Transaction(String type,double amount){
  this.type = type;
  this.amount = amount;
  time = LocalTime.now();
 }
 public String toString(){
  return type+", Rs "+amount+" "+time;
 }
}

class Account{
 Scanner sc = new Scanner(System.in);
 private double accAmount = 100000000;
 private String name;
 private int accNum;
 private double balance;
 private int aadharNum;
 private int phoneNum;
 Account(){}
 public Account(String name){
  AccCreation creation = new AccCreation();
  this.name = name;
  this.accNum = (int)Math.random()*10;
  this.balance = 0;
 }
 void accCreation(String name){
  if(this.name.contains(name)){
   System.out.println("Account already exist!");
  }
  else{
   AccCreation creation = new AccCreation();
   System.out.println("Enter Aadhar number");
   aadharNum = sc.nextInt();
   System.out.println("Enter phone number:");
   phoneNum = sc.nextInt();
   
  }
 }
 private ArrayList<Transaction> transactions = new ArrayList<>();

 public void Deposit(double amount){
  if(amount>0){
   Transaction tran = new Transaction("Deposit",amount);
   transactions.add(tran);
   balance+=amount;
   System.out.println("Deposited successfully!");
  }
 }
 public void Withdraw(double amount){
  if(amount<balance){
   Transaction tran  = new Transaction("Withdraw", amount);
   transactions.add(tran);
   balance-=amount;
   System.out.println("Withdraw Successfully!");
  }
  else{
   System.out.println("Insufficient Balance!");
  }
 }
 public double getBalance(){
  return balance;
 }
 public void viewTransection(){
  System.out.println("Account Holder :"+name);
  System.out.println("Account number :"+accNum);
  System.out.println(transactions.toString());
 }
 public void getLoan(double amount){
  if(amount<accAmount){
   Transaction tran  = new Transaction("Loan", amount);
   transactions.add(tran);
   accAmount-=amount;
   balance+=amount;
   System.out.println("You get loan successfully!");
  }
  else{
   System.out.println("Somethis went wrong,Please wait!");
  }
 }
 public String toString(){
  return "Name = "+this.name+" , Account Number"+this.accNum+" , balance = "+this.balance;
 }
}

class AccCreation{

 ArrayList<Account> account = new ArrayList<>();
 AccCreation(){
  Account acc = new Account();
  account.add(acc);
 }
 public void viewAccounts(){
  System.out.println(account.toString());
 }

}

public class Bank_Application {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter name:");
  String name = sc.nextLine();
  Account acc = new Account(name);
  System.out.println("Account is created successefully!");
  int choice;
  do{
   System.out.println("1 - Deposit\n2 - Withdraw\n3 - Check Balance\n4 - View Transection\n5 - Get Loan\n6 - Account Creatin\n7 - View All Accounts\n8 - Exit");
   System.out.println("Enter choice:");
   choice = sc.nextInt();
   switch(choice){
    case 1:
      System.out.println("Enter amount:");
      double amount = sc.nextDouble();
      acc.Deposit(amount);
      break;
    case 2:
      System.out.println("Enter amount:");
      amount = sc.nextDouble();
      acc.Withdraw(amount);
      break;
    case 3:
      System.out.println("Balance :"+acc.getBalance());
      break;
    case 4:
      acc.viewTransection();
      break;
    case 5:
      System.out.println("Enter amount:");
      amount = sc.nextDouble();
      acc.getLoan(amount);
      break;
    case 6:
      System.out.println("Enter name:");
      name = sc.next();
      acc.accCreation(name);
      break;
    case 7:
        AccCreation ac = new AccCreation();
        ac.viewAccounts();
        break;
    case 8:
        System.out.println("Exit!");    
        break;
    default :    
      System.out.println("Invalid option, Try again!");      
   }
  }while (choice!=8);
  sc.close();
 }
}
