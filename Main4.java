import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        int num;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        num = sc.nextInt();

        char result;
        result = num % 2 == 0 ? 'y' : 'n';

        System.out.println(result);

        sc.close();
    }
}
