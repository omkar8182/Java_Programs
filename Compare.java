//program for compare number
import java.util.Scanner;
class Compare
{
  public static void main(String arg[])
   {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter Numbers");
           int s[]=new int[4];                    //Take array input
        for(int i=0;i<4;i++)
           {
              s[i]=ob.nextInt();
            }
        if(s[0]==s[1] && s[0]==s[2] &&s[0]==s[3])
           {System.out.println("Numbers are equal");}
         else
            {System.out.println("Not Equal");}

    }    
}