package Inheritance_OOPS;

class vehicle {
    String brand = "Ford";
    public void honk(){
        System.out.println("tut ttuttt!");
    }
}

class car extends vehicle{
    String ModelName = "Mustang";
    public void model(){
        System.out.println("Model name : " +ModelName);
    }
}

class Main{
    public static void main(String args[]){
        car c1 = new car();
        c1.honk();
        c1.model();
        System.out.println(c1.brand+ " and "+c1.ModelName);

    }
}
