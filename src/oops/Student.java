package oops;

class Student {

    //data: data Members: instance variable (properties)
    int StudentId;
    String StudentName;
    String StudentCity;

    //Behaviour: members methods : methods (Function)
    public void Study(){
        System.out.println(StudentName+ " is studying");
    }

    public void StudentFullDetails(){
        System.out.println("Student id: "+StudentId);
        System.out.println("Student Name: "+StudentName);
        System.out.println("Student City: "+StudentCity);
    }

}
