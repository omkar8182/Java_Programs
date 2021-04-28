import java.util.Scanner;

class ReverseArray
{
   //iterative way
   /* public static void reverseArray(int a[],int n)
    {
     int i,j,temp;
     i=0;j=n-1;
      if(n==1)
     return;
    else
     {
        while(i<=j)
         {
             temp=a[i];
               a[i]=a[j];
                a[j]=temp;
             i++;
              j--;
           }
     } 
}*/
 //Recursive way;
 public static void reverseArray(int a[],int i,int j)
    {
     int temp;
        if(i<j)
         {
             temp=a[i];
               a[i]=a[j]; 
                a[j]=temp;
            reverseArray(a,i+1,j-1);   //recursive call
          }
         
 }

public static void printArray(int a[],int n)
{
    System.out.println("Reverse Array is");
      for(int i=0;i<n;i++)
         {
               System.out.println(a[i]);
          }
 }
  public static void main(String str[])
   {
      Scanner ob=new Scanner(System.in);
      System.out.println("Enter size of Array");
        int n=ob.nextInt();
        int a[];
        a=new int[n];
        for(int i=0;i<n;i++)
           {
             a[i]=ob.nextInt();
            }
          int i=0,j=n-1;
          //reverseArray(a,n);           //for Iterative way 
            reverseArray(a,i,j);          //for Recursive way
          printArray(a,n);
          
     }
}
 