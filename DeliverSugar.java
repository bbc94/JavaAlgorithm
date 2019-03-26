import java.util.*;

public class DeliverSugar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int N = sc.nextInt();
		System.out.print(cal(N));
	}
	static int cal(int N) {
		int M3 = N/3;
		int M5 = N/5;
		int result = 0;
		for (int i =0 ; i <= M3; i++ ) {
			for(int j=M5;j>=0;j--) {
				result = (i*3)+(j*5);
				if(result == N) {
					return (i+j);
				}
			}
		}
		
		
		
		return -1;
	}

}




// 3X + 5Y = N