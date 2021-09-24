import java.util.regex.Pattern;

public class ThrowingException {
    public void checkException(int age,int amount,String phoneNumber) throws InvalidAgeException,InvalidAmountException,InvalidPhoneNumberException
    {
        //Checking age
        if(age>18)
        {
            System.out.println("You are eligible for voting");
        }
        else
        {
            throw new InvalidAgeException("Sorry!! Try After "+(18-age)+" years");
        }
        //checking amount
        if(amount>0)
        {
            System.out.println("Correct amount");
        }
        else {
            throw new InvalidAmountException("Amount must be greater than 0");
        }
        //Checking phone number
        if(Pattern.matches("[789]{1}[0-9]{9}",phoneNumber))
        {
            System.out.println("Correct mobile number");
        }
        else
        {
            throw new InvalidPhoneNumberException("Wrong mobile no!!please check.");
        }
    }
}
