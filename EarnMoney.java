import java.util.*;
public class EarnMoney {
	static int min =0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int loop = sc.nextInt();
		
		int[] days = new int [loop+2];
		int[] payments = new int [loop+2];
		int[] paydays = new int [loop+2];
		for (int i = 0; i<loop; i++) {
			days [i] = sc.nextInt();
			payments [i] = sc.nextInt();
		}
		
		int max = 0;
		for (int i=0;i<loop;i++) {
			paydays[i] = Math.max(max, paydays[i]);
			if(i+days[i] <loop+1) {
				paydays[i] = Math.max(paydays[i+days[i]],payments[i]+paydays[i]); 
			}
			if(max<paydays[i]) {
				max = paydays[i];
			}
			
			
		}
		System.out.print(max);

	}

}
