
class Employee{
    String name;
    int id;
    double hourlyRate;

    public Employee(String name, int id, double hourlyRate){
        this.name = name;
        this.id = id;
        this.hourlyRate = hourlyRate;
    }

    public double getMonthlySalary(){
        return 24 * 30 * hourlyRate;
    }
}

class FullTimeEmployee extends Employee{
    double salary;
    double benefits;

    public FullTimeEmployee(String name, int id, double hourlyRate, double salary, double benefits){
        super(name, id, hourlyRate);
        this.salary = salary;
        this.benefits = benefits;
    }

    public double getMonthlySalary(){
        return super.getMonthlySalary() + benefits;
    }
}

class PartTimeEmployee extends Employee{
    int numberOfHoursWorked;
    double overtimeRate;

    public PartTimeEmployee(String name, int id, double hourlyRate, int numberOfHoursWorked, double overtimeRate){
        super(name, id, hourlyRate);
        this.numberOfHoursWorked = numberOfHoursWorked;
        this.overtimeRate = overtimeRate;
    }

    public double getMonthlySalary(){
        return numberOfHoursWorked * hourlyRate + overtimeRate;
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee("Srujan", 1, 3000.0, 5000.0, 500);
        Employee e2 = new PartTimeEmployee("John", 2, 4000, 10, 1500);

        System.out.println(e1.getMonthlySalary());
        System.out.println(e2.getMonthlySalary());
    }
}
