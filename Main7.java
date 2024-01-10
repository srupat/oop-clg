import java.lang.Math;


public class Main7 {
    public static boolean isPrime(int num) {
        boolean flag = true;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                flag = false;
                break;
            }
        }
        if(flag) return true;
        else return false;
    }
    public static void main(String[] args) {
        for (int i = 2; i < 10; i++) {
            if(isPrime(i)) System.out.println(i);
        }
    }

}
