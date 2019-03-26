import java.util.*;
public class Upstair {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int step = sc.nextInt();
		
		int[]score = new int [step+1];
		int[]sum = new int [step+1];
		
		for (int i =1 ; i<=step;i++) {
			score[i] = sc.nextInt();
		}
		sum[1]=score[1];
		sum[2]=score[1]+score[2];
		for (int i =3 ; i<= step;i++) {
			sum[i] = Math.max(sum[i-2]+score[i], sum[i-3]+score[i-1]+score[i]);
			System.out.print(sum[i]);
		}
		
	}

}
