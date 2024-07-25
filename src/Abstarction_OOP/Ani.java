package Abstarction_OOP;
//Abstraction using Interfaces

interface Ani {

        //Interface method does not have body

        //1st
        public void animalVoice();

        //2nd
        public void walk();
    }

    class cat implements Ani{

        //Interfaces method body
        //method 1
        public void animalVoice(){
            System.out.println("cat voice : meow meow");
        }
        //method 2
        public void walk(){
            System.out.println("Sleeping");
        }
    }

  class MainMethod {
        public static void main(String args[]) {
            cat c1 = new cat();
            c1.animalVoice();
            c1.walk();
        }
    }


