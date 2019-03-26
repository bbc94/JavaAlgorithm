import java.math.BigInteger;
import java.util.*;
public class KaingCalendar {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int loop = sc.nextInt();
		int [][] num = new int [loop][4];
		
		for(int i = 0; i< loop;i++) {
			for (int j = 0;j<4;j++) {
				num[i][j]=sc.nextInt();
			}
		}
		sc.close();
		for(int i = 0; i< loop;i++) {
			System.out.println(cal2(num[i][0],num[i][1],num[i][2],num[i][3]));
		}
		
	}
	static int cal2(int M, int N, int x,int y) {
		
		int gcd = BigInteger.valueOf(M).gcd(BigInteger.valueOf(N)).intValue();
		int lcm = (M*N)/gcd;
		int dotx =0;
		int doty =0;
		for (int i = x; i<lcm; i+=M) {
			dotx = (i-1)%M +1;
			doty = (i-1)%N +1;
			if (dotx ==x && doty ==y) {
				return i;
			}
		}		
		return -1;
	}
	
	
	
	//시간초과
	static long cal1 (int M,int N, int x,int y) {
		int dotx=0;
		int doty=0;
		long count =0;
		while(dotx<=M && doty<=N) {
			if(dotx == x && doty==y) {
				return count;
			}
			if(dotx==M && doty!=N) {
				dotx=0;
			}else if((dotx!=M && doty==N)) {
				doty=0;
			}
			dotx++;
			doty++;
			count++;
			System.out.println(dotx+" "+ doty);
			}		
		
		return -1;
	}
	

}
