import java.util.Scanner;
class ReverseString
{
 public static void main(String arg[]){
System.out.println("enter string you want"); 
 Scanner ob=new Scanner(System.in);  
 String string=ob.nextLine();
 System.out.println("before="+string);
  string=Reverse(string);
  System.out.println("after ="+string);
     }

static String Reverse(String s)
 {
    int i;
    String ans="";
     i=s.length()-1; //intilization at the end of string for reverse
   while(i>=0)        //main while loop
   {
      while(s.charAt(i)==' ')i--;  //while loop  for if spaces than increase i ;
      
      int j=i;
    
   if(i<0)break;                        //if for stop at less than 0  index
                   
 while(i>=0 && s.charAt(i)!=' ')i--;        //while loop for reduce 'i' value if not                                               //equal space
    
      if(ans.isEmpty())
       {
          ans=ans.concat(s.substring(i+1,j+1));
          }
                 
          else{
                  ans=ans.concat(' '+s.substring(i+1,j+1));
                }
     }   //close main while loop;             
  
    return ans;
}               //close function here
}   