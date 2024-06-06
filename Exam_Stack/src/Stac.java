import java.util.Arrays;

public class Stac {

    private int headOfStack;
    private Integer[] arr;
    private int size;


    public Stac(Integer[] arr, int size) {
        this.arr = arr;
        this.size = size;
        headOfStack = arr.length - 1;
    }

    public Integer peek() {
        return arr[headOfStack];
    }

    public Integer pop() {
        Integer x = arr[headOfStack];
        arr = Arrays.copyOfRange(arr, 0, headOfStack);
        headOfStack--;
        return x;
    }

    public void push(Integer y) {
        if (arr.length < size) {
            Integer[] arr2 = new Integer[arr.length + 1];
            for (int i = 0; i < arr.length; i++)
                arr2[i] = arr[i];

            arr2[arr.length] = y;

            this.arr = new Integer[headOfStack + 1];
            arr = arr2;
            headOfStack++;
        } else System.out.println("Stack is full. cannot push");

    }

    public boolean isFull() {
        if (arr.length == size) {
            System.out.println("full");

            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        if (arr.length == 0) {
            System.out.println("empty");

            return true;
        }
        return false;

    }

    public void display() {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    public void clear() {
        int num = arr.length;
        for (int i = 0; i < num; i++)
            this.pop();
    }

    public int size() {
        return this.size;

    }


}
