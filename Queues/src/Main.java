import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Stack<Integer> stk= new Stack<>();
        Queue<Integer> q= new LinkedList<Integer>();


        int[] x={1,3,5,7,9};
        Q y=new Q(x);


        y.deq();
        y.display();
        System.out.println(y.isFull());
        y.enq(7);
        y.display();
        y.deq();
        y.display();
        y.deq();
        y.display();
        y.deq();
        y.display();
        y.deq();
        y.display();
        y.deq();
        y.display();
        System.out.println(y.isEmpty());
        y.enq(2);
        y.enq(4);
        y.enq(6);
        y.deq();
        y.enq(10);
        y.display();




    }
}


class Q{

    int front;
    int rear;
    int size;
    int[] q;
    int curLength;

    public Q(int s)
    {
        front=0;
        rear=0;
        size=s;
        q=new int[s];
    }

    public Q(int[] q)
    {
        this.q=q;
        front=0;
        rear=q.length-1;
        size=q.length;
        curLength=size;
    }

    public void enq(int x) {
        if (!isFull()) {
            rear = (rear + 1) % size;
            q[rear] = x;
            curLength++;
        }
    }

    public int deq() {
        if (!isEmpty()) {
            int kicked = q[front];
            front = (front + 1) % size;
            curLength--;
            return kicked;
        }
        return -1;
    }

    public boolean isEmpty() {
        return curLength == 0;
    }

    public boolean isFull() {
        return curLength == size;
    }

    public void display() {
        for (int i = 0; i < curLength; i++) {
            System.out.print(q[(front + i) % size] + " ");
        }
        System.out.println();
    }

    public int peekFront() {
        if (!isEmpty()) {
            return q[front];
        }
        return -1;
    }

    public int peekRear() {
        if (!isEmpty()) {
            return q[rear];
        }
        return -1;
    }
}

