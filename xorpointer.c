#include<stdio.h>
#include<stdint.h>
int main()
{

     int num1 = 100;
     int num2 = 200;
     int *ptr1 , *ptr2;
     ptr1 = &num1;
     ptr2 = &num2;
     printf("%u %u\n" , ptr1,ptr2);
     void * xor;
     xor = (void*)((uintptr_t)ptr1 ^(uintptr_t) ptr2);
     printf("%u\n",xor);
     printf("%u %u ",((uintptr_t)xor^(uintptr_t)ptr2), 
                    ((uintptr_t)xor^(uintptr_t)ptr1));
}