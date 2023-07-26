#include<stdio.h>

int main()
{
   int sudoku[9][9];
   int row,col ,stRow ,stCol =0;

   for( stRow =0 ; stRow < 9 ; stRow+=3)
   {
   for( stCol = 0 ; stCol < 9 ; printf("\n"),stCol+=3)
   {
       int countArr[10] = {0};
       for( row = stRow ; row < stRow+3 ; row++)
        for(col = stCol ; col < stCol+3 ; col++)
        {


         }
   }
   }
}
