package Thread;

//Thread Using Runnable Interface
class MyThread implements Runnable{

    public void run(){
        //task for thread
        for(int i=1;i<=10;i++){
            System.out.println("Value of i is :"+i);
            try {
                Thread.sleep(1000);
            } catch (Exception e){
                System.out.println("Error:"+e.getMessage());
            }

        }

    }

    public static void main(String args[]){

        MyThread t1 = new MyThread();
        Thread tr = new Thread(t1);
        tr.start();
    }

}
