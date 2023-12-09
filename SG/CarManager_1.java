
package CarShowDbms;

import java.util.ArrayList;
import java.util.List;


public class CarManager {
    private final List<Car> cars;

    public CarManager() {
        this.cars = new ArrayList<>();
    }

    public void addCar(Car car) {
        cars.add(car);
        System.out.println("Car added successfully!");
    }

    public void deleteCar(int vin) {
    boolean removed = cars.removeIf(car -> car.getVin() == vin);

    if (removed) {
        System.out.println("Car deleted successfully!");
    } else {
        System.out.println("Car not found with ID: " + vin);
    }
}


    public void displayAllCars() {
    for (int i = 0; i < cars.size(); i++) {
        cars.get(i).displayCarDetails();
    }
}

public Car findCarByVin(int vin) {
    for (int i = 0; i < cars.size(); i++) {
        Car car = cars.get(i);
        if (car.getVin() == vin) {
            return car;
        }
    }
    return null;
}



    public void searchCars(String attribute, String value) {
    for (int i = 0; i < cars.size(); i++) {
        Car car = cars.get(i);

        switch (attribute) {
            case "make":
                if (car.getMake().equals(value)) {
                    car.displayCarDetails();
                }
                break;
            case "model":
                if (car.getModel().equals(value)) {
                    car.displayCarDetails();
                }
                break;
            case "color":
                if (car.getColor().equals(value)) {
                    car.displayCarDetails();
                }
                break;
            case "year":
                if (String.valueOf(car.getYear()).equals(value)) {
                    car.displayCarDetails();
                }
                break;
            case "vin":
                if (String.valueOf(car.getVin()).equals(value)) {
                    car.displayCarDetails();
                }
                break;
            default:
                System.out.println("Invalid search attribute: " + attribute);
        }
    }
 }
    
}