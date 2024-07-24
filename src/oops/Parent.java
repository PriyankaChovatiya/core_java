package oops;

public class Parent {
    // Method Overridden
    public void p1(){
        System.out.println("it is a p1() method for parent");
    }
}

class Child extends Parent{
    // Method Overriding
    public void p1(){
        System.out.println("It is a p1() method for child");
    }

}

class co_child extends Child{
    public void p1(){
        System.out.println("It is a p1() method for co_child");
    }
}
