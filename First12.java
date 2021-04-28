class First12
{
  public static void main(String srg[])
  {
    
   dog a=new dog();
   System.out.println("legs"+a.legs); 
    fun(a);
    System.out.println("legs are"+a.legs);
    }

static void fun(dog a)
{
 a.legs=5;
}
}
class dog
{
 int legs=4;
 
  }