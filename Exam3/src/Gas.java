public class Gas extends Vehicle{


    int hp;

    public Gas(String make, String vin, double price, int hp) {
        super(make, vin, price);
        this.hp = hp;
    }

    @Override
    public String toString() {
        return "Gas" +
                "hp= " + hp +
                " make= " + make +
                " vin= " + vin+
                " price= " + price
                ;
    }
}
