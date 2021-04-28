import java.util.Scanner;
class Count1
{
 public static void main(String sr[])
  {
      Scanner ob=new Scanner(System.in);
      int a[]={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
     char ch[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'}; 
    String s=new String();
     System.out.println("enter String");
    s=ob.nextLine();
 s=s.toLowerCase();
 System.out.println(s.length());
   for(int i=0;i<s.length();i++)
   {   
      for(int j=0;j<26;j++)
    
     {
        if(s.charAt(i)==ch[j])
       {
          a[j]+=1;break;
       }
     }
   }
int sum=0;
  for(int i=0;i<26;i++)
    {
     System.out.println("count "+ch[i]+"= "+a[i]); 
     sum+=a[i];
     }
    System.out.println("sum is "+sum); 
}
}