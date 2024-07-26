package Thread;

public class Consumer extends Thread{

    company c;
    Consumer(company c){
        this.c =c;
    }

    public void run(){
        int i = 1;
        while (true){
            this.c.consume_item();
            try {
                Thread.sleep(2000);
            }catch (Exception e){
                System.out.println("Error : "+e.getMessage());
            }
            i++;
        }
    }

}
