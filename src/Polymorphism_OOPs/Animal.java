package Polymorphism_OOPs;

public class Animal {
    public void animalSound(){
        System.out.println("Animal Makes sound");
    }
}

class Pig extends Animal{
    public void animalSound(){
        System.out.println("Pig says : wee wee");
    }
}

class Dog extends Animal{
    public void animalSound(){
        System.out.println("Dog says : bow bow");
    }
}

class main{
    public static void main(String args[]){
        Animal a1 = new Animal();
        Animal p1 = new Pig();
        Animal d1 = new Dog();

        a1.animalSound();
        p1.animalSound();
        d1.animalSound();

    }
}
