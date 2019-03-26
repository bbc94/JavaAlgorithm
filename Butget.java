import java.util.*;
public class Butget {
	
	static int solution (int[] d, int budget) {
	      int answer = 0;
	      Arrays.sort(d);
	      int sum = 0;
	      for (int i = 0; i < d.length; i++) {
	    	  sum += d[i];
	    	  if (sum > budget) {
	    		  return i;
	    	  }else if (sum == budget) {
	    		  return i+1;
	    	  }
	    	  
	      }
	      return d.length;
	  
	}

	public static void main(String[] args) {
		int [] ex = {2,2,3,3,3};	
		
		System.out.print(solution(ex,100));

	}

}
