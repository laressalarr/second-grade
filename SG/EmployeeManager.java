
package CarShowDbms;


import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {
    final private List<Employee> employees;

    public EmployeeManager() {
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
        System.out.println("Employee added successfully!");
    }

    public void removeEmployee(int employeeID) {
        employees.removeIf(employee -> employee.getEmployeeID() == employeeID);
        System.out.println("Employee removed successfully!");
    }

    public void displayAllEmployees() {
        for (Employee employee : employees) {
            System.out.println("Employee ID: " + employee.getEmployeeID());
            System.out.println("Name: " + employee.getFirstName() + " " + employee.getLastName());
            System.out.println("Position: " + employee.getPosition());
            System.out.println("Salary: " + employee.getSalary());
            System.out.println("------------------------");
        }
    }
}
