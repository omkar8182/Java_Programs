//program for Transpose array
import java.util.Scanner;
class Gcd1
{
   static  int gcd(int a,int b)
   {
       if(a==0 || b==0)
       {
          return 1;
           }
        else if(a%b==0)
        {
           return b;
         }
          else if(b%a==0)
           {
              return a;
            }
         else
           {
               return gcd(b,a%b);
               } 
       }   
  public static void main(String arg[])
   {
        Scanner ob=new Scanner(System.in);
        int a,b;                    //Take array input
        System.out.println("Enter Numbers");
          a=ob.nextInt();
           b=ob.nextInt();
            System.out.println(gcd(a,b));     
      }
}  