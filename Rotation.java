
import java.util.Scanner;
public class Rotation {
	static void cyclicone(int a[],int n){
		 int last=a[n-1];
		  for(int i=n-1;i>0;i--)
		  {
			  a[i]=a[i-1];
		  }
		  a[0]=last;
	}
	static void printArray(int a[],int n)
	{
		 for(int i=0;i<n;i++)
		 {
			System.out.print(a[i]+"\t");
		 }
	}
	public static void main(String[] args) {
      Scanner ob=new Scanner(System.in);
		int n;
	 	 System.out.println("enter size of array");
	 	  n=ob.nextInt();
	 	   int a[]=new int[n];
	 	    System.out.println("enter Elements\n");
	 	    for(int i=0;i<n;i++)
	 	    {
	 	    	 a[i]=ob.nextInt();
	 	    }
	 	    System.out.println("Before");
	 	    printArray(a,n);
	 	  cyclicone(a,n);
	 	  System.out.println("\nAfter rotate by ONE");
	 	   printArray(a,n);
            
	}

}
