package oops;

class Student {

    //data: data Members: instance variable (properties)
    int StudentId;
    String StudentName;
    String StudentCity;

    //default constructor
    public Student(){
        System.out.println("Creating Object: non parameterized constructor");
    }

    //parameterized constructor
    public Student(int st){
        System.out.println("Parameterized constructor");
    }

    //Constructor with students parameters
    public Student(int id,String name, String city){
        StudentId = id;
        StudentName = name;
        StudentCity = city;
    }

    //Behaviour: members methods : methods (Function)
    public void Study(){
        System.out.println(StudentName+ " is studying");
    }
//multiple method : method overloading
    public  void Study(String name){
       StudentName = name;
    }

    public void StudentFullDetails(){
        System.out.println("Student id: "+StudentId);
        System.out.println("Student Name: "+StudentName);
        System.out.println("Student City: "+StudentCity);
    }

}
