#include<stdio.h>
int main()
{
   int mat[][3]= {{1,2,3},{4,5,6},{7,8,9}};
   int m , n;
   m = sizeof(mat)/ sizeof(mat[0]);// -? 36 /12
   n = sizeof(mat[0])/sizeof(mat[0][0]);

}
