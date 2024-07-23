public class BreakContinueStatement {

    public static void main(String args[]){

        //continue statement : skip that iteration
        for(int i=0;i<=20;i++){
            System.out.print(i+" ");
           if(i==10){
               continue;
           }
           System.out.println("end");
        }
    }
}
