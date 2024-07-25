package LearnCollection;

import java.util.ArrayList;

public class TraverseExample {

    public static void main(String args[]) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Priyaa");
        names.add("xyz");
        names.add("Tina");

        //for each loop
        for(String str:names){
            System.out.print(str+ "\t"+str.length()+ "\t");
            StringBuffer br = new StringBuffer(str);
            System.out.println(br.reverse());
        }

        System.out.println(names);
    }

}
