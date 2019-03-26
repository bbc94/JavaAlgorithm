import java.util.*;
public class FindBrother {
		static int count =0;
		static int [] visited = new int [1000001];
	public static void main (String [] args) {
		Scanner sc = new Scanner (System.in);
		int M =sc.nextInt();
		int N =sc.nextInt();
		bfs(M,N);
	}
	public static void bfs(int M, int N) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(M);
		visited[M] =1;
		
		while(!q.isEmpty()) {
			N=q.poll();
			
			if(M==N) {
				break;
			}
			if(M+1 <= 100000 && visited[M+1] == 0) {
				q.add(M+1);
				visited[M+1] = visited[M]+1;
			}
			if(M-1 >= 0 && visited[M-1] == 0) {
				q.add(M-1);
				visited[M-1] = visited[M]+1;
			}
			if(M*2 <= 100000 && visited[M*2] == 0) {
				q.add(M*2);
				visited[M*2] = visited[M]+1;
			}
		}
		System.out.print(visited[N]-1);
		
	}

}
