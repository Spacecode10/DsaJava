import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;
class CustomLL
{
    private Node head;
    private Node tail;
    private int size;
    public CustomLL()
    {
        this.size=0;
    }
    public void insertFirst(int value)
    {
        Node node =new Node(value);
        node.next=this.head;
        this.head=node;
        if(tail==null)
        {
            tail=head;
        }
        size+=1;
    }
    public void insertAtLast(int value)
    {
        if(tail==null)
        {
            insertFirst(value);
        }
        Node node=new Node(value);
        this.tail.next=node;
        this.tail=node;
        this.size++;
    }
    public void insertAtIndex(int index,int value)
    {
        Node node=new Node(value);
        if(index>=size)
        {
            System.out.println("out of bounds");
            return;
        }
        int counter=0;
        Node temp=this.head;
        while(counter!=index)
        {
            temp=temp.next;
            counter++;
        }
        Node temp2=temp.next;
        temp.next=node;
        node.next=temp2;
        this.size++;

    }
    private void insertRec(int value,int index,Node currentNode)
    {
        if(index==1)
        {
            Node node=new Node(value);
            node.next=currentNode.next;
            currentNode.next=node;
            this.size++;
            return;
        }
       insertRec(value,index--,currentNode.next);
//        return;

    }
    public void insertRec(int val,int index)
    {
        insertRec(val,index,this.head);
    }
    public void display()
    {
        Node temp=this.head;
        while(temp!=null)
        {
            System.out.print(temp.value+" -> ") ;
            temp=temp.next;
        }
    }
    public int delete(int index)
    {
        if(index==0)
        {
            int value=this.head.value;
            this.head=this.head.next;
            this.size--;
            return value;
        }
        else if(index==size-1)
        {
            int value= this.tail.value;
            this.tail=null;
            this.size--;
            return value;
        }
        else if(size==1)
        {
            int value=this.head.value;
            this.head=null;
            this.tail=null;
            return value;
        }
        else
        {

            int counter=0;
            Node temp=this.head;
            while(counter!=index-1)
            {
                temp=temp.next;
                counter++;
            }
            Node temp2=temp.next;
            int value=temp2.value;
            temp.next=temp2.next;
            size--;
            return value;
        }
    }
    private class Node
    {
        private int value;
        private Node next;
        public Node(int value)
        {
            this.value=value;
        }
    }
}
public class Test {
    public static void main(String[] args) {
        CustomLL ll=new CustomLL();
        ll.insertFirst(3);
        ll.insertFirst(4);
        ll.insertFirst(5);
//        ll.insertAtLast(5);
//        ll.insertAtLast(6);
//        ll.insertAtLast(7);
//        ll.insertAtIndex(1,9);
        ll.display();
        ll.insertRec(9,2);
//        System.out.println(ll.delete(3 ));
        ll.display();

    }
}
