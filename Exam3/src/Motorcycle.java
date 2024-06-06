public class Motorcycle extends Vehicle{

    int top_Speed;

    public Motorcycle(String make, String vin, double price, int top_Speed) {
        super(make, vin, price);
        this.top_Speed = top_Speed;
    }

    @Override
    public String toString() {
        return "Motorcycle" +
                "top_speed= " + top_Speed +
                " make= " + make +
                " vin= " + vin+
                " price= " + price
                ;
    }

}
