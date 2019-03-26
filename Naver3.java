import java.util.*;

public class Naver3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int loop = sc.nextInt();
		String [][]table1 = new String [loop][3];
		String [][]table2 = new String [loop][3];
		
		for (int i =0; i<loop; i++) {
			for (int j=0;j<table1[i].length;j++) {
				table1[i][j] = sc.next();
			}
		}
		for (int i =0; i<loop; i++) {
			for (int j=0;j<table2[i].length;j++) {
				table2[i][j] = sc.next();
			}
		}
		int [] sorting = new int [loop];
		for (int i =1; i<loop; i++) {
			for (int j=1;j<loop;j++) {
				if(table1[j][0].equals(String.valueOf(i))) {
					sorting[i]=j;
				}
			}
		}
		System.out.println(table1[0][0]+" "+table1[0][1]+" "+table1[0][2]+" "+table2[0][1]+" "+table2[0][2]);		
		for (int i =1; i<loop; i++) {			
			for (int j =1; j<loop;j++) {
				if(table1[sorting[i]][0].equals(table2[j][0])) {
					System.out.print(table1[sorting[i]][0]+" "+table1[sorting[i]][1]+" "+table1[sorting[i]][2]+" "+table2[j][1]+" "+table2[j][2]);
					System.out.println();
				}
			}
		}
	}
}

