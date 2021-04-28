import java.util.Scanner;
class Pa
{
  int n,rem,sum=0,temp;
   Scanner ob=new Scanner(System.in);
 void palindrome()
  {
	 System.out.println("enter number");
       n=ob.nextInt();
      temp=n;
      while(n!=0)
       {
     	rem=n%10;
     	sum=sum*10+rem;
     	n=n/10;
    	}  
    if(temp==sum)
       {
         System.out.println("Given number is pailndrome");
        }
          else
           { 
              System.out.println("Given number is not pailndrome");
            }
 }
void armstrong()
 {
  sum=0;
   System.out.println("enter number");
   n=ob.nextInt();
   int temp=n;
  while(n!=0)
   {
    rem=n%10;
    sum=sum+rem*rem*rem;
     n=n/10;
      }
   if(temp==sum)
      {System.out.println("Given number is armstrong");}
   else
    {System.out.println("Given number is not armstrong");}
   }
}
//MAin class
  class Armpalin
  {
      public static void main(String arg[])
        {
          Pa ob1=new Pa();
          int ch;
          Scanner ob=new Scanner(System.in);
           System.out.println("how many time repeat");
          int r=ob.nextInt();
       
          while(r!=0)
           {
             System.out.println("\nenter your choice\n1.pailndrome\n2.armstrong");
           ch=ob.nextInt();
            switch(ch)
             {
               case 1:
                     ob1.palindrome();
                     break;
                case 2:
                       ob1.armstrong();
                       break;
                 
                  default:
                            System.out.println("Invaild choice");
               }
              r-=1;
              }   
    }
}
     
  