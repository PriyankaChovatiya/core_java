package Thread;

class UserThread extends Thread{
    public void run(){
        System.out.println("This is user defined Thread");
    }
}


public class ThreadOP {

    public static void main(String args[]){
        System.out.println("Program Started....");

        //task
        int x= 10+20;
        System.out.println("Sum of x is: " +x);
        //Get the name of the thread
        Thread t = Thread.currentThread();
        System.out.println("Name of the current Thread is : "+t.getName());

        // Set name of the thread
        t.setName("MyMain");
        System.out.println("New Name is: "+t.getName());

        //sleep the current thread
        try {
            Thread.sleep(5000);
        } catch (Exception e){
            System.out.println("Error"+e.getMessage());
        }

        //get the id : getId()
        System.out.println("Thread ID: "+t.getId());

        //Get Priority
        System.out.println("Thread Priority: "+t.getPriority());

        //Set Priority
        t.setPriority(2);
        System.out.println("Thread Priority: "+t.getPriority());

        //Going to start User Defined Thread
        UserThread tr = new UserThread();
        tr.start();

        System.out.println("Program Ended.....");
    }
}
