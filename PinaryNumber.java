import java.util.*;

public class PinaryNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long []num = new long [n+1];
		num [1]= 1;
		if(n >1) {
			num [2]= 1;
		}
		if(n >2) {
			for (int i =3 ; i<=n; i++) {
				num [i] = num [i-1]+ num [i-2];
			}
		}
		System.out.print(num[n]);
	}

}
