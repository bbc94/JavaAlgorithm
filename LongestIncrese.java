import java.util.*;
public class LongestIncrese {
	public static void main(String [] args) {
		Scanner sc = new Scanner (System.in);
		int len = sc.nextInt();
		int [] num = new int [len];
		int [] cal = new int [len];
		for (int i =0; i<len;i++) {
			num[i] = sc.nextInt();
		}
		int max=0;
		for (int i =0; i<len;i++) {
			int count=0;
			for (int j=i;j>=0;j--) {
				if(num[i]>num[j]) {
					if(count<cal[j]) {
						count = cal[j];
					}
				}
			}
			cal[i]= count+1;
			if(max<cal[i]) {
				max=cal[i];
			}
		}
		System.out.print(max);
	}
}
