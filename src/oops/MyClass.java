package oops;

abstract public class MyClass {
    public void cal(){
        System.out.println("Calculating Results");
    }

    abstract public void launchRocket();

}

class start {
    public static void main(String args[]) {
        MyChild mychild = new MyChild();
        mychild.launchRocket();

    }
}

