class Node{
    Node prev;
    int data;
    Node next;

    Node( int gd)
    {
        data = gd;
        next = prev = null;
    }
}
class DoublyLinkedList
{
   Node head, tail;
   DoublyLinkedList()
   {
      head = tail = null;
   }
   void add( int gd)
   {
      Node newNode = new Node(gd);
      if( head == null)
         head = tail = newNode;
      else{
          newNode.prev = tail;
          tail.next = newNode;
          tail = newNode;
      }   
   }
   void addSortedOrder(int gd)
   {
    Node curr;
    Node  newNode = new Node(gd);
    if( head == null)
      head = tail = newNode;
    else{
        for( curr = head ; curr!=null && curr.data < newNode.data ;
                                     curr = curr.next);
       if( curr == head)//start
       {
            newNode.next = curr;
            curr.prev = newNode;
            head = newNode;
       }
       else if( curr == null)//end
       {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
       }
       else{//middle
           newNode.prev = curr.prev;
           newNode.next = curr;
           curr.prev.next = newNode;
           curr.prev = newNode;
       }
    }  
     
   }
   void forwardDisplay()
   {
    Node tptr;
    for( tptr = head ; tptr!=null ; tptr = tptr.next)
       System.out.print(tptr.data +" ");
   System.out.println();   
   }
   void backwardDisplay()
   {
    Node tptr;
    for( tptr = tail ; tptr!=null ; tptr = tptr.prev)
       System.out.print(tptr.data +" ");
   System.out.println(); 
   }
}

public class DoublyLinkedListDemo
{
    public static void main(String[] arg)
    {
          DoublyLinkedList dl = new DoublyLinkedList();
          /*dl.add(10);
          dl.add(20);
          dl.add(3);
          dl.add(15);
          dl.add(5);
          dl.add(1);
          dl.forwardDisplay();
          dl.backwardDisplay();
          */
          dl.addSortedOrder( 10);
          dl.addSortedOrder( 20);
          dl.addSortedOrder( 5);
          dl.addSortedOrder( 15);
          dl.addSortedOrder( 3);
          dl.addSortedOrder( 60);
          dl.forwardDisplay();
    }
}