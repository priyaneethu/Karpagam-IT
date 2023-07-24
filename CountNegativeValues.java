import java.util.Scanner;
public class CountNegativeValues{
    public static int findNegStart( int n  , int []arr)
    {
        int st , end , mid;
        st = 0; 
        end = n-1;
         while( st <= end)
        {
        mid = (st+end) / 2;
        if( arr[mid] < 0)
          end = mid -1;
        else
           st  = mid+1;
       }     
       return st;
    }
    public static void main(String[] args)
    {
        int m,n;
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        n = sc.nextInt();
        int [][]mat = new int[m][n];
        for( int i = 0 ; i < m ; i++)
           for( int j = 0 ; j < n ; j++)
              mat[i][j]= sc.nextInt();

              
         int count = 0;
         for( int i = 0 ;i < m ; i++){ 
         int st = findNegStart( n , mat[i]);     
         count += (n -st);
         }
       System.out.println(count);
    }
}