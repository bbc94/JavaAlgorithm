import java.util.*;

public class AlmostMultiplied {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] numberList = new int [5];
		for (int i =0; i<5;i++) {
			numberList[i] = sc.nextInt();
		}
		Arrays.sort(numberList);
		
		int max = numberList[0]*numberList[1]*numberList[2];
		int start = 1;
		int mid = max/2;
		int result = 0;
		while(mid > 1 || mid !=max) {
			int count=0;
			for (int i =0; i<5;i++) {
				if(mid%numberList[i]==0) {
					count++;
				}
				if(count>2) {
					result=mid;
					mid /=2;
				}else {
					mid = (mid+max)/2;
				}
			}
		}
		System.out.println(result);
	}

}
