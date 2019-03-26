import java.util.*;
public class GetCandy {
	
	static int dx[] = {1,0,1};
	static int dy[] = {0,1,1};
	static int N;
	static int M;
	static int [][] Map;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		Map = new int[N+1][M+1];
		int [][] dp =new int[N+1][M+1];
		
		for(int i = 1; i<N+1;i++) {
			for (int j =1;j<M+1;j++) {
				Map[i][j] = sc.nextInt();
			}
		}
		dp[1][1]=Map[1][1];
		for(int i = 1; i<N+1;i++) {
			for (int j =1;j<M+1;j++) {
				dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1])+Map[i][j];
			}
		}
		System.out.print(dp[N][M]);
		
		
	}
}
