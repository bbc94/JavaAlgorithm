import java.util.*;

public class SortingAge {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int loop = sc.nextInt();
		int [] age = new int [loop];
		int [] sortedAge = new int [loop];
		String [] name = new String [loop];
		String [][] sortedPerson = new String [loop][2];
		
		for (int i =0;i<loop;i++) {
			age[i]=sc.nextInt();
			sortedAge[i]=age[i];
			name[i]=sc.next();
		}
		Arrays.sort(sortedAge);
		for (int i =0;i<loop;i++) {
			for (int j =0;j<loop;j++) {
				if (sortedAge[i]==age[j]) {
					sortedPerson[i][0]=String.valueOf(age[j]);
					sortedPerson[i][1]=name[j];
					age[j]=-1;
					name[j]="-1";
					break;
				}
			}
			
		}
		for (int i =0;i<loop;i++) {
			System.out.print(sortedPerson[i][0]);
			System.out.print(sortedPerson[i][1]);
		}
		

	}

}
