import java.util.Scanner;
class Swap
{ 
   void swap(int a[],int i,int j)
    {
    int temp;
       temp=a[i];
     a[i]=a[j];
     a[j]=temp;
   }  
}
class New extends Swap
{
 void mergeSort(int a[],int size)
   {
   //merge 'a' array into 'a1' and 'a2'
      int mid,i,j;
     mid=size/2;
      int a1[]=new int[mid];
      int a2[]=new int[mid];
       // put value of 'a' into 'a1 and a2' 
      for(i=0,j=0;j<mid;i++,j++)
          a1[j]=a[i];
    
       //here in condition use i<size beacase main array start from mid-end so,   
      for(i=mid,j=0;i<size;i++,j++)
          a2[j]=a[i];
  //for first array sort using bubble sort

      for(i=0;i<mid;i++)
      {
         for(j=i+1;j<mid;j++)
            {
                 if(a1[i]>a1[j])
                    {
                       swap(a1,i,j);
     
                      }
              }
       }
//for second array sort  
      for(i=0;i<mid;i++)
      {
         for(j=i+1;j<mid;j++)
            {
                 if(a2[i]>a2[j])
                    {
                       swap(a2,i,j);
     
                      }
              }
       }
int k;
//for merge both array
    for(i=j=k=0;i<size;i++)
      {
      
                   
        if(a1[j]<=a2[k])
         {  
           a[i]=a1[j];
            j++;
          }
            else
                 {
                   a[i]=a2[k];
                      k++;
                    }

 if(j==mid || k==mid){break;}                
        }
/*this two loops for adding remaning elements
for(i=j=0;j<mid;j++,i++)
{
 a[i++]=a1[j++];
   
}
for(i=k=0;k<mid;k++,i++)
{
 a[i++]=a2[k++];
 }
*/      
    //print sort array after merge 
 	System.out.println("new array is");
	 for(i=0;i<size;i++) 
 	System.out.println(a[i]);
             
 } 
}
public class MergeSort
{   
  public static void main(String str[])
 { 
   
    int a[]=new int[6];
     int i;
    Scanner ob=new Scanner(System.in);
    System.out.println("enter array of 5 numbers");
    for(i=0;i<6;i++)
     a[i]=ob.nextInt();
    // for(i=0;i<5;i++)
      // System.out.println(a[i]); 
New obb=new New(); 
 obb.mergeSort(a,6);
 }
}
  