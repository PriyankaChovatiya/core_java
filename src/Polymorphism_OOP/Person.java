package Polymorphism_OOP;

//Polymorphism : data and methods are binds together in single unit
//Private : only access the variable within that class
//TO access outside we are using get and set method
//Get method : get the variable (Return the variable), (getName)
//Set method : set the values (setName)

public class Person {
    //This variable used within the class only
    private String name;

    //getter
    public String getName(){
        return name;
    }

    //setter
    public void setName(String NewName){
        this.name = NewName;
    }
}

class Main{
    public static void main(String args[]){
        Person p1 = new Person();
        p1.setName("Priyaa");
        System.out.println("Name of the Person is: "+p1.getName());
    }
}
