
package CarShowDbms;


public class Sedan extends Car {
    private double trunkSize;

    public Sedan(String make, String model, String color, double price, double shippingFee, int year, double trunkSize) {
        super(make, model, color, price, shippingFee, year);
        this.trunkSize = trunkSize;
    }

    public double getTrunkSize() {
        return trunkSize;
    }

    public void setTrunkSize(double trunkSize) {
        this.trunkSize = trunkSize;
    }

    
    @Override
    public void displayCarDetails() {
        super.displayCarDetails();
        System.out.println("Trunk Size: " + trunkSize);
        System.out.println("------------------------");
    }
}