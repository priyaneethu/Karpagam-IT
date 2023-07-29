#include<stdio.h>
int subMatCheck( int stRow , int stCol , int sudoku[9][9])
{
   int countArr[10] = {0};
   int row,col ;
       for( row = stRow ; row < stRow+3 ; row++)
        for(col = stCol ; col < stCol+3 ; col++)
        {
                if( countArr[sudoku[row][col]]==0)
                   countArr[sudoku[row][col]] =1;
                else
                   return 0;

         }
   return 1;
}
int subMatGen( int sudoku[9][9])
{
   int stRow ,stCol =0;
   for( stRow =0 ; stRow < 9 ; stRow+=3)
   {
   for( stCol = 0 ; stCol < 9 ; printf("\n"),stCol+=3)
   {
       if( subMatCheck(stRow,stCol,sudoku) == 0)
          return 0;
   }
   }
   return 1;
}
int rowCheck( int sudoku[9][9])
{

   int row,col ;
       for( row = 0 ; row < 9; row++){
           int countArr[10] = {0};
        for(col = 0 ; col < 9 ; col++)
        {
                if( countArr[sudoku[row][col]]==0)
                   countArr[sudoku[row][col]] =1;
                else
                   return 0;

         }
       }
   return 1;
}
int colCheck( int sudoku[9][9])
{

   int row,col ;
       for( col = 0 ; col < 9; col++){
           int countArr[10] = {0};
        for(row = 0 ; row < 9 ; row++)
        {
                if( countArr[sudoku[row][col]]==0)
                   countArr[sudoku[row][col]] =1;
                else
                   return 0;

         }
       }
   return 1;
}
int main()
{
   int sudoku[9][9];// give some input here
   if( rowCheck(sudoku) ==1 && colCheck(sudoku)==1 && subMatGen(sudoku)==1)
      printf("Valid sudoku");
   else
      printf("Not valid ");
   

   
}
