
package CarShowDbms;


public class SUV extends Car {
    private boolean offRoadCapability;
    private int seatingCapacity;

    public SUV(String make, String model, String color, double price, double shippingFee, int year,
               boolean offRoadCapability, int seatingCapacity) {
        super(make, model, color, price, shippingFee, year);
        this.offRoadCapability = offRoadCapability;
        this.seatingCapacity = seatingCapacity;
    }

    public boolean getOffRoadCapability() {
        return offRoadCapability;
    }

    public void setOffRoadCapability(boolean offRoadCapability) {
        this.offRoadCapability = offRoadCapability;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public void setSeatingCapacity(int seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }

    @Override
    public void displayCarDetails() {
        super.displayCarDetails();
        System.out.println("Off-Road Capability: " + offRoadCapability);
        System.out.println("Seating Capacity: " + seatingCapacity);
        System.out.println("------------------------");
    }
}