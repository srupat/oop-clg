import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
        char operator;
        int num1, num2, result;
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the operator : +, -, *, /");
        operator = sc.next().charAt(0);

        System.out.println("Enter the first number");
        num1 = sc.nextInt();

        System.out.println("Enter the second number");
        num2 = sc.nextInt();

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println(result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println(result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println(result);
                break;
            case '/':
                result = num1 / num2;
                System.out.println(result);
                break;
            default:
                System.out.println("Invalid Operator!");
                break;
        }
        sc.close();
    }
}