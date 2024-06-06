

public class Main {
    public static void main(String[] args) {
        LinkedLst l = new LinkedLst();
        l.insert(7);
        l.insert(5);
        l.insert(3);
        l.insert(9);
        l.insert(11);
        l.insert(1);
        l.display();
        System.out.println(l.searchNode(1));
        System.out.println(l.searchNode(11));
        System.out.println(l.searchNode(7));
        System.out.println(l.searchNode(6));

        l.deleteNode(1);
        l.deleteNode(3);
        l.deleteNode(9);
        l.display();

        l.clear();
        l.display();


    }
}


class Node {
    int key;
    Node forward;
    Node backward;

    public Node(int key) {
        this.key = key;
        this.forward = null;
        this.backward = null;
    }

}

class LinkedLst {

    Node front;
    Node rear;

    public LinkedLst() {
        front = null;
        rear = null;
    }

    public void display() {
        Node cur = front;


        while (cur != null) {
            System.out.print(cur.key + " ");
            cur = cur.forward;
        }
        System.out.print("\n");
    }

    public void clear() {
        Node cur = front;

        while (cur != null) {
            Node next = cur.forward;
            cur.forward = null;
            cur.backward = null;
            cur = next;
        }
        front = null;
        rear = null;

        System.out.println("cleared");
    }

    public void insert(int value) {
        Node x = new Node(value);

        if (front == null) {
            front = x;
            rear = x;
            return;
        }

        Node cur = front;

        if (value < cur.key) {
            x.forward = cur;
            cur.backward = x;
            front = x;
            return;
        }

        while (cur != null && value > cur.key) {
            cur = cur.forward;
        }

        if (cur == null) {
            rear.forward = x;
            x.backward = rear;
            rear = x;
        } else {
            x.forward = cur;
            x.backward = cur.backward;
            cur.backward.forward = x;
            cur.backward = x;
        }


    }

    public boolean searchNode(int value) {
        Node cur = front;
        while (cur != null) {
            if (cur.key == value)
                return true;

            cur = cur.forward;
        }

        return false;

    }

    public void deleteNode(int value) {
        Node cur = front;
        while (cur != null) {
            if (cur.key == value) {
                if (cur == front)
                {
                    front = cur.forward;
                    if (front != null)
                        front.backward = null;
                } else if (cur == rear) {
                    rear = cur.backward;
                    rear.forward = null;
                } else {
                    cur.backward.forward = cur.forward;
                    cur.forward.backward = cur.backward;
                }
                return;
            }
            cur = cur.forward;
        }


    }


}