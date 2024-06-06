package org.example;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Tree one=new Tree();
        one.addNode(7);
        one.addNode(4);
        one.addNode(22);
        one.addNode(19);
        one.addNode(175);
        one.addNode(163);
        one.addNode(6);
        one.deleteNode(7);
        one.display();
        System.out.println(one.search(15,one.root));


    }
}

class Tree {
    public Node root;

    public void addNode(int value) {
        if (root == null) {
            root = new Node(value);
        } else {
            root.addNode(value);
        }
    }

    public void display() {
        if (root != null) {
            root.display();
        }
    }

    public Node search(int value, Node p)
    {
        Node x=null;
        if(value<p.getValue() && p.hasLeft())
        {
            x=search(value,p.left);

        } else if(value> p.getValue() && p.hasRight())
        {
            x=search(value,p.right);

        } else if(value==p.value)
        {

            x=p;
        }


        return x;

    }

    public void deleteNode(int value)
    {
        root = root.delete(root, value);
    }


}



class Node{

    int value;
    public Node left=null;
    public Node right=null;

    public Node(int num)
    {
        this.value=num;
    }

    public int getValue()
    {
        return this.value;
    }

    public void setValue(int x)
    {
         this.value=x;
    }

    public boolean hasLeft()
    {
        return left!=null;
    }
    public boolean hasRight()
    {
        return right!=null;
    }

     public void addNode(int newValue)
     {
         if(newValue<value && !this.hasLeft())
         {
             left=new Node(newValue);
         } else if( newValue<value && this.hasLeft())
         {
             left.addNode(newValue);
         } else if(newValue>value && !this.hasRight())
         {
             right=new Node(newValue);
         } else if(newValue>value && this.hasRight())
         {
             right.addNode(newValue);
         }
     }


    public void display()
    {
        if(this.hasLeft())
        {
            left.display();

        }
        System.out.println(value);

        if(this.hasRight())
        {
            right.display();

        }
    }


    public Node delete(Node root, int value) {
        if (root == null)
            return root;

        if (value < root.getValue())
            root.left = delete(root.left, value);
        else if (value > root.getValue())
            root.right = delete(root.right, value);
        else {
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            root.setValue(minValue(root.right));
            root.right = delete(root.right, root.getValue());
        }
        return root;
    }

    private int minValue(Node root) {
        int minValue = root.getValue();
        while (root.left != null) {
            minValue = root.left.getValue();
            root = root.left;
        }
        return minValue;
    }


}








//public boolean hasNoChildren()
//{
//    return right==null && left==null;
//}
//
//public boolean isFull()
//{
//    return right!=null && left!=null;
//}


//public Node(int num,Node value)
//{
//    this.value=num;
//
//    if(value.getValue()<=this.value)
//        left=value;
//    else
//        right=value;
//
//
//}
//public Node(int num,Node left, Node right)
//{
//    this.value=num;
//    this.left=left;
//    this.right=right;
//}



//public static void insert2(Node p, int value)
//{
//    Node newNode=new Node(value);
//    if(p==null)
//    {
//        return;
//    }
//
//    Node current=p;
//    Node parent;
//
//    while(true)
//    {
//        parent=current;
//        if(current.getValue()>value)
//        {
//            current=current.left;
//            if(current==null)
//                parent.left=newNode;
//            return;
//        }
//
//        else
//            current=current.right;
//    }
//}


//
//public Node nextNum(Node p)
//{
//
//    Node x=null;
//    if(p.hasRight())
//    {
//        x=right;
//
//    }
//    if( x.hasLeft())
//    {
//        x=x.nextNumLeft(x);
//
//    }
//
//    return x;
//}
//
//public Node nextNumLeft(Node p)
//{
//
//    Node x=null;
//    if(p.hasLeft())
//    {
//        x=left;
//
//    }
//    if( x.hasLeft())
//    {
//        x=x.nextNumLeft(x);
//
//    }
//
//    return x==null ? p: x;
//}