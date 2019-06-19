#include <stdio.h>
int factorial(int a)
{ int sum=1;
  for(int i=1;i<=a;i++)
    sum=sum*i;
 return sum;
}
int main() {
	//Type your code
  int n;
  scanf("%d",&n);
  int b;
  b=n;
  int y,sum=0;
  while(b>0)
  {
    y=b%10;
    sum=sum+factorial(y);
    b=b/10;
  }
  if(sum==n)
    printf("Yes");
  else
    printf("No");
	return 0;
}