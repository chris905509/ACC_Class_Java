public class Truck extends Vehicle{

    int tow_cap;

    public Truck(String make, String vin, double price, int tow_cap) {
        super(make, vin, price);
        this.tow_cap = tow_cap;
    }

    @Override
    public String toString() {
        return "Truck" +
                "Tow_Capacity= " + tow_cap +
                " make= " + make +
                " vin= " + vin+
                " price= " + price
                ;
    }

}
