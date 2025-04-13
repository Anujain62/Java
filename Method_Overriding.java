
class A{
    public int a;
    public int anu(){
        return 4;
    }
    public void meth2(){
        System.out.println("I am method 2 of class A");
    }
}
class B extends A{
    @Override  // it showes override notation and it is optional,
    // but some times it is important because it checks function is override or not and gives error if function does not override
    public void meth2(){
        System.out.println("I am method 2 of class B");
    }
    public void meth3(){
        System.out.println("I am method 3 of class B");
    }
}

public class Method_Overriding {

    public static void main(String[] args) {
        A a=new A();     // it called meth2() of class A
        a.meth2();
        B b=new B();    // it called meth2() of class B
        b.meth2();
    }
}