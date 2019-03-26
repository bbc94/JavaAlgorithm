import java.util.*;
public class Boggle {
	static int dx[] = {-1,-1,-1,1,1,1,0,0};
	static int dy[] = {-1,0,1,-1,0,1,-1,1};
	static char [] [] input = new char [5][5];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for (int i=0;i<5;i++) {
			input[i] = sc.next().toCharArray();
		}
		
		String words = sc.next();
		System.out.print(hasWord(0, 0, words));

	}
	static boolean hasWord(int x ,int y, String wo) {
		if (x >5 || y >5 || x<0 || y<0) {
			return false;
		}
		if (input[x][y] != wo.charAt(0)) {
			return false;
		}
		if (wo.length()==1) {
			return true;
		}
		for (int i =0; i<dx.length;i++) {
			int nextX = x+dx[i];
			int nextY = x+dy[i];
			System.out.print(wo.substring(1));
			if (hasWord(nextX, nextY, wo.substring(1))) {
				return true;
			}
		}

		return false;
	}
}
