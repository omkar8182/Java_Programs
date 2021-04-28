import java.util.Scanner;
public class MaxandMin
{
 
  static void maxandmin(int a[],int n)
  { 
     int max=a[0],min=a[0];
      for(int i=0;i<n;i++)
       {
          if(max<a[i])
            { 
              max=a[i];
             }
             else{
                   if(min>a[i])
                    { 
                      min=a[i];
                     }
                  }
       }
 System.out.println("max="+max+"  and min="+min);
   }

  public static void main(String str[])
   {  
       
      Scanner ob=new Scanner(System.in);
       System.out.println("Enter size of array");
          int n=ob.nextInt();
       int a[]=new int[n];       
 System.out.println("Enter arrray element");
        for(int i=0;i<n;i++)
        {
          a[i]=ob.nextInt();
         }
       maxandmin(a,n);
     }
 }  