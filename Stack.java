import java.util.Scanner;
public class Stack{
                 static int top=-1,n=0;
        static int a[]=new int[5];   
        static boolean isEmpty(){
                if(top==-1){return true;}
                else{return false;}
                            }
              static boolean isFull(){
                             if(n==4){return true;}
                             else{return false;}
                        
                                    }
            static void push(){
               if(!isFull()){
                System.out.println("enter element");
                  Scanner ob=new Scanner(System.in);
                     a[n++]=ob.nextInt();top++;      
                      System.out.println("succefully push");
                       }else System.out.println("Stack is overflow ");
                    }
               static void pop(){
           if(!isEmpty()){         
               int x=a[n--]; top--;                               
                System.out.println("NUmber is pop out"+x);
                            }else {System.out.println("Stack is empty");          }  }  
          static void display(){
                 if(!isEmpty()){ 
                    for(int i=0;i<n;i++){
                     System.out.println(a[i]);}
                }else {System.out.println("Stack is empty");}
          }          
  
           public static void main(String str[]){
       
       while(true){
                   System.out.println("Enter you choice \n1.push\n2.pop\n3.display");
             Scanner ob=new Scanner(System.in);
              int ch=ob.nextInt();
     
           
              switch(ch){
                        case 1:  push();
                                  break;
                          case 2: pop();
                                     break;
                           case 3:
                                  display();break;
                             case 4:
                                     
                                       break;
                          default: System.out.println("INvalid choice");
                          }
                }
     }
 }               