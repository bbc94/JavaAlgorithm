import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class SevenHobbit {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int [] hobbit = new int [9];
		for (int i =0; i<hobbit.length;i++) {
			hobbit[i]=sc.nextInt();
			sum += hobbit[i];
		}
		int remove1=0;
		int remove2=0;
		int findNum = sum-100;
		for (int i=0; i<hobbit.length-1;i++) {
			for (int j=i+1; j<hobbit.length;j++) {
				int tempSum = hobbit[i]+hobbit[j];
				if(tempSum==findNum) {
					remove1 = i;
					remove2 = j;
				}
			}
		}
		
		ArrayList<Integer> result = new <Integer> ArrayList();
		int [] realResult = new int [7];
		for (int i=0;i<hobbit.length;i++) {
			if(i == remove1) {
				
			}
			else if(i == remove2) {
				
			}
			else{
				result.add(hobbit[i]);
			}
		}
		result.sort(null);
		
		int size=0;

		for(Integer temp : result){

			realResult[size++] = temp;

			
		}
		for (int i = 0; i<7;i++) {
			System.out.println(realResult[i]);
		}
		
	}
}
