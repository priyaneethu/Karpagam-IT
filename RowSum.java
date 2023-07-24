import java.util.Scanner;
public class RowSum{
    public static void rowSum(int m , int n , int [][]mat ){
         int sum, row,col;
         for( row = 0; row < m ; row++)
           {
            sum = 0;
            for( col = 0; col < n ; col++)
                sum += mat[row][col];
            System.out.printf("%d ", sum);
           
           }
    } 
    public static void diagonalPrint( int m , int n , int [][]mat){
         int row , col,stRow,stCol ;
         for( stRow =0 ,stCol = 0 ; stRow < m ; stRow++, System.out.println())
         for( row = stRow, col = stCol; row >=0 && col < n ; row--,col++)
            System.out.printf("%d ", mat[row][col]);
        for( stRow = m-1 , stCol = 1 ; stCol < n ; stCol++, System.out.println())
            for( row = stRow, col = stCol; row >=0 && col < n ; row--,col++)
            System.out.printf("%d ", mat[row][col]);
          
        }
        public static int diagonalSum(  int n , int [][]mat){
             int row , col , sum = 0; 
          /* for(row =0 , col =0 ;row < n && col < n; row++,col++ )
               sum += mat[row][col];
            for( row = 0, col = n-1; row < n && col >=0 ;row++,col--)   
               sum+= mat[row][col];*/
            for( int i = 0 ; i < n ; i++ )
            {
                sum += mat[i][i];
                sum+= mat[i][n-1-i];
            }
            //System.out.println(sum);
               if( n % 2 != 0)
              sum -= ( mat[n/2][n/2]);

            return sum;     
        }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //int m = sc.nextInt();
        int n = sc.nextInt();
        int [][]mat = new int [n][n];
        int i , j;
        for( i = 0 ;i < n ; i++)
           for( j = 0 ;j < n ; j++)
               mat[i][j] = sc.nextInt();
       // rowSum(m,n,mat); 
       System.out.println(diagonalSum( n ,mat)); 
    }

}