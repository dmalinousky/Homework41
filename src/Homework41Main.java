import java.io.*;
import java.util.ArrayList;

public class Homework41Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // Employees list creating (via method)
        ArrayList<Employee> employees = employeesCreator();

        // Asking user 'bout directory
        System.out.println("Use this directory:\n" + System.getProperty("user.dir") + File.separator + "Employees.txt");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        File employeesFile = new File(reader.readLine());

        // File- & ObjectInputStream for reading file
        FileInputStream fis = new FileInputStream(employeesFile);
        ObjectInputStream ois = new ObjectInputStream(fis);

        // Rewriting all the users into new list + changing the one we've searched
        ArrayList<Employee> editedEmployees = new ArrayList<>();
        System.out.println("Provide name:");
        String nameForSearch = reader.readLine();
        for (int i = 0; i < employees.size(); i++) {
            Employee employeeForSearch = (Employee) ois.readObject();
            if (employeeForSearch.getName().equals(nameForSearch)) {
                System.out.println("Provide new salary size:");
                employeeForSearch.setSalary(Double.parseDouble(reader.readLine()));
                editedEmployees.add(employeeForSearch);
            } else {
                editedEmployees.add(employeeForSearch);
            }
        }

        // File- and ObjectOutputStream creation
        FileOutputStream fos = new FileOutputStream(employeesFile, false);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        for (int i = 0; i < editedEmployees.size(); i++) {
            System.out.println(editedEmployees.get(i));
            oos.writeObject(editedEmployees.get(i));
        }

        // Closing all the streams
        fos.close();
        oos.close();
        fis.close();
        ois.close();
    }

    // Creating of employees
    private static ArrayList<Employee> employeesCreator() {
        // Creating employees
        ArrayList<Employee> employees = new ArrayList<>();
        Employee employee1 = new Employee("John", "Director", 40, 120000, employees);
        Employee employee2 = new Employee("Jack", "Accountant", 30, 80000, employees);
        Employee employee3 = new Employee("James", "Manager", 25, 70000, employees);
        Employee employee4 = new Employee("Patrick", "Assistant", 20, 50000, employees);
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        return employees;
    }
}
