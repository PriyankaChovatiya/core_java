package Abstarction_OOP;

//Abstraction: It hides the background details
//Abstraction Using Classes

abstract class Animal {

    //1st method
    public void sleep(){
        System.out.println("Sleeping");
    }

    //2nd Abstract method : Abstract method does not have body
    abstract public void animalSound();
}

class pig extends Animal{
    //body of the animalSound
    public void animalSound(){
        System.out.println("Pig is voice : wee wee");
    }
}

class main{
    public static void main(String args[]){
        pig p1 = new pig();
        p1.animalSound();
        p1.sleep();
    }
}
