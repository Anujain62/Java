 class Employee {
          int id;
          String name;
          public void printDetails(){
            System.out.println("Inside the employee class :");
            System.out.println("Id :"+id);
            System.out.println("Name :"+name);
          }
}
public class Custom_Class {

    public static void main(String[] args) {
        System.out.println("This is a custom class");
        Employee anu =new Employee(); //Instantiating a new employee object
    
        //setting the attributes
        anu.id = 12;
        anu.name = "Anu";
        anu.printDetails();
        System.out.println("Inside the main method :");
        System.out.println("Id of employee :"+anu.id);
        System.out.println("Name of employee :"+anu.name);
    }
}

