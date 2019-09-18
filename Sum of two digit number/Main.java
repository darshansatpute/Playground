#include<stdio.h>
int main()
{
  //Type your code here
  int num;
  scanf("%d",&num);
  int l_digit=num%10;
  int f_digit=num/10;
  printf("%d",(l_digit+f_digit));
  return 0;
}