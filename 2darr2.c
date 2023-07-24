#include<stdio.h>
int main()
{
   int m,n;
   scanf("%d %d",&m,&n);
   int mat[m][n];
   int row,col;
   for( row = 0; row <m ; row++)
   for(col = 0; col < n ; col++)
      scanf("%d",&mat[row][col]);

   for( row = 0; row <m ; row++,printf("\n"))
   for(col = 0; col < n ; col++)
       printf("%d ", mat[row][col]);

  for( row = 0; row <n; row++,printf("\n"))
   for(col = 0; col < m ; col++)
       printf("%d ", mat[col][row]);
}
