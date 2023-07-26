import java.util.Scanner;
public class SpiralOrder{
    public static void  printSpiralOrder( int[][] mat , int m ,int n , int  sr , int sc)
    {
     for(int  i = sc ; i < n ; i++)
        System.out.print(mat[sr][i]+" ");

     for( int i = sr+1; i < m ; i++)
        System.out.print(mat[i][n-1]+" ");
     for( int i = m-2 ; i >= sc ;i--)
        System.out.print(mat[m-1][i]+" ");  
     for( int i = m-2 ; i > sr ; i--)
        System.out.print(mat[i][sc]+" ");   
    }
    public static void main( String[] arg)
    {
        int m,n;
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        n = sc.nextInt();
        int [][]mat = new int[m][n];
        for( int i = 0 ; i < m ; i++)
           for( int j = 0 ; j < n ; j++)
              mat[i][j]= i+j*2;
          for( int i = 0 ; i < m ; i++, System.out.println())
           for( int j = 0 ; j < n ; j++)
              System.out.print(mat[i][j]+" ");  
        for( int i = 0 ; i < n+1/2 ; i++)     
        printSpiralOrder( mat , m-i,n-i,i,i);
    }
}
/*5 5
1 2 3 4 5
6 7 8 9 10
11 12 13 14 15
16 17 18 19 20 
 21 22 23 24 25*/