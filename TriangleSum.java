import java.util.*;

public class TriangleSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int hei = sc.nextInt();
		int [][] tri = new int [hei][hei];
		int [][] sum = new int [hei][hei];
		for (int i = 0 ; i<hei;i++) {
			for(int j = 0 ; j<=i;j++) {
				tri[i][j] = sc.nextInt();
			}
		}
		sum[0][0] = tri [0][0];
		for (int i = 1 ; i<hei;i++) {
			for(int j = 0 ; j<=i;j++) {
				if (j == 0) {
					sum[i][j] = tri[i][j]+sum[i-1][j];
				}
				if(j==i) {
					sum[i][j] = tri[i][j]+sum[i-1][j-1];
				}
				if (j !=0 && j!=i) {
					sum[i][j] =Math.max(tri[i][j]+sum[i-1][j-1],tri[i][j]+sum[i-1][j]); 
				}
			}
		}
		int max=sum[hei-1][0];
		for (int i = 0 ; i<hei;i++) {
			if (sum[hei-1][0] < sum[hei-1][i]) {
				max = sum[hei-1][i];
			}
		}
		System.out.print(max);
	}

}
