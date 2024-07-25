package LearnCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeSet;
import java.util.function.Consumer;

public class TraverseExample {

    public static void main(String args[]) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Priyaa");
        names.add("xyz");
        names.add("Tina");

        System.out.println("_______REVERSE STRING_________");
        //for each loop
        for(String str:names){
            System.out.print(str+ "\t"+str.length()+ "\t");
            StringBuffer br = new StringBuffer(str);
            System.out.println(br.reverse());
        }

        System.out.println("___________Forward Traversing_________________");

        //Traversing Using ITERATOR : FORWARD Traversing
        Iterator<String> itr = names.iterator();
        {
            while (itr.hasNext()){
                String next = itr.next();
                System.out.println(next);
            }

        }
        System.out.println("________Backward Traversing______________________");
        // Backward Traversing : ListIteration
        ListIterator<String> litr = names.listIterator(names.size());
          while (litr.hasPrevious()){
              String previous= litr.previous();
              System.out.println(previous);
          }

          System.out.println("___________FOR EACH METHOD_____________");

          //for each method
         names.forEach(e->{
             System.out.println(e);
         });

         System.out.println("_______SORTING ELEMENT__________");

        TreeSet<String> set = new TreeSet<>();
        set.addAll(names);
        set.forEach(e ->{
            System.out.println(e);
        });

    }

}
