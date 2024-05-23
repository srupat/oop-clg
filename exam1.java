import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
class Student {
    private String name;
    private int roll_no;
    private int grade;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", roll_no=" + roll_no +
                ", grade=" + grade +
                '}';
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public Student(String name, int roll_no, int grade) {
        this.name = name;
        this.roll_no = roll_no;
        this.grade = grade;
    }

}

class StudentManager {
    private List<Student> students;
    public StudentManager(List<Student> students){
        this.students = students;
    }

    public List<Student> getStudents(){
        return this.students;
    }

    public void setStudents(List<Student> students){
        this.students = students;
    }


    public void addStudent(Student s){
        Iterator<Student> iter = students.iterator();
        this.students.add(s);
    }

    public void removeStudent(Student s){
        Iterator<Student> iter = students.iterator();

        while(iter.hasNext()){
            Student current = iter.next();
            if(current.getRoll_no() == s.getRoll_no()) {
                System.out.println("Removing student " + s);
                iter.remove();
                return;
            }
        }
    }

    public void displayStudents(){
        Iterator<Student> iter = students.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    }

    public void replaceGrade(int grade, String name){
        Iterator<Student> iter = students.iterator();
        while(iter.hasNext()){
            Student s = iter.next();
            if(s.getName().equals(name)){
                s.setGrade(grade);
                return;
            }
        }
    }

}
public class exam1 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Srujan", 72, 8));
        students.add(new Student("Apoorva", 7, 8));
        students.add(new Student("Manas", 48, 9));

        StudentManager sm = new StudentManager(students);
//        System.out.println(sm.getStudents());
        sm.removeStudent(new Student("Srujan", 72, 8));
        sm.addStudent(new Student("Y", 56, 9));
        sm.displayStudents();
        sm.replaceGrade(9, "Apoorva");
        sm.displayStudents();
    }

}
