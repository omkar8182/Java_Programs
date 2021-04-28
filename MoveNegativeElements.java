import java.util.Scanner;
class MoveNegativeElements
{
  static void moveNegativeElements(int a[],int n)
    {
       int i,j=0,pivot=0;
          for(i=0;i<n;i++)
           { 
              if(a[i]<pivot)
                  {
                    int temp=a[i];
                     a[i]=a[j];
                       a[j]=temp;
                        j++;
                   }
            }
     }
 static void printArray(int a[],int n)
      {
             for(int i=0;i<n;i++)
            {
              System.out.print(a[i]+"\t");
            }
       } 
   public static void main(String str[])
   {
      Scanner ob=new Scanner(System.in);
      System.out.println("Enter size of Array");
        int n=ob.nextInt();
        int a[];
        a=new int[n];
    System.out.println("enter elements");      
  for(int i=0;i<n;i++)
           {
             a[i]=ob.nextInt();
             }
       moveNegativeElements(a,n);   
        
          printArray(a,n);          
 
                       
}
}
