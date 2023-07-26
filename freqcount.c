#include<stdio.h>
int main()
{
   char str[] = "this is a test sentence";
   int count[26]={0} ,i,ind ,sp=0 ;
   for( i = 0 ; str[i] != 0 ; i++) // strlen(str)
   {
       if( str[i] ==' ')
          sp++;
      else{
     ind = str[i]-'a';
     count[ind]= count[ind]+1 ;
     } //count[ind]++

   }
   for( i = 0 ; str[i] != 0 ; i++)
   {
       if( str[i] == ' ' && sp !=0 )
       {
           printf("%c:%d\n", str[i],sp);
           sp=0;

       }
      else if( str[i] !=' ' &&count[str[i]-'a'] != 0){
      printf("%c:%d\n", str[i],count[str[i]-'a']);
      count[str[i]-'a'] = 0;
      }
   }

}
/*a - a -> 0
b -a -> 1
c -a ->2
d -a -> 3
*/
