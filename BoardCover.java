import java.util.*;

public class BoardCover {		
		static int cover[][][] = 
			{{{0, 0}, {1, 0}, {0, 1}}, //¦£
			{{0, 0}, {0, 1}, {1, 1}}, // ¦¤
			{{0, 0}, {1, 0}, {1, 1}}, //¦¦
			{{0, 0}, {1, 0}, {1, -1}} // ¦¥
			};
		
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		int [][] board = new int[row][col] ;
		String tmp;
		sc.nextLine();
		for(int i =0; i < row; i++) {
			tmp = sc.nextLine().replace('#', '1').replace('.', '0');
			for (int j = 0;j<col;j++) {
				board[i][j]=tmp.charAt(j);
			}
		}
		int count = 0;
		for (int i =0; i < row; i++) {
			for (int j=0;j<col;j++) {
				if (board[i][j]=='.') {
					count+=1;
				}
			}
		}
		if ((count % 3)!=0) {
			System.out.print(-1);
		}

	}
	static int cal () {
		
		
		return -1;
	}

}
