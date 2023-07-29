import java.util.ArrayList;
import java.util.Scanner;

class Node{
     char data;
     Node next;
      Node( char gd)
      {
        data = gd;
        next = null;
      }

}

class Queue
{
    Node front=null , rear=null;
    void enqueue( char gd)
    {
      Node newNode = new Node(gd);
      if( front == null)
          front = rear = newNode;
      else{
          rear.next = newNode;
        rear = newNode;
      }    

    }
    char dequeue(){
        if( front != null)
        {
            
          char  safe = front.data;
           if( front == rear)
               rear = null;
           front = front.next;
           return safe;
        }
        return 0;
    }
}
public class BreadthFirstSearchDemo
{
     public static void main(String[] arg)
      {
          Scanner sc = new Scanner(System.in);
         int noOfVertices=sc.nextInt(), noOfEdges=sc.nextInt();

         char [][]inp = new char[noOfEdges][2];

         for( int i = 0 ; i < noOfEdges ; i++)
         {
               inp[i][0] =sc.next().charAt(0);
               inp[i][1] = sc.next().charAt(0);
         
          }
          Node []graph = new Node[noOfVertices];
          for( int i = 0 ; i < noOfVertices ; i++)
              graph[i] = new Node((char)(i+65));
         
          for( int i = 0 ; i < noOfEdges ; i++)
          {
               int v1 =(int)(inp[i][0])-65;
               int v2 = (int)(inp[i][1])-65;
               Node tptr=null;
              Node newNode  = new Node(inp[i][1]);
              if( graph[v1].next ==null)
                  graph[v1].next = newNode;
                  else{
              
                  for( tptr=  graph[v1].next ;tptr.next!=null ;tptr= tptr.next );
                  tptr.next = newNode;
                  }    
            newNode  = new Node(inp[i][0]);
              if( graph[v2].next ==null)
                  graph[v2].next = newNode;
               else{            
                  for( tptr=  graph[v2].next ;tptr.next!=null ;tptr= tptr.next );
                  tptr.next = newNode;    
               }
          } 
          for(int  i = 0 ; i < noOfVertices ; i++)
          {
            System.out.print(graph[i].data);
            for( Node tptr = graph[i].next ; tptr !=null; tptr=tptr.next)
               System.out.print(" -> "+tptr.data+" ");
            System.out.println("\n|");   
          }
          bfs(graph , 'E' , noOfVertices);



        }
        static void bfs( Node[] graph , char src , int nov)
        {
             int ind = src-65;
             boolean []visited = new boolean[nov];
            // ArrayList<Character> myque = new ArrayList<Character>();
             Queue myque = new Queue();

            myque.enqueue(src);
             while( myque.front!= null)
             {
             char curr = myque.dequeue();
             if( visited[(int)curr-65] == false){
             visited[(int)curr-65]  =true;
             System.out.print(curr+" ");
             for( Node tptr= graph[(int)curr-65].next ; tptr!=null; tptr=tptr.next)
                 myque.enqueue(tptr.data);
             }
             }    

        }
}
/*8 11
A B
A C
A D
B E
B F
C F
C G
D G
E H
G H
F H */