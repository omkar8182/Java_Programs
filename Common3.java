import java.util.ArrayList;
import java.util.List;
public class Common3 {

	public static void main(String[] args) {
		int a[]= {1,3,4,5};
		int b[]= {2,3,4,7,8};
		int c[]= {1,3,4,9};
	List<Integer> d=new ArrayList<>();
      int i=0,j=0,k=0,count=0;
      while(i<4 && j<4 && k<4)
      {
    	  if(a[i]==b[j] && b[j]==c[k])
    	  {
    	    d.add(a[i]);
          i++;j++;k++;
         	  }
    	  else if(a[i]<b[j])
    	  {
    		  i++;
    	  }
    	  else if(b[j]<c[k]) 
    		  { j++;}
    	  else 
    		  {k++;}
      }
           for(int s=0;s<d.size();s++)
           {
        	   System.out.println(d.get(s));
           }
      
	}

}

