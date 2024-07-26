package Thread;

public class company {
      int n;

      //If f = false : chance producer
    //If f = true : chance Consumer
      boolean f = false;

   synchronized public void produce_item(int n){
       if(f){
           try {
               wait();
           } catch (Exception e){
               System.out.println("Error");
           }
       }

       this.n = n;
       System.out.println("Produced : " +this.n);
       f = true;
       notify();
    }

   synchronized public int consume_item(){
       if (!f){
           try {
               wait();
           } catch (Exception e){
               System.out.println("Error");
           }
       }
       System.out.println("Consumes : " +this.n);
       f = false;
       notify();
       return this.n;
    }
}
