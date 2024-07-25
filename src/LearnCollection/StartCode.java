package LearnCollection;

//Importing all the classes (util package) .
import Poly.Student;

import java.util.*;

public class StartCode {
    public static void main(String args[]){
    System.out.println("Learn Java Collection framework");

    /*
    * Creating Collection
    *
    * There are the two type to create the collection
    * 1. Type safe : same type of the all the elements
    *
    * 2. Un Type Safe : Different types of the elements
    *
    * */

    // 1. ArrayList - same type
        //Type safe
        ArrayList<String> names= new ArrayList<String>();
        names.add("Priyaa");
        names.add("Akshat");
        names.add("Master");
        names.add("Mind");
        names.add("Divya");


        //get Index values
        System.out.println("Index 0 : "+names.get(0));
        System.out.println("Index 1 : "+names.get(1));

        //remove the values
        names.remove("Mind");
        names.add(4,"Divya");

        //Size (Starts form 1)
        System.out.println("Size="+names.size());

        //In array item present or not
        System.out.println("It Contains : " +names.contains("Priyaa"));

        //check for empty
        System.out.println("Empty is : " +names.isEmpty());

        //Setting values
        names.set(3,"Mind");

        //Display an array
        System.out.println(names);




        System.out.println(" ");

    //2. LinkedList : different type
        //Un Type Safe
        LinkedList list= new LinkedList();
        list.add(1020);
        list.add("Priyaa");
        list.add("Divya");
        System.out.println(list);

        //get the index values
        System.out.println("index 0 : "+list.get(0));
        System.out.println("index 1 : "+list.get(1));

        System.out.println(" ");
    // 3. Vector : different types or same also
     Vector<String> vector = new Vector<>();
        vector.addAll(names);

     System.out.println("Vector: "+vector);

     System.out.println(" ");

    // 4. Stack
    Stack st = new Stack();
    st.push(10);
    st.push(20);
    st.push("Priyaa");
    System.out.println(st);
    st.pop();
    System.out.println(st);

        //Hash set : provide item in order
        HashSet<Double> nms = new HashSet<>();
        nms.add(12.90);
        nms.add(1020.907);
        nms.add(45.78);
        System.out.println("nms:"+nms);
    }


}
