import java.io.*;
class Math {
    void sum (int a) {
        a = a + 10;
        System.out.println("The value of a is " + a);
    }
}

public class lec2501 {
    int num;
    static int update(int num)
    {
        return ++num;
    }
    public static void main(String[] args) {
        Math m = new Math();
        int a = 20;

        m.sum(a);
        System.out.println("The value of a is "+a);

        int num = 3;
        System.out.println("The value of num is " +num);

        int returnnum = update(num);
        num = returnnum;

        System.out.println("The value of num is " +num);
    }
}
