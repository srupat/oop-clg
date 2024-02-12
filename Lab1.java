import java.util.Scanner;
import java.lang.*;

class Student {
    private int age;
    private String name;
    private int id;
    private static int count;

    private static String staticMsg;
    private String instanceMsg;

    static {
        staticMsg = "Hello static world";
    }

    {
        instanceMsg = "Hello instance world";
    }

    public static void something(){
        System.out.println("I am a static method");
    }
    public Student(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
        count += 1;
    }

    public Student() {
        this.age = 5;
        this.name = "Srujan";
        this.id = 43;
        count += 1;
    }


    public Student(Student s) {
        this.age = s.age;
        this.name = s.name;
        this.id = s.id;
        count += 1;
    }
}

public class Lab1 {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Ravi", 19, 72);
        Student s3 = new Student(s2);
        System.out.println(Student);
    }
}
