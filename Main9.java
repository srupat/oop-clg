import java.util.Scanner;

public class Main9 {
    public static void main(String[] args) {
        int num, rev = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number :");
        num = sc.nextInt();
        int temp = num;
        int length = (int) Math.log10(num) + 1;

        for (int i = 0; i < length; i++) {
            rev = rev + num % 10 * ((int) Math.pow(10, length - 1 - i));
            num = num / 10;
        }
        if(temp == rev) System.out.println("The given number is a palindrome");
        else System.out.println("The given number is not a palindrome");

        sc.close();
    }
    
}
