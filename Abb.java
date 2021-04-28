 import java.util.Scanner;
class Ab1
     {
         Scanner ob=new Scanner(System.in);
           String str1;int i;
            void fun()
              {  
               System.out.println("enter number");
                   str1=ob.nextLine();
                   i=ob.nextInt();
                 System.out.println("name is "+str1);
                 System.out.println("charat 0 is="+str1.charAt(2));
                 System.out.println("indexof"+str1.indexOf('k'));
                 System.out.println("squre of"+i+"is"+Math.pow(i,2));
                  System.out.println((int)Math.cbrt(i));
                 System.out.println(Math.sqrt(i));
                 
                     
               }

         }      
class Abb
{ 
   public static void main(String str[])
     {
        Ab1 ob=new Ab1();
         ob.fun();
       }
}


         