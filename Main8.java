import java.util.Scanner;
import java.lang.Math;

public class Main8 {
    public static void main(String[] args) {
        int num, rev = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number :");
        num = sc.nextInt();
        int length = (int) Math.log10(num) + 1;

        for (int i = 0; i < length; i++) {
            rev = rev + num % 10 * ((int) Math.pow(10, length - 1 - i));
            num = num / 10;
        }
        System.out.println("The reversed number is " + rev);
        sc.close();
    }
}
