import java.util.Scanner;

class MultiThreadedCalculator{

}
public class exam5 {
    public static int add(int a, int b){
        return a + b;
    }
    public static int sub(int a, int b){
        return a - b;
    }
    public static int mul(int a, int b){
        return a * b;
    }
    public static int div(int a, int b){
        return a / b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num 1");
        int a = sc.nextInt();
        System.out.println("Enter num 2");
        int b = sc.nextInt();

        Thread addThread = new Thread(() -> {
            int result = a + b;
            System.out.println("Addition of the two numbers is " + result);
        });
        Thread subThread = new Thread(() -> {
            int result = a - b;
            System.out.println("Subtraction of the two numbers is " + result);
        });
        Thread mulThread = new Thread(() -> {
            int result = a * b;
            System.out.println("Multiplication of the two numbers is " + result);
        });
        Thread divThread = new Thread(() -> {
            int result = a / b;
            System.out.println("Division of the two numbers is " + result);
        });

        addThread.start();
        subThread.start();
        mulThread.start();
        divThread.start();

    }
}
