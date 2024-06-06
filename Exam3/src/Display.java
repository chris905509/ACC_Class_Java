import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;

public  class Display {

    static ArrayList<Vehicle> e = new ArrayList<>();
    static File f = new File("list.txt");




    public Display() {}

    public static void display2() {
        int id = e.size();
        Scanner obj = new Scanner(System.in);

        System.out.println("1) Add vehicle \n2) Remove Vehicle by Vin \n" + "3) display details by VIN\n4) display by ascending price\n5)displau by price lower than\n6)electric cars above range\n7) export to txt file\n8)import from file ");
        int choice = obj.nextInt();

        if (choice == 1) {
            if(id>50){
                System.out.println("Too many vehicles. Can not add more");
                return;}

            System.out.println("What kind of vehicle would you like to add?\n" + "1) SUV  2) Truck  3) Motorcycle 4) Electric 5)Gas 6)Hybrid");
            int choice2 = obj.nextInt();
            obj.nextLine();
            System.out.println("Make?");
            String make= obj.nextLine();
            System.out.println("VIN?");
            String vin = obj.nextLine();
            System.out.println("Price?");
            double price = obj.nextDouble();

            if (choice2 == 1) {  //suv
                System.out.println("Number of rows?");
                int rows = obj.nextInt();
                while(rows!=2 && rows!=3)
                {
                    System.out.println("Please enter a number between 2 and 3");
                    rows = obj.nextInt();
                }
                Vehicle A = new SUV(make,vin,price,rows);
                System.out.println(A);
                e.add(A);
            }
            if (choice2 == 2) {
                System.out.println("Towing Capacity?");
                int cap = obj.nextInt();
                Vehicle A = new Truck(make,vin,price,cap);
                System.out.println(A);
                e.add(A);

            }
            if (choice2 == 3) {
                System.out.println("Top Speed?");
                int cap = obj.nextInt();
                Vehicle A = new Motorcycle(make,vin,price,cap);
                System.out.println(A);
                e.add(A);
            }
            if (choice2 == 4) {
                System.out.println("Range of Battery?");
                int cap = obj.nextInt();
                Vehicle A = new Electric(make,vin,price,cap);
                System.out.println(A);
                e.add(A);
            } if (choice2 == 5) {
                System.out.println("Horsepower?");
                int cap = obj.nextInt();
                Vehicle A = new Gas(make,vin,price,cap);
                System.out.println(A);
                e.add(A);
            } if (choice2 == 6) {
                System.out.println("MPG?");
                int cap = obj.nextInt();
                Vehicle A = new Hybrid(make,vin,price,cap);
                System.out.println(A);
                e.add(A);
            }

        } else if (choice == 2) {
            System.out.println();
            obj.nextLine();
            System.out.println("Vin to remove?");
            String new_Vin = obj.nextLine();
            Iterator<Vehicle> it = e.iterator();
            while (it.hasNext()) {
                Vehicle f = it.next();
                if (f.getVin().equals(new_Vin)) {
                    it.remove(); // Use iterator to safely remove the current element
                }
            }
        } else if (choice == 3) {
            System.out.println();
            obj.nextLine();
            System.out.println("Vin to find info on?");
            String new_Vin = obj.nextLine();
            for (Vehicle f : e) {
                if (f.getVin().equals(new_Vin)) {
                    System.out.println(f.toString());
                }
            }
        } else if (choice == 4) {
            Collections.sort(e, new Comparator<Vehicle>(){
                public int compare(Vehicle o1, Vehicle o2){
                    if(o1.getPrice() == o2.getPrice())
                        return 0;
                    return o1.getPrice() < o2.getPrice() ? -1 : 1;
                }
            });
            for (Vehicle f : e)
                System.out.println(f);
        } else if (choice == 5) {

            System.out.println();
            obj.nextLine();
            System.out.println("Vehicles below what price?");
            double new_Price = obj.nextDouble();
            for (Vehicle f : e) {
                if (f.getPrice()<new_Price) {
                    System.out.println(f.toString());
                }
            }
        } else if (choice == 6) {
            System.out.println();
            obj.nextLine();
            System.out.println("Electric vehicles above what range?");
            int new_Range = obj.nextInt();
            for (Vehicle f : e) {
                if (f instanceof Electric && ((Electric) f).getRange()>new_Range) {
                    System.out.println(f.toString());
                }
            }
        } else if (choice == 7) {

            try {
                FileWriter obj2 = new FileWriter("list.txt");
                for (Vehicle f : e)
                    obj2.write(f.toString()+"\n");
                obj2.close();
            } catch (Exception e) {
                e.getStackTrace();
            }
        }
        else if (choice == 8) {
           int line_count=0;

            try {
                Scanner input = new Scanner(f);
                while (input.hasNextLine()&& line_count<50 ) {
                    String y=input.nextLine();
                    String[] s = y.split(" ");
                    line_count++;
                    Vehicle a1;
                    if(y.startsWith("SU")) {
                         a1 = new SUV(s[3],s[5],Double.parseDouble(s[7]),Integer.parseInt(s[1]));
                        e.add(a1);
                    }
                    if(y.startsWith("El")) {
                         a1 = new Electric(s[3],s[5],Double.parseDouble(s[7]),Integer.parseInt(s[1]));
                        e.add(a1);
                    }
                    if(y.startsWith("Ga")) {
                         a1 = new Gas(s[3],s[5],Double.parseDouble(s[7]),Integer.parseInt(s[1]));
                        e.add(a1);
                    }
                    if(y.startsWith("Hy")) {
                         a1 = new Hybrid(s[3],s[5],Double.parseDouble(s[7]),Integer.parseInt(s[1]));
                        e.add(a1);
                    }
                    if(y.startsWith("Tr")) {
                        a1 = new Hybrid(s[3],s[5],Double.parseDouble(s[7]),Integer.parseInt(s[1]));
                        e.add(a1);
                    }
                    if(y.startsWith("Mo")) {
                        a1 = new Hybrid(s[3],s[5],Double.parseDouble(s[7]),Integer.parseInt(s[1]));
                        e.add(a1);
                    }

                }} catch (Exception e) {
                e.getStackTrace();
            }
        }


    }
}
