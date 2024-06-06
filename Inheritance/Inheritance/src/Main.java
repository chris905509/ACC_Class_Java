import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args)
    {
        Auto a1=new Auto(100, "Chevy");
        SUV s = new SUV(200,"Toyota",3);
        Coupe c= new Coupe(300, "Lambo", 450);

        System.out.println(a1);
        System.out.println(s);
        System.out.println(c);



    }
}
class Auto
{
    protected int mileage;
    protected String make;
    public Auto(int mileage, String s) {
        this.mileage = mileage;
        this.make=s;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "mileage=" + mileage +
                ", make='" + make + '\'' +
                '}';
    }
}
class SUV extends Auto
        {
            private int numRows;
            public SUV(int mileage, String s, int x) {
                super(mileage,s);
                numRows=x;
            }

            @java.lang.Override
            public java.lang.String toString() {
                return "SUV"+ super.toString()+"  Number of Rows:"+numRows;
            }
        }

        class Coupe extends Auto
        {
            private int horsepower;
            public Coupe(int milege, String s, int hp)
            {
                super(milege,s);
                horsepower=hp;
            }
            @java.lang.Override
            public java.lang.String toString() {
                return "Coupe"+ super.toString()+" Horsepower:"+horsepower;
            }
        }