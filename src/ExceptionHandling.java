public class ExceptionHandling {
    public static void main(String[] args) {

        try
        {
            ThrowingException throwingException=new ThrowingException();
            throwingException.checkException(20,1000,"9587445589");
            throwingException.checkException(20,-1000,"6577445589");
           // String str=null;
            //System.out.println(str.length());
        }
        catch (InvalidAgeException |InvalidAmountException | InvalidPhoneNumberException | NullPointerException exception)
        {
            System.out.println(exception.getMessage());
            //exception.printStackTrace();
        }
        finally {
            System.out.println("This is finally block");
        }
    }
}
