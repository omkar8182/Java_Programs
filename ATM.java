import java.util.Scanner;
class ATM{
public static void main(String str[]){

 Scanner ob=new Scanner(System.in);
//System.out.println("enter amount");
 double n=ob.nextDouble();
//System.out.println("enter amoutn");
double Amount=ob.nextDouble(); 
 if(n%5==0 && n<Amount-0.5){
 	double rem_bal=Amount-n-0.50;
         System.out.println(String.format("%.2f",Amount));
 	}
 	System.out.println(String.format("%.2f",Amount));
    }
 }