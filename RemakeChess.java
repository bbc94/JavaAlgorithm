import java.util.*;
public class RemakeChess {
	static char[][] black = new char [8][8];
	static char[][] white = new char [8][8];
	static String wb = "WBWBWBWB";
	static String bw = "BWBWBWBW";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int rows = sc.nextInt();
		int cols = sc.nextInt();
		
		char [][] map = new char [rows][cols];
		for(int i =0; i<rows;i++) {
			map[i]=sc.next().toCharArray();
		}

		for(int i=0;i<black.length;i++) {
			if(i%2==0) {
				black[i] = bw.toCharArray();
				white[i] = wb.toCharArray();
			}else {
				black[i] = wb.toCharArray();
				white[i] = bw.toCharArray();
			}			
		}
		int min =64;

		for (int right = 0; right<cols-8+1;right++) {
			for (int down =0; down<rows-8+1; down++) {
				int countBlack =0;
				int countWhite =0;
				for(int i = 0; i < black.length;i++ ) {
					for (int j=0; j<black[i].length;j++) {
						if (map[i+down][j+right] != black[i][j]) {
							++countBlack;
						}else if(map[i+down][j+right] != white[i][j]) {
							++countWhite;}}
				}
				if (countBlack>countWhite) {
					if (countWhite<=min) {
						min=countWhite;
					}
				}else {
					if (countBlack<=min) {
						min=countBlack;
					}
				}
			}
		}	
		System.out.println(min);
	}
}
