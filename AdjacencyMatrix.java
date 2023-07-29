import java.util.Scanner;
public class AdjacencyMatrix{
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

         int [][]graph = new int[noOfVertices][noOfVertices];
         for( int i = 0 ; i < noOfEdges ; i++)
          {
            int row = (int)(inp[i][0])-65;
            int col = (int)(inp[i][1]) - 65;
            graph[row][col] = 1;
            graph[col][row] = 1;
          }  
          for(int  i = 0 ;i < noOfVertices ; i++ , System.out.println())
            for( int j = 0 ; j < noOfVertices ; j++)
                System.out.print(graph[i][j]+" ");


         for( int i = 0 ; i < noOfEdges ; i++)
             System.out.println( inp[i][0]+"---"+inp[i][1]);


      }
}