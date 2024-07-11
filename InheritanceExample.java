import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Person{
    String name;
    int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
}

class Employee69 extends Person{
    String designation;
    double salary;

    public Employee69(String name, int age, String designation, double salary){
        super(name, age);
        this.designation = designation;
        this.salary = salary;
    }
}
public class InheritanceExample {
    public static void main(String[] args){
        List<Employee69> employees = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<5;i++){
            System.out.println("Enter the name, age, designation, and salary of person");
            String name = sc.nextLine();
            int age = sc.nextInt();
            sc.nextLine();
            String designation = sc.nextLine();
            double salary = sc.nextDouble();
            sc.nextLine();
            employees.add(new Employee69(name, age, designation, salary));
        }

        List<Employee69> filteredEmployees = employees.stream().filter(e -> e.salary > 5000.0).toList();

        for(Employee69 e : filteredEmployees){
            System.out.println(e.age + e.name + e.designation + e.salary);
        }


    }


    }

