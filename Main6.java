import java.util.Scanner;
import java.lang.Math;

public class Main6 {
    public static void main(String[] args) {
        int num;
        boolean flag = true;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number:");
        num = sc.nextInt();

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("Number is a prime number");
        }
        else System.out.println("Number is not a prime number");
        sc.close();
    }
}
