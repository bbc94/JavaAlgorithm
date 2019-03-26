import java.util.*;

public class AnalogDial {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String input = sc.next();
		char [] arr = new char[input.length()];
		arr = input.toCharArray();
		
		HashMap hm = new HashMap<Character,Integer>();
		hm.put('A', 2);hm.put('B', 2);hm.put('C', 2);
		hm.put('D', 3);hm.put('E', 3);hm.put('F', 3);
		hm.put('G', 4);hm.put('H', 4);hm.put('I', 4);
		hm.put('J', 5);hm.put('K', 5);hm.put('L', 5);
		hm.put('M', 6);hm.put('N', 6);hm.put('O', 6);
		hm.put('P', 7);hm.put('Q', 7);hm.put('R', 7);hm.put('S', 7);
		hm.put('T', 8);hm.put('U', 8);hm.put('V', 8);
		hm.put('W', 9);hm.put('X', 9);hm.put('Y', 9);hm.put('Z', 9);
		
		int sum=0;
		for(int i =0 ; i<input.length();i++) {
			sum += ((int)hm.get(arr[i])+1);
		}
		System.out.print(sum);
		
		

	}

}
