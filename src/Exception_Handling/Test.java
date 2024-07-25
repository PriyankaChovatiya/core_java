package Exception_Handling;


class Test
{
    public static void main(String[] args){
        System.out.println("Started....");

        try {
            int n1 = Integer.parseInt(args[0]);
            int n2 = Integer.parseInt(args[1]);
            System.out.println("We got two numbers");
            int result = n1 / n2;
            System.out.println("Division of two number is: " + result);
        } catch (ArithmeticException e){
            System.out.println("Arithmetic error occurred : n2 can not be 0");
            System.out.println(e.getMessage());
        } catch (NumberFormatException e){
            System.out.println("String is not allowed");
            System.out.println(e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of bound");
            System.out.println(e.getMessage());
        }catch (NoClassDefFoundError e){
            System.out.println("No class found");
            System.out.println(e.getMessage());
        }
        System.out.println("Finished....");

    }
}
