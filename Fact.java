import java.util.Scanner;
public class Fact
{
  static int fact(int n)          //Recursive way 
   {
       if(n==1)
        return 1;
       else 
         return n*fact(n-1);
    }
  static void fun(int n)                //Iterative/normal way factorial
   {
   	int sum=1;
   	for(int i=1;i<=n;i++)
    	{
    	 sum=sum*i;
       	 }
     	System.out.println(sum);
   } 
  public static void main(String str[])
  {
  
     Scanner ob=new Scanner(System.in);
     System.out.println("enter number for factorial");
    int n=ob.nextInt();   
     System.out.println(fact(n));
    fun(n);  
}
}