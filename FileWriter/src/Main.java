public class Main{
    public static void main(String[] args){

       int index=0;
       int[] arr={1,2,3,4,5,6,7,8,9};
       int max=arr[0];
       int num= recur(arr,index,max);


        System.out.println(recurSort(arr,0));

    }

    public static int recur(int[] arr, int index, int max){
        if(index==arr.length){
            return max;
        }
        int num=arr[index++];
        int max2=recur(arr,index,num);
        if(max<max2)
            max=max2;
        return max;
    }


//    public static int findMax(int[] arr), int size{
//        if size =1
//            returnarr[0]
//
//                    return math.max[arrsize-1,findmax2(arr,size-1)]
//    }

    public static boolean recurSort(int[] arr, int index)
     {
         if(index+1==arr.length)
             return true;

         boolean sorted=true;

         if(arr[index]>arr[index+1])
             sorted=false;

         boolean newSort;
         newSort=recurSort(arr,index+1);

         if(!newSort || !sorted)
             return false;
         else
             return true;

     }

}