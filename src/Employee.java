import java.io.Serializable;
import java.util.ArrayList;

public class Employee implements Serializable {
    private String name;
    private String position;
    private int age;
    private double salary;
    private ArrayList<Employee> employees;
    private static final long serialVersionUID = 1L;

    public Employee() {
    }

    public Employee(String name, String position, int age, double salary, ArrayList<Employee> employees) {
        this.name = name;
        this.position = position;
        this. age = age;
        this.salary = salary;
        this.employees = employees;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
