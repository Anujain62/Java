
class MyEmployee{
    // private access modifier is used for data protection
    private int id;
    private String name;
    public void setName(String n){
        name=n;
    }
    public String getName(){
        return name;
    }
    public void setId(int n){
        id=n;
    }
    public int getId(){
        return id;
    }

}

public class Access_Modifiers_Getters_And_Setters {
    public static void main(String[] args) {
        MyEmployee obj=new MyEmployee();

        // throws an error due to private access modifiers
        // obj.id=45;
        // obj.name="Anu";

        obj.setName("Anu Jain");
        obj.setId(25);
        System.out.println("Employee name :"+obj.getName());
        System.out.println("Employee id :"+obj.getId());
    }
    
}
