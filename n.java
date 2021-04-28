import java.util.Scanner;

public class n{


	public static void main(String[] args) {
   
System.out.println("Enter");
        Scanner ob=new Scanner(System.in);
        int a=ob.nextInt();
 int b=ob.nextInt();
 int c=ob.nextInt();
   int m=2;    
        
   if((a + b + c )%m ==(a%m+b%m+c%m))
    System.out.println("plus");     
   else
      System.out.println("no plus");

  if((a-b)%m ==(a%m-b%m)) 
    System.out.println("mius");      
  else
      System.out.println("no mius");

  if((a*b)%m ==(a%m * b%m)) 
    System.out.println("mul");  
      else
      System.out.println("no mul");

  if((a/b)%m ==(a%m / b%m)) 
    System.out.println("div");
        else
      System.out.println("no div");
            
            
       
	}

}
