package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       /* Employee e1 = new Employee(18,2000,"chris");
        Employee e2 = new Employee(22,2500,"jason");
        Employee e3 = new Employee(25, 3000,"jake");
        Employee temp=new Employee();
        Employee[] list= {e1,e2,e3};*/


      /*  int[] x = {1};
        int[] y = {2, 4, 6, 8, 10};
        int indexX = 0;
        int indexY = 0;
        int[] z = new int[x.length+y.length];

        for (int i = 0; i < x.length + y.length ; i++)
        {
            if(indexX>=x.length)
            {
                z[i] = y[indexY];
                indexY++;
            }else if(indexY>=y.length)
            {
                z[i] = x[indexX];
                indexX++;
            }else if (x[indexX] <= y[indexY]) {
                z[i] = x[indexX];
                indexX++;
            } else if (x[indexX] > y[indexY]) {
                z[i] = y[indexY];
                indexY++;
            }
            System.out.println(z[i]);
        }*/


        //while(i<a1.length &&j<a2.length)


        Scanner obj=new Scanner(System.in);
     //   System.out.println(fib(obj.nextInt()));

        fibRecur(4);

    }

    public static int factorial(int x)
    {
        if(x==1)
            return 1;

        return x*factorial(x-1);
    }

    public static int sum(int x)
    {
        if(x==1)
            return 1;

        return x+sum(x-1);
    }
    public static int fibRecur(int x)
    {
        if(x<=1)
            return 1;

        return fibRecur(x-1)+fibRecur(x-2);


    }

    public static int fib(int x)
    {
        int num1=1;
        int num2=1;
        int fiby;

        for(int i=2;i<=x;i++)
        {
            fiby=num1+num2;
            num1=num2;
            num2=fiby;
        }
        return num2;
    }

}
/*
    public static sortE(Employee[] e)
    {

        for(int i=0; i<e.length-1; i++)
        {
            for(int j=0; j< e.length-1-i;j++)
            {
                if(e[j].getAge()< e[j+1].getAge())
                {
                    temp= e[j+1];
                    e[j]=e[j+1];
                    e[j+1]=e;

                }
            }
        }

        for(int i=0; i<e.length-1; i++)
        {
            e[i].toString();
        }
    }


 */