import java.util.Scanner;

public class Main5 {

    public static int factorial(int num)
    {
        if(num == 1) 
            return num;
        else return num * factorial(num - 1);        
    }
    public static void main(String[] args) {
        int num;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        num = sc.nextInt();

        System.out.println(factorial(num));

        sc.close();

    }
}
