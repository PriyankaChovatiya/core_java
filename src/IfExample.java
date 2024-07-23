class IfExample {

    public static void main(String arg[]){
        int num = 1020;

        if ( num > 0){
            if(num%2 == 0){
                System.out.println("The number is Even");
            }else{
                System.out.println("The number is Odd");
            }
        }else{
            System.out.println("Number is not valid ");
        }

    }
}
