public class Hybrid extends Vehicle{

    int mpg;

    public Hybrid(String make, String vin, double price, int mpg) {
        super(make, vin, price);
        this.mpg = mpg;
    }

    @Override
    public String toString() {
        return "Hybrid" +
                "mpg= " + mpg +
                " make= " + make +
                " vin= " + vin+
                " price= " + price
                ;
    }
}
