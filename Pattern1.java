import java.util.Scanner;
class Pattern1
{ 
  public static void main(String []arg)
   {
      Scanner ob=new Scanner(System.in);
        System.out.println("Enter HOW MANY ROWS");
         int n=ob.nextInt();
      for(int i=0;i<n;i++)
         {
           for(int j=n;j>i;j--)
             {
               System.out.print("*");
              }
            System.out.print("\n");
          }    
   }
}