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



        int[] array1 = new int[count];
        int[] array2 = new int[x.length - count - 1];
        int smaller=0;
        int larger=0;

        if(count==0)
        {
            int temp = x[index];
            x[index] = x[count];
            x[count] = temp;
        }

        if(count!=0)
        {
            for(int i=0;i<x.length;i++)
            {
                if(x[i]<x[index])
                {
                    array1[smaller]=x[i];
                    smaller++;
                }else if(x[i]==x[index]&&index!=i) {

                        array2[larger]=x[i];
                        larger++;

                } else if (index!=i){
                    array2[larger]=x[i];
                    larger++;
                }
            }

            int temp = x[index];
            x[index] = x[count];
            x[count] = temp;

            int[] z= sort(array1);
            System.arraycopy(z,0,x,0,count);
            int[] q=sort(array2);
            System.arraycopy(q,0,x,count+1,q.length);
        }

        return x;
    }
}