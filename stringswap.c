#include<stdio.h>
int main()
{
   char str1[100] = "Hello world";
   char str2[100] ="this is a test";
   char temp;
   int  i;
   for( i = 0 ;str1[i]!= 0 && str2[i]!= 0 ;i++)
   {
   temp = str1[i];
   str1[i] = str2[i];
   str2[i] = temp;
   }
   if( str1[i] != 0){
   int st = i;
   while(str1[i]!= 0)
   {

       str2[i] = str1[i];
       i++;
   }
   str1[st]=0;
   str2[i]=0;
   }
   if( str2[i] != 0){
   int st = i;
   while(str2[i]!= 0)
   {

       str1[i] = str2[i];
       i++;
   }
   str1[i]=0;
   str2[st]=0;
   }
   printf("%s\n%s",str1,str2);

}
