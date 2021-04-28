class Calculator
{
    public static void main(String []str)
    {

      #include<stdio.h>
#include<conio.h>
int main()
{
   int ch,a,b,ans;
   float x,y;
   
 do
  {
   printf("\nenter your choice\n1.addition\n2.subtraction\n3.multiplication\n4.divde\n5.remainder\n6.exit");
   scanf("%d",&ch);
      switch(ch)
       {
	  case 1:
		  printf("\nenter two numbers");
		  scanf("%d%d",&a,&b);
		  printf("%d + %d = %d",a,b,a+b);
		  break;

	  case 2:
		  printf("\nenter two numbers");
		  scanf("%d%d",&a,&b);
		  printf("%d - %d = %d",a,b,a-b);
		  break;

	  case 3:
		   printf("\nenter two numbers");
		  scanf("%d%d",&a,&b);
		  printf("%d * %d = %d",a,b,a*b);
		  break;

	  case 4:
		  printf("\nenter two numbers");
		  scanf("%f%f",&x,&y);
		  printf("%f / %f = %f",x,y,x/y);
		  break;

	   case 5:
		   printf("\nenter two numbers");
		  scanf("%d%d",&a,&b);
		  printf("\nRemainder of %d and %d is %d",a,b,(a%b));
		  break;

	   case 6:
		  exit(0);

	   default:
		    printf("\nInvaild choice");
	}
	printf("\ndo you want to continue press 1 otherwise press 0");
	scanf("%d",&ans);
    }while(ans==1);
 getch();
 return 0;
}

