import java.util.*;
public class DownHill {
	
	static int dx[] = {1,0,0,-1};
	static int dy[] = {0,1,-1,0};
	static int [][] map;
	static int row;
	static int col;
	static int res;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		row = sc.nextInt();
		col = sc.nextInt();
		map = new int [row][col];

		for (int i =0; i<row;i++ ) {
			for(int j =0; j<col;j++ ) {
				map[i][j] = sc.nextInt();
			}
		}
		int a = cal(0,0);
		System.out.print(res);
		
	}
	
	static int cal (int x, int y) {
		if (x <0 || y <0 || x >= row || y >=col) {
			return 0;
		}
		if (x == row-1 && y == col-1) {
			res++;
		}
		
		for(int i =0; i<4;i++) {
			int nx = x+dx[i];
			int ny = y+dy[i];
			if (nx>=0 && ny>=0 && nx<row && ny<col) {
				if(map[x][y]>map[nx][ny]) {
					cal(nx,ny);
				}
			}
		}
		
		return 0;
	}

}
