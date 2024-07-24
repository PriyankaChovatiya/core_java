package oops;

public class Demo {
    public static void main(String args[]){

        //Now create Object
        Student st1,st2;
        st1 = new Student();

        st1.StudentId   = 10;
        st1.StudentName = "Priyaa";
        st1.StudentCity = "Guj";
        st1.Study();
        st1.StudentFullDetails();

            System.out.println();

        st2 = new Student(1020, "Priyaa M", "Banglore");

//        st2.StudentId   = 20;
//        st2.StudentName = "MasterMind";
//        st2.StudentCity = "Raj";
        st2.Study();
        st2.StudentFullDetails();


    }
}
