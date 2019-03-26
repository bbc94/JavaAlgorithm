import java.util.*;
public class BeeHouse {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int a =house(num);
		System.out.print(a);

	}

	
	static int house(int num) {
		
		int start = 1;
		int count = 1;
		int end=1;
		while (start>num || num>end) {
			start = end +1;
			end = end + (6*count);
			count++;
		}
		
		
		return count;
	}
}
