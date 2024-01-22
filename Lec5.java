import java.util.Scanner;


public class Lec5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num; String str; float a; boolean flag;
        System.out.println("Enter num");
        num = sc.nextInt();
        System.out.println("Enter string");
        str = sc.nextLine();
        System.out.println("Enter float");
        a = sc.nextFloat();
        System.out.println("Enter booleans");
        flag = sc.nextBoolean();
        System.out.println(num);
        System.out.println(str);
        System.out.println(a);
        System.out.println(flag);
        
    }
}