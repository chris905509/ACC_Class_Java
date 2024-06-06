import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {

//        Animal myAnimal = new Animal();  // Create a Animal object
//        Animal myPig = new Pig();  // Create a Pig object
//        Animal myDog = new Dog();  // Create a Dog object
//        myAnimal.animalSound();
//        myPig.animalSound();
//        myDog.animalSound();
//        Animal a;
//
//        Scanner obj=new Scanner(System.in);
//        int choice=obj.nextInt();
//
//        if(choice==1)
//        {
//            a=new Dog();
//        }
//        else{
//            a=new Pig();
//        }
//        a.animalSound();
//
//        if(a instanceof Dog)
//            System.out.println("This is a dog");

A a =new A(10);
System.out.println(a);
A b= new B(10,20);
        System.out.println(b);
        A c= new C(30,40);
        System.out.println(c);

        ArrayList<A> d=new ArrayList<>();
        d.add(a);
        d.add(b);
        d.add(c);

        for(A item : d)
        {
            item.func();
        }

    }
}

class Animal {
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
}

class Pig extends Animal {
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }
}

class Dog extends Animal {
    public void animalSound() {
        System.out.println("The dog says: bow wow");
    }
}

class A{
    int a;
    public A(int x)
    {
         a =x;
    }

    @Override
    public String toString() {
        return "A{" +
                "a=" + a +
                '}';
    }

    public void func()
    {
        System.out.println("A");
    }
}

class B extends A{
    int b;

    public B(int x, int y)
    {
        super(x);
        b=y;
    }

    @Override
    public String toString() {
        return "B{" +
                "a=" + a +
                '}'+b;
    }

    public void func()
    {
        System.out.println("B");
    }
}

class C extends A{
    int c;

    public C(int x, int y)
    {
        super(x);
        c=y;
    }

    @Override
    public String toString() {
        return "C{" +
                "c=" + c +
                ", a=" + a +
                '}';
    }

    public void func()
    {
        System.out.println("C");
    }
}

