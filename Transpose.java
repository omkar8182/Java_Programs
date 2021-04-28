//program for Transpose array
import java.util.Scanner;
class Transpose
{
  public static void main(String arg[])
   {
        Scanner ob=new Scanner(System.in);
        int s[][]=new int[3][3];                    //Take array input
        System.out.println("Enter Numbers");             
           for(int i=0;i<3;i++)
             {
                for(int j=0;j<3;j++)
                { 
                   s[i][j]=ob.nextInt();
                 }
             }
        System.out.println("Your given array is");
           for(int i=0;i<3;i++)
             {
                for(int j=0;j<3;j++)
                { 
                   System.out.print(s[i][j]+" ");
                 }
                  System.out.print("\n");
             }
            System.out.println("After Transpose");
                
           
              for(int i=0;i<3;i++)
                {
                 for(int j=0;j<3;j++)
                   { 
                      System.out.print(s[j][i]+" ");
                    }
                   System.out.print("\n");
                 }

    } 
}  