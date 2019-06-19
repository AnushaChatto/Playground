#include <stdio.h>
#include <math.h>
int main() {
	//Type your code
  int n,b;
  scanf("%d",&n);
  int sum=0;
  b=n;
  int q=0;
   while(b>0)
  {
    
    b=b/10;
     ++q;
  }
   b=n;
  int y;
  while(b>0)
  {
    y=b%10;
    sum=sum+pow(y,q);
    b=b/10;
  }
  if(sum==n)
  {
    printf("Armstrong Number");
  }
  else
    printf("Not an Armstrong Number");
	return 0;
}