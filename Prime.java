import java.util.Scanner;
class Prime
{
  public static void main(String arg[])
  {
      int n,i=2,j,count=0;
      int k;
     System.out.println("enter number");
    Scanner ob=new Scanner(System.in);
    n=ob.nextInt();
 System.out.println("Prime numbers are ");
    while(i<=n){ k=1;
      for(j=2;j<i;j++)
          {
               if(i%j==0)
                   {
                       k=0;
                       break;
                     }
           }
                if(k==1)
                 {
                   System.out.println(i);
                   count++;
                 }
        
               i+=1;
         }
         System.out.println("number count is"+count);   
    }
 }
        
          