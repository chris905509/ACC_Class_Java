import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Product> a=new LinkedList<Product>();

        Product[] products=new Product[4];
        products[0]=new Product(1,17.30,"Toyota");
        products[1]=new Product(2,12.00,"chevy");
        products[2]=new Product(3,20.00,"ford");
        products[3]=new Product(4,11.00,"kia");

        a.add(products[0]);

        for(int i=1;i<4;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(a.get(j).getPrice()>products[i].getPrice() || j==i-1)
                {
                    a.add(j,products[i]);
                    break;
                }
            }
        }

System.out.println(a);


    }
}



class Product{

    int id;
    double price;
    String manufacturer;


    public Product(int id, double price, String manufacturer) {
        this.id = id;
        this.price = price;
        this.manufacturer = manufacturer;
    }

    public int getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product: " +
                "id=" + id +
                ", price=" + price +
                ", manufacturer='" + manufacturer +"\n";
    }
}