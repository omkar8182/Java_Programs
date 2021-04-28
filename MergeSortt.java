import java.util.Scanner;
class MergeSortt
{
 static void merge(int a[],int lb,int mid,int up)
      {
         int i,j,k=lb;
             i=lb;
            j=mid+1;
         while(i<=mid && j<=up)
          { 
             if(a[i]<a[j])
              {
                a[k]=a[i];
                 i++;
              }
              else
               {
                  a[k]=a[j];
                    j++;
                 }
              k++;
           }
        
               while(i<=mid)
                   {a[k]=a[i];i++;k++;}
            
                   while(j<up){a[k]=a[j];j++;k++;}
                  
         
}
  
 static void mergeSort(int a[],int start,int end)
    {
         int i,j,k;
     if(start<end)
      {
       int mid=(end-1)/2;
       mergeSort(a,start,mid);
       mergeSort(a,mid+1,end);
       merge(a,start,mid,end);
      }
   }
  
    public static void main(String str[])
     {
          int n;
          Scanner ob=new Scanner(System.in);
         System.out.println("Enter Array size");
             n=ob.nextInt();
          int a[]=new int[n];
          for(int i=0;i<n;i++)
              a[i]=ob.nextInt();
             int start=0;
              int end=n-1;
       mergeSort(a,start,end);
                for(int i=0;i<n;i++)
              System.out.println(a[i]);
       
  }
}