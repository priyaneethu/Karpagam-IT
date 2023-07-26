#include<stdio.h>
int main()
{
   char str[] = "malabaalam";
   int f = 0 , l= strlen(str)-1;

   while( f < l){
           if( str[f] != str[l])
              break;
           f++;
           l--;
   }
   if( f >= l)
      printf("Yes");
   else
      printf("No");

}
