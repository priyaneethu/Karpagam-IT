import java.util.Scanner;
public class MagicSquare{
    public static boolean rowSum(int [][]mat , int mainSum)
    {
        int row,col;
        for( row = 0 ; row < mat.length ; row++)
        {
            int sum = 0;
                for( col = 0 ; col < mat[0].length ; col++)
                   sum+=mat[row][col];
            if( sum !=mainSum)
              return false;
        }
        return true;
    }
    public static boolean colSum(int [][]mat , int mainSum)
    {
        int row,col;
        for( col = 0 ; col < mat[0].length ; col++)
        {
            int sum = 0;
                for( row = 0 ; row < mat.length ; row++)
                   sum+=mat[row][col];
            if( sum !=mainSum)
              return false;
        }
        return true;
    }
    public static boolean primaryDiagonalSum( int [][]mat , int mainSum){
        int i,sum =0;
        for( i = 0 ; i < mat.length; i++) 
           sum += mat[i][i];
        if( sum == mainSum)
            return true;
        else return false;    
    }
    public static boolean secondaryDiadonalSum( int [][]mat , int mainSum){
        int i,sum =0;
        for( i = 0 ; i < mat.length; i++) 
           sum += mat[i][mat.length-1-i];
        if( sum == mainSum)
            return true;
        else return false;    
    }
    public static int[][] fillMagicSquare(int n){
            int mat[][] = new int[n][n];
            int i, currRow = 0,currCol = n/2, prevRow =0, prevCol=n/2;
            for( i = 1 ; i  <= n*n ;i++)
            {
                    if( mat[currRow][currCol] == 0) 
                         mat[currRow][currCol] = i; 
                    else{
                        currRow= prevRow;
                        currCol = prevCol;
                        currRow++;
                        if(currRow >= n)
                         currRow = 0;
                        mat[currRow][currCol] = i; 
                    }      
                     prevRow = currRow;
                        prevCol =currCol;
                    currRow--;
                    if( currRow < 0)
                       currRow = n-1;
                    currCol++;
                    if( currCol >= n)
                       currCol = 0; 
                
            }
            return mat;

    }
    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][]mat = fillMagicSquare(n);
        for( int i = 0 ; i< n ; i++, System.out.println())
           for( int j = 0 ; j < n ; j++)
               System.out.print(mat[i][j]+" "); 
        int mainSum = n*(n*n +1 )/ 2;
        if((rowSum(mat, mainSum)== true)  &&(colSum(mat,mainSum)==true)&& ( primaryDiagonalSum(mat,mainSum)==true)  &&( secondaryDiadonalSum(mat,mainSum)==true))
                       System.out.println("Yes");
         else
         System.out.println("No");
    }
}