		import java.util.*;
		import java.util.HashMap;
		
		
public class Hashing{
			public static void main (String[] args) {
				Scanner ob=new Scanner(System.in);
				System.out.println("enter test cases");
				int t=ob.nextInt();
				while(t!=0)
				{
				    
				   Map<String,Integer> map=new HashMap<String,Integer>();
				   System.out.println("enter how many elements"); 
				   int n=ob.nextInt();
				   
				    for(int i=0;i<n;i++)
				    {
				    	System.out.println("enter key");
				       String key=ob.next();
				       System.out.println("enter corresponding value");
				       int value=ob.nextInt();
				        map.put(key,value);
				    }
				    System.out.println("Enter key you to found it's value");
				    String k=ob.next();
				    if(map.containsKey(k))
				    {
				    	System.out.println("found:key corresponding value is");
				        System.out.println(map.get(k));
				    }
				     else{
				         System.out.println("-1");
				     }   
				    
				    t-=1;
				}
		ob.close();
	  }
}

