import java.util.*;
public class Countwords {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String words = sc.nextLine().trim();
		String word[] = words.split(" ");
		
		if(words.isEmpty()) {
			System.out.print(0);
		}else {
			
			System.out.print(word.length);
		}
	}

}
