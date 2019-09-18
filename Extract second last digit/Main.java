#include<stdio.h>
int main()
{
  //Type your code here
  int num;
  scanf("%d",&num);
  int temp=num;
  int digit=0;
  while(temp!=0)
  {
   temp=temp/10;
    digit++;
  }
  int s_digit=(num/10)%10;
   printf("%d",s_digit);
  // printf("%d",digit);
  return 0;
}