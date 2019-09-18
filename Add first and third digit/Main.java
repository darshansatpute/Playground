#include<stdio.h>
int main()
{
  //Type your code here
  int num;
  scanf("%d",&num);
  int f=num%10;
    int l=num/100;
  printf("%d",f+l);
  return 0;
}