class Node{
    int data;
    Node next;
    Node(int gd)
   {
    data = gd;
    next = null;
   }
}
class CircularSLL
{
    Node head,tail;
    CircularSLL()
    {
        head = tail =null;
    }
    void add( int gd)
    {
         Node newNode = new Node(gd);
         if( head==null)
             {
                head = tail = newNode;
                tail.next= head;
             }       
             else{
                 tail.next = newNode;
                 newNode.next = head;
                 tail = newNode;
             } 

    }
    void display()
    {
        Node curr;       //curr!= tail.next 
        for(curr = head ; curr.next != head ; curr=curr.next)
          System.out.print(curr.data+" ");
        System.out.println(curr.data);  
    }
}

public class CircularSLLDemo
{
    public static void main(String[] arg)
    {
        CircularSLL cl = new CircularSLL();
        cl.add(10);
        cl.add(20);
        cl.add(30);
        cl.add(40);
        cl.add(50);
        cl.display();
    }
}