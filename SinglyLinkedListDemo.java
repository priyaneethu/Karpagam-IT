import java.nio.file.NotLinkException;

class Node{
    int data;
    Node next;
    Node(int gd)
    {
        data = gd;
        next = null;
    }
    void display( )
    {
        System.out.print(data+" ");
    }
}

class SinglyLinkedList{
      Node head;
      SinglyLinkedList()
      {
          head = null;
      }
      void add(int  gd)
      {
        Node newNode = new Node(gd);
        if( head == null)
        {
            head = newNode;
        }
        else{
            Node tptr;
           for( tptr =head ; tptr.next!=null; tptr=tptr.next);
           tptr.next = newNode;
        } 
     }  
     void add( int pos , int gd)
     {
        Node newNode = new Node(gd);
        int count ;
        Node tptr , prev=null;
        for( tptr = head , count = 1;  count != pos&& tptr!=null ; 
                                            prev =tptr,tptr=tptr.next,count++);
        // System.out.println(pos+" "+count);
        if( pos == 1){
          newNode.next = head;
          head = newNode;
       }
       else{
        newNode.next =prev.next;
        prev.next = newNode;
       }

     }

     void remove( int gd)
    {
        Node prev=null,tptr;
        for( tptr = head ; tptr != null&& tptr.data != gd ;prev=tptr, tptr = tptr.next);
        if( tptr== head)
              head = head.next;
        else
            prev.next= tptr.next;

    }

        void display()
        {
            Node tptr;
            for( tptr = head ; tptr!=null; tptr= tptr.next)
                //System.out.print(tptr.data+" ");
                tptr.display();
              System.out.println();  
        }
      
}
public class SinglyLinkedListDemo{

       public static int findMidPoint( SinglyLinkedList sl)
       {
           Node slow, fast;
           for( slow = fast = sl.head ; fast!=null && fast.next!=null ;
                                   slow=slow.next,fast=fast.next.next);
           return slow.data;
       }
public  static void main(String[] arg)
{
    SinglyLinkedList sl = new SinglyLinkedList();
    sl.add(10);
    sl.add(20);
    sl.add(30);
    sl.add(40);
  //  sl.add(50);
    sl.display();
    
   
    
    System.out.println(findMidPoint(sl));
}

}