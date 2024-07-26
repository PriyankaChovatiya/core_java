package Thread;

 class tr extends Thread{

    //Task for thread
    public void run(){
        for (int i=1;i<=10;i++){
            System.out.println("values of the i Is : "+i);
            try {
                tr.sleep(1000);
            } catch (Exception e){
                System.out.println("Error :" +e.getMessage());
            }


        }
    }

    public static void main(String args[]){
        tr t = new tr();
        t.start();

    }
}
