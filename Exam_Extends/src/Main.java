import java.util.Arrays;

public class Main {
    public static void main(String[] args)
    {


        Employee e1=new Employee(21,"chris");
        Employee e2=new Employee(51,"josh");
        Employee e3=new Employee(45,"jake");
        Employee e4=new Employee(25,"paul");
         Employee[] e= {e1,e2,e3,e4};

        Integer[] x={1,3,2,7,5}   ;

         sortGenerics(x,x.length);
           printGeneric(x);

    }



    public static <T extends Comparable<T>>void merge(
            T[] a, T[] l, T[] r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i].compareTo(r[j]) <0) {
                a[k++] = l[i++];
            }
            else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }

    public static <T extends Comparable<T>> void sortGenerics(T[] arr, int length)
    {
        if (length <= 1) {
            return;
        }
        int mid = length / 2;
        String x= arr.getClass().getTypeName();

        T[] left = Arrays.copyOfRange(arr,0,mid);
        T[] right = Arrays.copyOfRange(arr,mid,length);

        sortGenerics(left, mid);
        sortGenerics(right, length - mid);

        merge(arr, left, right, mid, length - mid);

    }


    public static <T> void printGeneric(T[] array) {
        for (T e : array) {
            System.out.print(e + " ");
        }
        System.out.println();
    }


}



class Employee implements Comparable<Employee>{

    int age;
    String name;

    public Employee(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Employee a)
    {
        return this.getAge()-a.getAge();
    }

    @Override
    public String toString() {
        return
                "age=" + age +
                ", name='" + name + '\'' +
                '}'+"\n";
    }
}