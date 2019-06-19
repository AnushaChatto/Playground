#include <stdio.h>
int main() {
	//Type your code
  int a;
  scanf("%d",&a);
  while(a>100)
  {a=a/10;}
  printf("%d",a%10);
	return 0;
}