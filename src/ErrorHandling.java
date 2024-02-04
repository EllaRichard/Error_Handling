public class ErrorHandling {
    public static void main(String[]args){

        float sum = 0;

        for (String argument : args){

            try {

                sum = sum + Float.parseFloat(argument);
            } catch (Exception e) {

                //System.out.print ("Exception message: " + e.getMessage());
                System.out.println (argument + " is not a number ");
            }
        }
        System.out.println ("Sum is: " + sum);
    }
}
