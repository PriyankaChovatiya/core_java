package LearnCollection;

import java.util.HashMap;

public class MapExample {
    public static void main(String args[]){

        HashMap<String,Integer> courses = new HashMap<>();

        //Adding element
        courses.put("core java",4000);
        courses.put("Python",5000);
        courses.put("Machine Learning",8000);
        courses.put("Android", 50000);

        System.out.println(courses);

        System.out.println("__________________________________");

        courses.forEach((e1,e2)->{
            System.out.println(e1+"=>"+e2);
        });

    }
}
