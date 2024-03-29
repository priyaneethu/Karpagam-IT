import java.nio.file.NotLinkException;

class Node<T>{
    T data;
    Node <T>next;
    Node(T gd)
    {
        data = gd;
        next = null;
    }
    void display( )
    {
        System.out.print(data+" ");
    }
}

class SinglyLinkedList<T>{
      Node<T> head;
      SinglyLinkedList()
      {
          head = null;
      }
      void add(T  gd)
      {
        Node<T> newNode = new Node(gd);
        if( head == null)
        {
            head = newNode;
        }
        else{
            Node<T> tptr;
           for( tptr =head ; tptr.next!=null; tptr=tptr.next);
           tptr.next = newNode;
        } 
     }  
     void add( int pos , T gd)
     {
        Node<T> newNode = new Node(gd);
        int count ;
        Node<T> tptr , prev=null;
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

     void remove( T gd)
    {
        Node <T>prev=null;
        Node<T>tptr;
        for( tptr = head ; tptr != null&& tptr.data != gd ;prev=tptr, tptr = tptr.next);
        if( tptr== head)
              head = head.next;
        else
            prev.next= tptr.next;

    }

        void display()
        {
            Node <T>tptr;
            for( tptr = head ; tptr!=null; tptr= tptr.next)
                //System.out.print(tptr.data+" ");
                tptr.display();
              System.out.println();  
        }
      
}
public class SinglyLinkedListDemo{

      /* public static int findMidPoint( SinglyLinkedList sl)
       {
           Node slow, fast;
           for( slow = fast = sl.head ; fast!=null && fast.next!=null ;
                                   slow=slow.next,fast=fast.next.next);
           return slow.data;
       }*/
       static void reverseList(SinglyLinkedList sl)
       {
            Node curr;
            Node safe;
            Node prev=null;
            for( curr= sl.head ; curr!=null ; )
            {
                 safe = curr.next;
                 curr.next = prev;
                 prev = curr;
                 curr = safe;

            }
         sl.head = prev;
       }
       void makeBothTraversal( SinglyLinkedList sl)
       {
           
           Node curr,safe;
           Node prev = null;
           for( curr = sl.head ; curr !=null ; ){
               curr.next = prev^curr.next;
               safe = curr;
               curr = prev ^ curr.next;
               prev = safe;

           }

         //forward
         for( prev = null , curr = sl.head ; curr!=null ; )
         {
            System.out.print(curr.data+" ");
            safe = curr.next ^ prev;
            prev = curr;
            curr = safe;
         }


       }
public  static void main(String[] arg)
{
    SinglyLinkedList<Integer> sl = new SinglyLinkedList();
    sl.add(10);
    sl.add(20);
    sl.add(30);
    sl.add(40);
  //  sl.add(50);
    sl.display();
    
   
    
   // System.out.println(findMidPoint(sl));
   SinglyLinkedList<String> sl1 = new SinglyLinkedList();
    sl1.add("Yagavi");
    sl1.add("Jeevitha");
    sl1.add("Subashini");
    sl1.add("Poornima");
  //  sl.add(50);
    sl1.display();
    reverseList(sl);
    sl.display();
    reverseList(sl1);
    sl1.display();
}

}