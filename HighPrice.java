import java.util.*;

public class HighPrice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int [] price = new int [N+1];
		int [] rPrice = new int [N+1];
		for(int i=1; i<price.length;i++) {
			price[i] = sc.nextInt();
		}
		for(int i=1; i<price.length;i++) {
			for(int j=1; j<=i;j++) {
				rPrice[i]=Math.max(rPrice[i], rPrice[i-j]+price[j]);
			}
		}
		
		
		System.out.print(rPrice[N]);
		
		

	}

}
