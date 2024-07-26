package Generic_class;
import java.util.*;

class Test<T>{

    // T: generic type
    // container : Object

    //creating object
    T container;

    //class method
    Test(T container){
        this.container = container;
    }

    //method to get value
    public T getValue(){
        return this.container;
    }


  public static class main{
        public static void main(String[] args){

            System.out.println("______Integer________");
            //instanceof Integer
            Test<Integer> i = new Test<Integer>(1020);
            System.out.println("values: "+i.getValue());

            System.out.println("Belong to which types: "+i.getClass().getName());

            System.out.println("_____String_________");
            //instanceof String
            Test<String> s = new Test<String>("hello I'm Priyaa");
            System.out.println("Values: "+s.getValue());
            System.out.println("Belong to which types: "+s.getClass().getName());

            System.out.println("______Boolean_________");
            //Instance of Boolean
            Test<Boolean> b = new Test<Boolean>(true);
            System.out.println("Values :" +b.getValue());
            System.out.println("Belong to which types: "+b.getClass().getName());

        }
    }

}
