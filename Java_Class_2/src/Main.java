package org.example;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Arrays;


public class Main {
    public static void main(String[] args)
    {

        int[][] original= {{5,6,4,8,2},{6,3,6,1,5},{4,7,2,9,3},{3,9,5,2,1},{1,7,9,3,2}};

        sums(original);

    }

    public static void sums(int[][] old)
    {
        int[][] sums= new int[old.length][old[0].length];


        for(int i=0; i<old.length;i++)
        {
            for(int j=0; j<old[i].length;j++)
            {

                if(i==0&&j==0) // top left corner
                {
                    sums[i][j]= old[i][j]+old[i+1][j]+old[i][j+1]+old[i+1][j+1];
                }else
                if(j!=old.length-1 && i==0) //middle top row
                {
                    sums[i][j]= old[i][j]+old[i][j-1]+old[i][j-1]+old[i+1][j]+old[i+1][j+1]+old[i+1][j-1];
                }else
                if(j==old.length-1 && i==0) // top right corner
                {
                    sums[i][j]= old[i][j]+old[i][j-1]+old[i][j-1]+old[i+1][j]+old[i+1][j+1]+old[i+1][j-1];
                }

            }

        }

    }

    public static int getLeft(int[][] x)
    {
        ret
    }
    old[i][j]
    old[i+1][j]    //down one
    old[i+1][j+1]  // down one right one
    old[i+1][j-1]  // down one left one
    old[i][j+1]     //right one
    old[i][j-1]    //left one
    old[i-1][j]    //up pne
    old[i-1][j+1]  // up one right one
    old[i-1][j-1]  // up one left one


    public static void lowShaw(int[][] z)
    {
        int num=0;
        int num2=0;
        boolean unique=true;

        for (int j=0; j<z[0].length;j++)
        {
            num= num+z[0][j];
        }

        for(int i=1; i<z.length; i++)
        {
            for (int j=0; j<z[i].length;j++)
            {
                num2=num2+z[i][j];
            }
            System.out.println(num2);

            if(num2==num)
                unique=false;

            num2=0;
        }

        for(int i=0; i<z[0].length; i++)
        {
            for (int j=0; j<z[i].length;j++)
            {
                num2=num2+z[j][i];
            }
            System.out.println(num2);

            if(num2==num)
                unique=false;

            num2=0;
        }

        for(int i=0; i<z[0].length; i++)
        {
            for (int j=0; j<z[i].length;j++)
            {
                if(i==j)
                   num2= num2+ z[j][i];
            }

            if(num2==num)
                unique=false;
        }

        System.out.println(num2);
        num2=0;

        for(int i=0; i<z[0].length; i++)
        {
            for (int j=0; j<z[i].length;j++)
            {
                if(i+j == z.length-1)
                    num2= num2+ z[j][i];
            }

            if(num2==num)
                unique=false;
        }

        boolean unique2=true;






    }








    public static void uniqueValues(int[] x)
    {
        boolean unique=true;
        for(int i=0; i< x.length; i++)
        {
            if(!unique)
                break;
            for(int j=i+1;j<x.length;j++)
            {
                if(x[i]==x[j])
                    unique=false;
            }
        }
        System.out.println(unique);
    }





    public static void countNegatives(int[][] x)
    {
        int count=0;
        for(int i=0;i<x.length;i++)
        {
            for(int j=0; j<x[i].length; j++)
            {
                if(x[i][j]<0 && count==0)
                    System.out.println( "First occurance at " +i+ " "+j);
                if(x[i][j]<0)
                    count++;
            }
        }
        System.out.println("Count is "+count);
    }



 /*   public static void sortRowsAndColumns(int[][] x)
    {
         int temp;

        for(int i=0;i< x.length;i++)
        {

            for (int j = 0; j < x[i].length - 1; j++)
            {

                for (int k = 0; k < x[i].length - 1 - j; k++)
                {
                    if(x[j][k]<x[j][k+1])
                    {
                        temp=x[j][k+1];
                        x[j][k+1]=x[j][k];
                        x[j][k]=temp;
                    }
                }
            }
        }

        for(int i=0;i< x.length;i++)
        {
            for (int j = 0; j < x.length - 1; j++)
            {

                for (int k = 0; k < x.length - 1 - j; k++)
                {
                    if(x[j][k]<x[j+1][k])
                    {
                        temp=x[j+1][k];
                        x[j+1][k]=x[j][k];
                        x[j][k]=temp;
                    }
                }
            }
        }

        for(int i=0;i< x.length;i++)
        {
            for (int j = 0; j < x[i].length; j++)
            {
                System.out.print(x[i][j] + " ");
            }
            System.out.println();
        }


    }*/

    public static void highestValueRow(int [][] x)
    {
        int total;
        int max=0;
        int row=0;

        for(int i=0; i<x[0].length; i++)
        {
            max=max+x[0][i];
        }

        for(int i=1;i<x.length;i++)
        {
            total=0;
            for(int j=0;j<x[i].length;j++)
            {
                total=total+x[i][j];

                if(total>max)
                {
                    max=total;
                    row=i;
                }
            }
        }
        System.out.println("Max is"+ max+ " at row"+ row);
    }
    public static void binarySearch(int[] array, int num)
    {
        int left=0;
        int right= array.length-1;
        int mid;

        while(left<=right)
        {
            mid= left + (right-left)/2;

            if(array[mid]==num)
            {
                System.out.println("index at "+ mid);
                return;
            }else if(array[mid]<num)
            {
                left=mid+1;

            }else if(array[mid]>num)
            {
                right=mid-1;
            }
        }
        System.out.println("not Found");
    }

    public static void sortArray(int[] array)
    {
            int temp;
            for(int i=0;i< array.length-1;i++)
            {
                for(int j=0; j<array.length-1-i;j++)
                {
                    if(array[j]>array[j+1])
                    {
                        temp=array[j];
                        array[j]=array[j+1];
                        array[j+1]=temp;
                    }
                }
            }
    }
}

/*
    public static void palindrome(int x)
    {
        int reverse=0;

        while(x!=0)
        {
            reverse= reverse*10 + x % 10;
            x=x/10;
        }
        System.out.println(reverse);

        if(x==reverse)
        {
            System.out.println("Palindrome true");
        }
    }*/