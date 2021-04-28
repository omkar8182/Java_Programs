import java.util.Scanner;
class Abc
 {
  int a;
  int accept()
   {
      Scanner ob=new Scanner(System.in);
     System.out.println("enter number"); 
     a=ob.nextInt();
     return a;
    }
 int b=accept();   
 }
interface Bc
{
  int d=20;   
}
class BB extends Abc implements Bc
{
     int c=b+d;
void display()
{
  System.out.println("addtion of"+b +" + "+d+" = "+c);
 }
} 
 class Interface
   {
     public static void main(String os[])
      {
        BB ob=new BB();
        ob.display();
       }
    } 