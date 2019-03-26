import java.util.*;
public class ItsReal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int loop = sc.nextInt();
		double result[] =new double [loop]; 
		
		for(int i = 0; i<loop;i++) {
			int person = sc.nextInt();
			int [] score = new int [person];
			int sum = 0;
			for (int j =0; j<person;j++) {
				score[j] = sc.nextInt();
				sum += score[j];
			}
			int aver = sum/person;
			System.out.println(aver);
			int count = 0;
			for (int j =0; j<person;j++) {
				if(score[j] >aver) {
					count++;
					System.out.println(count);
				}
			}
			double real = (double)(person);
			System.out.println(count/person);
			result[i] = real;
		}                              
		
		
		for (int i =0;i<loop;i++) {
			System.out.println(String.format("%.3f", result[i]));
		}
		
	}

}
