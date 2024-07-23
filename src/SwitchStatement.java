class SwitchStatement {

    public static void main(String args[]){

        String Day ="Monday";

        switch(Day){
            case "Monday":
                System.out.println("It is Monday");
                break;
            case "Tuesday":
                System.out.println("It is Tuesday");
                break;
            case "Wednesday":
                System.out.println("It is Wednesday");
                break;
            case "Thursday":
                System.out.println("It is Thursday");
                break;
            case "Friday":
                System.out.println("It is Friday");
                break;
            case "Saturnday":
                System.out.println("It is Saturnday");
                break;
            case "Sunday":
                System.out.println("It is Sunday");
                break;
            default:
                System.out.println("Invalid Day");
                break;
        }
    }
}
