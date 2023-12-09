
package CarShowDbms;


public class Van extends Car {
    private double cargoCapacity;
    private boolean slidingDoor;

    public Van(String make, String model, String color, double price, double shippingFee, int year,
              double cargoCapacity, boolean slidingDoor) {
        super(make, model, color, price, shippingFee, year);
        this.cargoCapacity = cargoCapacity;
        this.slidingDoor = slidingDoor;
    }

    public double getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(double cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public boolean getSlidingDoor() {
        return slidingDoor;
    }

    public void setSlidingDoor(boolean slidingDoor) {
        this.slidingDoor = slidingDoor;
    }

    @Override
    public void displayCarDetails() {
        super.displayCarDetails();
        System.out.println("Cargo Capacity: " + cargoCapacity);
        System.out.println("Sliding Door: " + slidingDoor);
        System.out.println("------------------------");
    }
}
