import java.util.Scanner;

class InvalidEmailException extends Exception {
    public InvalidEmailException(String message){
        super(message);
    }
}

public class exam4 {
    public static boolean isValidEmail(String email){
        int atPos = email.indexOf('@');
        int dotPos = email.lastIndexOf('.');

        return atPos != -1 && dotPos != -1 && atPos < dotPos;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an email address");
        try{
            String email = sc.nextLine();
            if(!isValidEmail(email))
                throw new InvalidEmailException("Invalid email. Please enter valid email address");
            else
                System.out.println("Valid email address");
        }
        catch(InvalidEmailException e){
            System.out.println(e.getMessage());
        }
    }
}
