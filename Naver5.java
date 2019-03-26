import java.util.*;
public class Naver5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int C = sc.nextInt();
		int B = sc.nextInt();
		int time=0;
		while(C<200000) {
			C += time;
			BrownPlus(B, time, C);
			time++;			
		}
		

	}
	static int BrownPlus(int B,int T, int C) {
		int count=0;
		while(count <= T) {
			BrownPlus(B+1,T,C);
			BrownPlus(B-1,T,C);
			BrownPlus(B*1,T,C);
			if(count==T) {
				
				
			}
			
			count++;
		}
		
		return T;
	}
}
