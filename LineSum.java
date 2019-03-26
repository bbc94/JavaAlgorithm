import java.util.*;

public class LineSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int loop = sc.nextInt();
		int [] line = new int [loop];
		for(int i=0;i<loop;i++) {
			line[i] = sc.nextInt();
		}
		Arrays.sort(line);
		int [] sum1 = new int [loop];
		int total=0;
		int sum = 0;
		for(int i=0;i<loop;i++) {
			sum += line[i];
			sum1[i]=sum;
			total +=sum;
			
		}
		System.out.print(total);
		

	}

}
