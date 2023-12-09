
package CarShowDbms;


import java.util.ArrayList;
import java.util.List;

public class CustomerManager {
    final private List<Customer> customers;

    public CustomerManager() {
        this.customers = new ArrayList<>();
    }

     public void addCustomer(Customer customer) {
        customers.add(customer);
        System.out.println("Customer added successfully!");
    }


    public void removeCustomer(int customerID) {
        customers.removeIf(customer -> customer.getCustomerID() == customerID);
        System.out.println("Customer removed successfully!");
    }

    public void displayAllCustomers() {
        for (Customer customer : customers) {
            System.out.println("Customer ID: " + customer.getCustomerID());
            System.out.println("Name: " + customer.getFirstName() + " " + customer.getLastName());
            System.out.println("Phone: " + customer.getPhoneNumber());
            System.out.println("Email: " + customer.getEmail());
            System.out.println("------------------------");
        }
    }
}

