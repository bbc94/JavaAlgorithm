import java.util.*;
public class StreetRGB {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int sum [] = new int [3];
		int houses = sc.nextInt();
		int paint [] [] = new int [houses][3];
		for (int i = 0; i<houses;i++) {
			for(int j=0;j<3;j++) {
				paint[i][j] = sc.nextInt();
			}
		}
		
	}

}
