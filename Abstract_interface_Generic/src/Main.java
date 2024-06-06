import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//       ABC<Integer> obj=new ABC<Integer>(10);
//      obj.display();
//      obj.setA(15);
//      obj.display();
//
//        ABC<String> obj2=new ABC<String>("Chris");
//        obj2.display();
//        obj2.setA("Dupuis");
//        obj2.display();


        List<Integer> ints=new ArrayList<>();
        ints.add(5);
        ints.add(11);
        ints.add(3);

       Collections.sort(ints,Sorty.compare());


    }







//    public static <T> void display(T a){
//        System.out.println(a);
//    }
//
//    public static <T> void swap(T a, T b){
//        T temp;
//        temp = a;
//         a=b;
//        b=temp;
//
//    }


}


public class Sorty implements Comparator<>
{
    public <T> int compare(T a, T b)
    {
        return a-b;
    }
}

// class ABC <T>{
//    private T a;
//
//    public ABC(T value)
//    {
//        a=value;
//    }
//
//    public void display(){
//        System.out.println(a);
//    }
//
//    public void setA(T x){
//        a=x;
//    }
//
//}











//
//interface ABC{
//    void display();
//    void func1();
//
//    //by default all variables are staric public and final
//}
//
//interface XYZ extends ABC{
//
//    void func2();
//}
//
//class AAA implements XYZ{
//
//    @Override
//    public void func2() {
//        System.out.println("AAA func2");
//    }
//    public void func1(){
//        System.out.println("AAA func1");
//
//    }
//    public void display(){
//        System.out.println("AAA display");
//    }
//}






//
//abstract class ABC{
//
//    public ABC()
//    {
//        System.out.println("ABC Constructir");
//    }
//   abstract public void display();
////        System.out.println("ABC Display");
//
//}
//
//class XYZ extends ABC{
//
//public XYZ()
//{
//    System.out.println("XYZ constuctoru");
//
//}
//
//    @Override
//    public void display() {
//        System.out.println("XYZ display");
//    }
//}