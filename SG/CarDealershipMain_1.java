package CarShowDbms;
import java.util.Scanner;


public class CarDealershipMain {

    public static void main(String[] args) {
        CarManager carManager = new CarManager();
        EmployeeManager employeeManager = new EmployeeManager();
        CustomerManager customerManager = new CustomerManager();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Car Management");
            System.out.println("2. Employee Management");
            System.out.println("3. Customer Management");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    manageCars(carManager, scanner);
                    break;
                case 2:
                    manageEmployees(employeeManager, scanner);
                    break;
                case 3:
                    manageCustomers(customerManager, scanner);
                    break;
                case 4:
                    System.out.println("Exiting the program. Thank you!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

   private static void manageCars(CarManager carManager, Scanner scanner) {
    Car c1 = null;  // Declare c1 outside the switch block

    while (true) {
        System.out.println("Car Management:");
        System.out.println("1. Add Car");
        System.out.println("2. Delete Car");
        System.out.println("3. View All Cars");
        System.out.println("4. Search Cars");
        System.out.println("5. Update Car");
        System.out.println("6. Go Back");

        System.out.print("Enter your choice: ");
        int carChoice = scanner.nextInt();
        scanner.nextLine(); 

        switch (carChoice) {
            case 1:
                c1 = new Car();
                c1.addCarFromUserInput(carManager, scanner);
                break;
            case 2:
                if (c1 != null) {
                    c1.deleteCarFromUserInput(carManager, scanner);
                } else {
                    System.out.println("Please add a car first.");
                }
                break;
            case 3:
                carManager.displayAllCars();
                break;
            case 4:
                if (c1 != null) {
                    c1.searchCarsFromUserInput(carManager, scanner);
                } else {
                    System.out.println("Please add a car first.");
                }
                break;
            case 5:
                if (c1 != null) {
                    c1.updateCarFromUserInput(carManager, scanner);
                } else {
                    System.out.println("Please add a car first.");
                }
                break;
            case 6:
                return; 
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }
}


    private static void manageEmployees(EmployeeManager employeeManager, Scanner scanner) {
    while (true) {
        System.out.println("Employee Management:");
        System.out.println("1. Add Employee");
        System.out.println("2. Remove Employee");
        System.out.println("3. View All Employees");
        System.out.println("4. Go Back");

        System.out.print("Enter your choice: ");
        int employeeChoice = scanner.nextInt();
        scanner.nextLine(); 

        switch (employeeChoice) {
            case 1:
               
                System.out.print("Enter Employee ID: ");
                int employeeID = scanner.nextInt();
                scanner.nextLine(); 

                System.out.print("Enter First Name: ");
                String firstName = scanner.nextLine();

                System.out.print("Enter Last Name: ");
                String lastName = scanner.nextLine();

                System.out.print("Enter Position: ");
                String position = scanner.nextLine();

                System.out.print("Enter Salary: ");
                double salary = scanner.nextDouble();
                scanner.nextLine(); 

                Employee employee = new Employee(employeeID, firstName, lastName, position, salary);
                employeeManager.addEmployee(employee);
                break;
            case 2:
                System.out.print("Enter the Employee ID to remove: ");
                int removeEmployeeID = scanner.nextInt();
                employeeManager.removeEmployee(removeEmployeeID);
                break;
            case 3:
                employeeManager.displayAllEmployees();
                break;
            case 4:
                return; 
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }
}


private static void manageCustomers(CustomerManager customerManager, Scanner scanner) {
    while (true) {
        System.out.println("Customer Management:");
        System.out.println("1. Add Customer");
        System.out.println("2. Remove Customer");
        System.out.println("3. View All Customers");
        System.out.println("4. Go Back");

        System.out.print("Enter your choice: ");
        int customerChoice = scanner.nextInt();
        scanner.nextLine();

        switch (customerChoice) {
            case 1:
                Customer customer = new Customer(0,"name","name",0,"email");
                // Add the following lines to set customer details
                System.out.print("Enter Customer ID: ");
                customer.setCustomerID(scanner.nextInt());
                scanner.nextLine(); // Consume the newline character
                System.out.print("Enter First Name: ");
                customer.setFirstName(scanner.nextLine());
                System.out.print("Enter Last Name: ");
                customer.setLastName(scanner.nextLine());
                System.out.print("Enter Phone Number: ");
                customer.setPhoneNumber(scanner.nextInt());
                scanner.nextLine(); // Consume the newline character
                System.out.print("Enter Email: ");
                customer.setEmail(scanner.nextLine());

                customerManager.addCustomer(customer);
                System.out.println("Customer added successfully!");
                break;
            case 2:
                System.out.print("Enter the Customer ID to remove: ");
                int customerID = scanner.nextInt();
                customerManager.removeCustomer(customerID);
                break;
            case 3:
                customerManager.displayAllCustomers();
                break;
            case 4:
                return;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }
}

}

