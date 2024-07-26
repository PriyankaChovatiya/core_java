package Thread;

public class Main {
    public static void main(String args[]){

        company comp = new company();
        Producer prod = new Producer(comp);
        Consumer cons = new Consumer(comp);
        prod.start();
        cons.start();
    }
}
