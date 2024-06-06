public class SUV extends Vehicle{

    int num_rows;


    public SUV(String make, String vin, double price, int num_rows) {
        super(make, vin, price);
        this.num_rows = num_rows;
    }

    @Override
    public String toString() {
        return "SUV:" +
                "num_rows= " + num_rows +
                " make= " + make +
                " vin= " + vin+
                " price= " + price
                ;
    }
}
