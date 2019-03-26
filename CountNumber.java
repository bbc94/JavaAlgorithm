import java.util.*;

public class CountNumber {
	static int [] counter = {0,0,0,0,0,0,0,0,0,0};
	static int position=1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int page = sc.nextInt();
		int start = 1;
		while(start<=page ) {
			while(start%10 !=0 && start<=page ) {
				cal(start,position);
				start++;
			}
			if (start>page) {
				break;
			}
			while(page%10!=9 && start<=page) {
				cal(page,position);
				page--;
			}
			start /= 10;
			page /= 10;
			
			for(int i =0;i<10;i++) {
				counter[i] += (page-start+1)*position;
			}
			position *= 10;
		}
		for (int i = 0; i<10;i++) {
			System.out.print(counter[i]+" ");
		}
		

		
	}
	public static void cal(int page,int position) {
		while(page>0) {
			counter[page%10]+=position;
			page = page/10;
		}
	}

}
