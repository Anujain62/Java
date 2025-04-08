import java.util.Scanner;

class Employee {
    int salary ;
    String name;
    public void setId(int money){
        salary=money;
    }
    public void setName(String employee){
        name=employee;
    }
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    
}



public class Emplooye_Class_With_Properties_And_Methods {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name :");
        String name=sc.nextLine();
        System.out.println("Enter your salary :");
        int salary =sc.nextInt();
        Employee e=new Employee();
        e.setId(salary);
        e.setName(name);
        System.out.println("Employee name :"+e.getName());
        System.out.println("Employee salary :"+e.getSalary());
    }
    
}
