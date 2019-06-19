#include <stdio.h>
int main() {
	//Type your code
  int a,sum=0;
  scanf("%d",&a);
  sum=a%10;
  while(a>10)
  {a=a/10;}
   sum=sum+a;
   printf("%d",sum);
	return 0;
}