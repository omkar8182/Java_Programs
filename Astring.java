//program for reverse string
import java.util.Scanner;
class Astring
{
  public static void main(String arg[])
   {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter string");
        char s[]=ob.nextLine().toCharArray(); //used toCharArray() for create array
       for(int i=(s.length-1);i>=0;i--)
        {
          System.out.print(s[i]);
        }
    }    
}