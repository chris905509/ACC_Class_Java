public class Vehicle{
    String make;
    String vin;
    double price;

    public Vehicle(String make, String vin, double price) {
        this.make = make;
        this.vin = vin;
        this.price = price;
    }

    public String getVin() {
        return vin;
    }

    public double getPrice() {
        return price;
    }
}