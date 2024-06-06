import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {


        int[] x= {3,2,10,5,9,8,12,11};


        System.out.print("Pre sorted numbers: ");
        for(int i=0;i<x.length;i++)
        {
            System.out.print(x[i] +" ");
        }


        x= sort(x);

        System.out.println();

        System.out.print("Sorted numbers:    ");
        for(int i=0;i<x.length;i++)
        {
            System.out.print(x[i] +" ");
        }

    }


    public static int[] sort(int[] x)
    {
        if(x.length==0)
            return x;

        int index=x.length/2;
        int count=0;
        for(int i=0;i<x.length;i++)
        {
            if(x[i]<x[index])
                count++;
        }

            int temp = x[index];
            x[index] = x[count];
            x[count] = temp;

            for(int i = 0 ; i < x.length ; i++)
                System.out.println(x[i]);

            if(count!=0)
            {
                int[] array1 = new int[count];
                System.arraycopy(x, 0, array1, 0, count);
                array1 = sort(array1);

                int[] array2 = new int[x.length - count - 1];
                System.arraycopy(x, count + 1, array2, 0, x.length - count - 1);
                array2 = sort(array2);

                if(array1.length!=0)
                  System.arraycopy(array1, 0, x, 0, count);

                if(array2.length!=0)
                    System.arraycopy(array2, 0, x, count+1, x.length - count - 1);

         /*       int[] array3=new int[x.length-1];
                System.arraycopy(array1, 0, array3, 0, count);
                System.arraycopy(array2, 0, array3, count, x.length - count - 1);
                sort(array3);
                System.arraycopy(array3, 0, x, 0, count);
                System.arraycopy(array3, count, x, count+1, x.length - count - 1);*/
            }

            return x;
    }
}