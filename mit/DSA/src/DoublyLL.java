//public class DoublyLL {
//    private Node head;
//    private Node tail;
//    private int size;
//    public void insert(int value,int index)
//    {
//        Node node=new Node(value);
//        if(index==0||size==0)
//        {
//            insertAtfirst(value);
//        }
//        else if(index==size-1)
//        {
//            insertAtLast(value);
//        }
//        else
//        {
//            int count=0;
//            Node temp=this.head;
//            while(count!=index)
//            {
//                count++;
//                temp=temp.next;
//            }
//            Node temp2=temp.next;
//            temp.next=node;
//            node.next=temp2;
//            node.prev=temp;
//            temp2.prev=node;
//        }
//    }
//    class Node
//    {
//        private int value;
//        private Node next;
//        private Node prev;
//        Node(int value)
//        {
//            this.value=value;
//        }
//    }
//
//
//}
