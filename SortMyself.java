import java.util.Arrays;


public class SortMyself {
	static String[] solution(String[] strings, int n) {
	      String[] answer = new String [strings.length];
	      char [] referance = new char [strings.length];
	      for (int i = 0; i < referance.length;i++) {
	    	  referance[i] = strings[i].charAt(n);
	      }
	      Arrays.sort(referance);
	      Arrays.sort(strings);
	      for (int i =0; i<answer.length;i++) {
	    	  for(int j =0 ; j<strings.length;j++) {
	    		  if(referance[i]==strings[j].charAt(n)) {
	    			  answer[i] = strings[j];
	    			  strings[j] = "123";
	    			  System.out.println(referance[i]+ " " +answer[i]);
	    			  break;
	    		  }
	    	  }
	      }	      
	      return answer;
	  }
	public static void main(String[] args) {
		String ex1[] = {"abzcd","cdzab","abzfg","abzaa","abzbb","bbzaa"};
		System.out.print(solution(ex1,2));

	}

}
