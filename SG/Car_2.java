
package CarShowDbms;


import java.util.Scanner;


public class Car {




    private static int nextVin = 1; // Auto-incrementing VIN
    private int vin;
    private String make;
    private String model;
    private String color;
    private double price;
    private double shippingFee;
    private int year;

    public Car(String make, String model, String color, double price, double shippingFee, int year) {
        this.vin = nextVin++;
        this.make = make;
        this.model = model;
        this.color = color;
        this.price = price;
        this.shippingFee = shippingFee;
        this.year = year;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    public Car(){}
    public int getVin() {
        return vin;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    public double getShippingFee() {
        return shippingFee;
    }

    public int getYear() {
        return year;
    }

    public void displayCarDetails() {
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("ID\t\t"+"Make\t\t"+"Model\t\t"+"color\t\t"+"price\t\t"+"shipping free\t\t"+"Year\t\t");
        System.out.println("__________________________________________________________________________________________________________________________________________");
        System.out.println(+vin+"\t\t"+make+"\t\t"+model+"\t\t"+color+"\t\t"+price+"\t\t"+shippingFee+"\t\t\t"+year);
        
    }
    public void addCarFromUserInput(CarManager carManager, Scanner scanner) {
    try {
        System.out.println("Choose the car type:");
        System.out.println("1. Sedan");
        System.out.println("2. SUV");
        System.out.println("3. Van");
        System.out.print("Enter your choice: ");

        int carTypeChoice = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        String make, model, color;
        double price, shippingFee;

        System.out.print("Enter the make: ");
        make = scanner.nextLine();

        System.out.print("Enter the model: ");
        model = scanner.nextLine();

        System.out.print("Enter the color: ");
        color = scanner.nextLine();

        System.out.print("Enter the price: ");
        price = scanner.nextDouble();

        System.out.print("Enter the shipping fee: ");
        shippingFee = scanner.nextDouble();

        System.out.print("Enter the year: ");
        year = scanner.nextInt();

        switch (carTypeChoice) {
            case 1:
                // Sedan specific attributes
                double trunkSize;
                System.out.print("Enter the trunk size: ");
                trunkSize = scanner.nextDouble();

                Sedan sedan = new Sedan(make, model, color, price, shippingFee, year, trunkSize);
                carManager.addCar(sedan);
                break;
            case 2:
                // SUV specific attributes
                boolean offRoadCapability;
                System.out.print("Does the SUV have off-road capability? (true/false): ");
                offRoadCapability = scanner.nextBoolean();

                int seatingCapacity;
                System.out.print("Enter the seating capacity: ");
                seatingCapacity = scanner.nextInt();

                SUV suv = new SUV(make, model, color, price, shippingFee, year, offRoadCapability, seatingCapacity);
                carManager.addCar(suv);
                break;
            case 3:
                // Van specific attributes
                double cargoCapacity;
                System.out.print("Enter the cargo capacity: ");
                cargoCapacity = scanner.nextDouble();

                boolean slidingDoor;
                System.out.print("Does the van have a sliding door? (true/false): ");
                slidingDoor = scanner.nextBoolean();

                Van van = new Van(make, model, color, price, shippingFee, year, cargoCapacity, slidingDoor);
                carManager.addCar(van);
                break;
            default:
                System.out.println("Invalid car type choice. No car added.");
        }
    } catch (Exception e) {
        System.out.println("Enter correct input");
    }
}

    

    public void deleteCarFromUserInput(CarManager carManager, Scanner scanner) {
        System.out.print("Enter the VIN of the car to delete: ");
        int ID = scanner.nextInt();
        carManager.deleteCar(ID);
    }
    public void searchCarsFromUserInput(CarManager carManager, Scanner scanner) {
        System.out.print("Enter the attribute to search by (make, model, color, year, vin): ");
        String attribute = scanner.nextLine().toLowerCase();

        System.out.print("Enter the value to search for: ");
        String value = scanner.nextLine();

        carManager.searchCars(attribute, value);
    }
    public void updateCarFromUserInput(CarManager carManager, Scanner scanner) {
    System.out.print("Enter the ID of the car to update: ");
    int vinToUpdate = scanner.nextInt();
    scanner.nextLine(); // Consume the newline character

    Car carToUpdate = carManager.findCarByVin(vinToUpdate);

    if (carToUpdate != null) {
        System.out.println("Choose an attribute to update:");
        System.out.println("1. Make");
        System.out.println("2. Model");
        System.out.println("3. Color");
        System.out.println("4. Price");
        System.out.println("5. Year");
        System.out.print("Enter your choice: ");

        int choice = scanner.nextInt();
        scanner.nextLine(); 

        switch (choice) {
            case 1:
                System.out.print("Enter the new make: ");
                carToUpdate.setMake(scanner.nextLine());
                System.out.println("Make updated successfully!");
                break;
            case 2:
                System.out.print("Enter the new model: ");
                carToUpdate.setModel(scanner.nextLine());
                System.out.println("Model updated successfully!");
                break;
            case 3:
                System.out.print("Enter the new color: ");
                carToUpdate.setColor(scanner.nextLine());
                System.out.println("Color updated successfully!");
                break;
            case 4:
                System.out.print("Enter the new price: ");
                carToUpdate.setPrice(scanner.nextDouble());
                System.out.println("Price updated successfully!");
                break;
            case 5:
                System.out.print("Enter the new year: ");
                carToUpdate.setYear(scanner.nextInt());
                System.out.println("Year updated successfully!");
                break;
            default:
                System.out.println("Invalid choice. No updates performed.");
        }
    } else {
        System.out.println("Car not found with VIN: " + vinToUpdate);
    }
 }



}


