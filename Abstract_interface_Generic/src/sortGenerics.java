public class sorty {



    public static <T extends Comparable<T>> void sortGenerics(T[] arr)
    {
        for(int i=0; i<arr.length-1;i++)
        {
             for(int j=0;j<arr.length-i-1;j++)
             {
                 if(arr[j].compareTo(arr[j+1])>0)
                 {
                     T temp=arr[j];
                     arr[j]=arr[j+1];
                     arr[j+1]=temp;
                 }

             }


        }

    }
}


//public static <T> void printArray(T[] arr)
//{
//    for(T element : arr)
//        System.out.println(element);
//
//}


