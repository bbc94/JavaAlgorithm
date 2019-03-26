import java.util.*;

public class CheckwhiteBlock {

	public static void main(String[] args) {
		int result =0;
		
		Scanner sc = new Scanner(System.in);
		char [][] currentChess = new char[8][8];
		for (int i = 0; i<currentChess.length;i++) {
			currentChess[i]=sc.next().toCharArray();
		}
		
		
		for(int i = 0; i<currentChess.length;i++) {
			for(int j=0;j<currentChess[i].length;j++) {
				if(i%2==0 && j%2==0) {
					if(currentChess[i][j] == 'F' ) {
						result++;
					}
				}
				else if(i%2==1 && j%2==1) {
					if(currentChess[i][j] == 'F' ) {
						result++;
					}
				}
			}
		}
		
		System.out.print(result);

	}

}
