public class Main {
    public static void main(String[] args) {

        int[] x= {1,9,3,5,7,8,2,14};
        x= mergeSort(x);

        for(int i=0; i<x.length;i++) {
            System.out.println(x[i]);
        }

    }




    public static int[] mergeSort(int[] x)
    {

        if(x.length<=1)
            return x;

        int length= x.length/2;

        int[] leftside=new int[length];
        int[] rightside=new int[x.length-length];

        System.arraycopy(x,0,leftside,0,length);
        leftside= mergeSort(leftside);

        System.arraycopy(x,length,rightside,0,x.length-length);
       rightside=mergeSort(rightside);

       int countright=0;
       int countleft=0;
       int leftlength=leftside.length;
       int rightlength=rightside.length;
       int[] y=new int[x.length];

       for(int i=0;i<x.length;i++)
       {
           if(countleft< leftlength && countright<rightlength&&leftside[countleft]<rightside[countright])
           {
               y[i]= leftside[countleft];
               countleft++;
           }
           else if(countleft< leftlength && countright<rightlength&&leftside[countleft]>=rightside[countright]){
                 y[i]= rightside[countright];
                 countright++;
               }else if ( countleft< leftlength && countright>=rightlength)
           {
               y[i]= leftside[countleft];
               countleft++;
           }else if ( countleft>= leftlength && countright<rightlength)
           {
               y[i]= rightside[countright];
               countright++;
           }

       }

        return y;


    }

}