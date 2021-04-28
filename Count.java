import java.util.Scanner;
class Count
{
 public static void main(String sr[])
  {
      Scanner ob=new Scanner(System.in);
      int a[]={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
     String s=new String();
     System.out.println("enter String");
    s=ob.nextLine();
 s=s.toLowerCase();
 System.out.println(s.length());
for(int i=0;i<s.length();i++)
{   
  if(s.charAt(i)=='a')
    {
      a[0]+=1;
    }
   else if(s.charAt(i)=='b')
    {
        a[1]+=1;
     }
   else if(s.charAt(i)=='c')
    {
      a[2]+=1;
    }
   else if(s.charAt(i)=='d')
    {
        a[3]+=1;
     }
 else if(s.charAt(i)=='e')
    {
      a[4]+=1;
    }
   else if(s.charAt(i)=='f')
    {
        a[5]+=1;
     }
 else if(s.charAt(i)=='g')
    {
      a[6]+=1;
    }
   else if(s.charAt(i)=='h')
    {
        a[7]+=1;
     }
 else if(s.charAt(i)=='i')
    {
      a[8]+=1;
    }
   else if(s.charAt(i)=='j')
    {
        a[9]+=1;
     }
 else if(s.charAt(i)=='k')
    {
      a[10]+=1;
    }
   else if(s.charAt(i)=='l')
    {
        a[11]+=1;
     }
 else if(s.charAt(i)=='m')
    {
      a[12]+=1;
    }
   else if(s.charAt(i)=='n')
    {
        a[13]+=1;
     }
 else if(s.charAt(i)=='o')
    {
      a[14]+=1;
    }
   else if(s.charAt(i)=='p')
    {
        a[15]+=1;
     }
 else if(s.charAt(i)=='q')
    {
      a[16]+=1;
    }
   else if(s.charAt(i)=='r')
    {
        a[17]+=1;
     }
 else if(s.charAt(i)=='s')
    {
      a[18]+=1;
    }
   else if(s.charAt(i)=='t')
    {
        a[19]+=1;
     }
 else if(s.charAt(i)=='u')
    {
      a[20]+=1;
    }
   else if(s.charAt(i)=='v')
    {
        a[21]+=1;
     }
 else if(s.charAt(i)=='w')
    {
      a[22]+=1;
    }
   else if(s.charAt(i)=='x')
    {
        a[23]+=1;
     }
   else if(s.charAt(i)=='y')
    {
      a[24]+=1;
    }
   else if(s.charAt(i)=='z')
    {
        a[25]+=1;
     }


  else
      {
         continue;
      }
 }
   System.out.println("count a= "+a[0]);
   System.out.println("count b= "+a[1]);
System.out.println("count c= "+a[2]);
   System.out.println("count d= "+a[3]);
 System.out.println("count e= "+a[4]);
   System.out.println("count f= "+a[5]);
 System.out.println("count g= "+a[6]);
   System.out.println("count h= "+a[7]);
 System.out.println("count i= "+a[8]);
   System.out.println("count j= "+a[9]);
   System.out.println("count k= "+a[10]);
   System.out.println("count l= "+a[11]);
System.out.println("count m= "+a[12]);
   System.out.println("count n= "+a[13]);
 System.out.println("count o= "+a[14]);
   System.out.println("count p= "+a[15]);
 System.out.println("count q= "+a[16]);
   System.out.println("count r= "+a[17]);
 System.out.println("count s= "+a[18]);
   System.out.println("count t= "+a[19]);
   System.out.println("count u= "+a[20]);
   System.out.println("count v= "+a[21]);
System.out.println("count w= "+a[22]);
   System.out.println("count x= "+a[23]);
 System.out.println("count y= "+a[24]);
   System.out.println("count z= "+a[25]);
int sum=0; 
for(int j=0;j<a.length;j++)
   {
     sum=sum+a[j];
    }
System.out.println("Sum is "+sum);
 }
}