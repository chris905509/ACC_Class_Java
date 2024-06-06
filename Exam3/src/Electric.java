public class Electric extends Vehicle{


    int range;


    public Electric(String make, String vin, double price, int range) {
        super(make, vin, price);
        this.range = range;
    }

    @Override
    public String toString() {
        return "Electric" +
                "range= " + range +
                " make= " + make +
                " vin= " + vin+
                " price= " + price
                ;
    }

    public int getRange() {
        return range;
    }
}
