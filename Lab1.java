import java.util.Scanner;
import java.lang.*;

class Student{
    public int age;
    public String name;
    public int id;

    private Student(String name,int age,int id){
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public static Student createStudent(String name,int age,int id){
        return new Student(name, age, id);
    }


    // public constructor
//    public Student(String name,int age,int id){
//        this.name = name;
//        this.age = age;
//        this.id = id;
//
//        System.out.println("I am a student with name "+this.name+" and age "+this.age+" and roll no "+this.id);
//    }
// default constructor

//    public Student(){
//        System.out.println("This is my default Student constructor");
//    }
}
public class Lab1 {
    public static void main(String[] args) {
        Student student = Student.createStudent("Srujan", 19, 72);
        System.out.println("Student name "+student.name+"\tage\t"+student.age+"\troll no\t"+student.id);
    }
}
