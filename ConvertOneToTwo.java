import java.util.Scanner;
public class ConvertOneToTwo{

public static void main(String[] args)
    {
        int m,n;
        int noe;
        Scanner sc = new Scanner(System.in);
         noe = sc.nextInt();
         int []arr = new int [noe];
         for(int  i = 0 ; i < noe ; i++)
             arr[i] = sc.nextInt();
        m = sc.nextInt();
        n = sc.nextInt();

       if( m * n == noe){
        int ind= 0;
        int [][]mat = new int[m][n];
        for( int i = 0 ; i < m ; i++)
           for( int j = 0 ; j < n ; j++)
              mat[i][j]= arr[ind++];
        for( int i = 0 ; i < m ;System.out.println() ,i++)
              for( int j = 0 ; j < n ; j++)
                  System.out.printf("%d ", mat[i][j]);
      
       }

       else{
           System.out.print("Not Possible");
       }        
    }
}             