class IfExample {

    public static void main(String arg[]){
        int marks = 91;

        if(marks > 90){
            System.out.println("Grade A");
        }else if( marks > 80 && marks <= 90){
            System.out.println("Grade B");
        }else if (marks <= 80) {
            System.out.println("Fail");
        }else{
            System.out.println("Not valid Outputs");
        }

    }
}
