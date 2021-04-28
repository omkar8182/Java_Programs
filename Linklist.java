import java.util.Scanner;
 class node
     {
      int data;
       node next;
      } 
 class Linklist
  {
   
     node root;
   void add()
      {
        Scanner ob=new Scanner(System.in); 
       node temp=new node();
        System.out.println("enter data");
      temp.data=ob.nextInt();
       temp.next=null;
       if(root==null)
       {
        root=temp;
       }
       else
       {
         while(root!=null)
           {
              root=root.next;
           }
             root=temp;
        }
   }
void display()
  {
     
        node p=new node();
      p=root;
     while(p.next!=null)
       {
       System.out.println("data="+p.data);
        p=p.next;     
         }
  }
 public static void main(String std[])
     {
        Linklist ob2=new Linklist();
       Scanner ob=new Scanner(System.in);
       System.out.println("Enter how many times repeat");
        int t=ob.nextInt();
    while(t!=0)
        {
           System.out.println("enter your choice\n1.add\n2.display");
        int ch=ob.nextInt();
         switch(ch)
           {
              case 1:
                       ob2.add();
                           break;
              case 2: 
                       ob2.display();
                        break;
             default:
                          System.out.println("Invalid choice");
            }       
        t--;
         }
 }
  
}
 