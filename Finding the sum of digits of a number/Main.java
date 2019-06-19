#include <stdio.h>
int main() {
	//Type your code
  int a;
  scanf("%d",&a);
  int b;
  b=a;
  int sum=0;
  while(b>0)
  {
    sum=sum+b%10;
    b=b/10;
  }
  printf("%d",sum);
	return 0;
}