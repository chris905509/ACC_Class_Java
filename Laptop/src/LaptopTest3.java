//  Using Comparator Interface

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LaptopTest3
{
    public static void main(String[] args)
    {
        List<Laptops> laptop = new ArrayList<>();

        laptop.add(new Laptops("Dell", 16, 850));
        laptop.add(new Laptops("Acer", 8, 650.95));
        laptop.add(new Laptops("Apple", 12, 1250.50));
        laptop.add(new Laptops("HP", 24, 1400.95));

        Comparator<Laptops> comparatorObj = new Comparator<Laptops>()
        {
            int retValue = 0;

            public int compare(Laptops laptop1, Laptops laptop2)
            {
                if (laptop1.getBrand().length() > laptop2.getBrand().length())
                    retValue = 1;
                else if (laptop1.getBrand().length() < laptop2.getBrand().length())
                    retValue = -1;

                return retValue;
            }
        };

        System.out.println("Before sort\n");
        for (Laptops lap : laptop)
        {
            System.out.println(lap);
        }


        Collections.sort(laptop, comparatorObj);

        System.out.println("\nAfter sort\n");
        for (Laptops lap : laptop)
        {
            System.out.println(lap);
        }
    }
}
