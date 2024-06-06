import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public  class Display {

    static ArrayList<employee> e = new ArrayList<>();
    static File f = new File("list.txt");




    public Display() {
//        employee a1 = new full(0, 37, 12000);
//        employee a2 = new part(1, 57, 20, 15);
//        employee a3 = new hourly(2, 12, 10);
//        e.add(a1);
//        e.add(a2);
//        e.add(a3);


    }

    public static void display2() {
        int id = e.size();
        Scanner obj = new Scanner(System.in);

        System.out.println("1) Add employee \n2) List employees by type \n" + "3) list hourly above certain rate\n4) list all full time employees between an age range\n5)add to file\n6)Load from file ");
        int choice = obj.nextInt();

        if (choice == 1) {
            System.out.println("What kind of employee would you like to add?\n" + "1) full time  2) part time  3)  hourly");
            int choice2 = obj.nextInt();
            System.out.println("Age?");
            int age = obj.nextInt();

            if (choice2 == 1) {
                System.out.println("Salary?");
                int salary = obj.nextInt();
                employee A = new full(id, age, salary);
                System.out.println(A);
                e.add(A);
            }
            if (choice2 == 2) {
                System.out.println("Hours Allowed?");
                int hrs_allowed = obj.nextInt();
                System.out.println("Hours Rate?");
                int hr_rate = obj.nextInt();
                employee A = new part(id, age, hrs_allowed, hr_rate);
                System.out.println(A);
                e.add(A);

            }
            if (choice2 == 3) {
                System.out.println("Hours Rate?");
                int hr_rate = obj.nextInt();
                employee A = new hourly(id, age, hr_rate);
                System.out.println(A);
                e.add(A);
            }
        } else if (choice == 2) {
            System.out.println();
            for (employee f : e) {
                if (f instanceof full) {
                    System.out.println("Employee with id " + f.getId() + " is a full time employee");
                }
                if (f instanceof part) {
                    System.out.println("Employee with id " + f.getId() + " is a part time employee");
                }
                if (f instanceof hourly) {
                    System.out.println("Employee with id " + f.getId() + " is an hourly employee");
                }
            }
        } else if (choice == 3) {
            System.out.println("Find all hourly employees above what salary?");
            int hr_rate = obj.nextInt();
            for (employee f : e) {
                if (f instanceof hourly && ((hourly) f).getHour_rate() > hr_rate) {
                    System.out.println("Employee with id " + f.getId() + " has a salary of " + ((hourly) f).getHour_rate());
                }
            }
        } else if (choice == 4) {
            System.out.println("Find all full time between what ages. Min Age: ");
            int minAge = obj.nextInt();
            System.out.println("Max Age");
            int maxAge = obj.nextInt();
            for (employee f : e) {
                if (f instanceof full && f.getAge() > minAge && f.getAge() < maxAge) {

                    System.out.println(f.getId() + " has an age of " + f.getAge());
                }
            }
        } else if (choice == 5) {
            System.out.println("Upload to file ");

            try {
                FileWriter obj2 = new FileWriter("list.txt");
                for (employee f : e)
                    obj2.write(f.toString());
                obj2.close();
            } catch (Exception e) {
                e.getStackTrace();
            }
        } else if (choice == 6) {
            System.out.println("Load from file");

            try {
                Scanner input = new Scanner(f);
                while (input.hasNextLine()) {
                    String y=input.nextLine();
                    if(y.startsWith("1")) {
                        String[] s = y.split(" ");
                        employee a1 = new full(Integer.parseInt(s[3]), Integer.parseInt(s[5]), Integer.parseInt(s[1]));
                        e.add(a1);
                    }
                    if(y.startsWith("2")) {
                        String[] s = y.split(" ");
                        employee a1 = new part(Integer.parseInt(s[1]), Integer.parseInt(s[3]), Integer.parseInt(s[5]),Integer.parseInt(s[7]));
                        e.add(a1);
                }
                    if(y.startsWith("3")) {
                        String[] s = y.split(" ");
                        employee a1 = new hourly(Integer.parseInt(s[1]), Integer.parseInt(s[3]), Integer.parseInt(s[5]));
                        e.add(a1);
                    }
            }} catch (Exception e) {
                e.getStackTrace();
            }
        }
    }
}
