import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner obj=new Scanner(System.in);
        ArrayList<Integer> coinArray=new ArrayList<Integer>();
        int total;
        int input=0;

        System.out.println("What is the value of the next coin? Press 0 to exit");
        input=obj.nextInt();
        coinArray.add(input);
        do{
            System.out.println("What is the value of the next coin? Press 0 to exit");
            input=obj.nextInt();
            if(input==0)
                break;
            coinArray.add(input);


        }while(input!=0);


        System.out.println("What is the total");
        total=obj.nextInt();

        Collections.sort(coinArray);

        System.out.println(coinArray);
        System.out.println(total);


        int[][] dp = new int[coinArray.size()+1][total + 1];

        dp[0][0] = 1;
        for (int i = 1; i <= coinArray.size(); i++) {
            for (int j = 0; j <= total; j++) {
                // Add the number of ways to make change without
                // using the current coin
                dp[i][j] += dp[i - 1][j];

                if ((j - coinArray.get(i - 1)) >= 0) {
                    // Add the number of ways to make change
                    // using the current coin
                    dp[i][j] += dp[i][j - coinArray.get(i - 1)];
                }
            }
        }


        for(int i=0;i<coinArray.size();i++) {
            for (int j = 0; j < total + 1; j++) {
            System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }

    }




    }
