import java.util.*;

public class DIstributeRoom {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int loop = sc.nextInt();
		int [][] hotels= new int [loop][3];
		for(int i = 0; i< loop;i++) {
			hotels[i][0] = sc.nextInt();
			hotels[i][1] = sc.nextInt();
			hotels[i][2] = sc.nextInt();
		}
		for(int i = 0; i< loop;i++) {
			System.out.print(cal(hotels[i][0],hotels[i][1],hotels[i][2]));
		}
	}
	static int cal(int H,int W,int N) {
		int [][]Hotel = new int [H+1][W+1];
		int num = 1;
		int floor=0;
		int number=0;
		for (int i = 1;i<=W;i++) {
			for (int j =1 ; j<=H;j++) {
				Hotel[j][i] = num;
				if (num == N) {
					floor = j;
					number = i;;
					return 100*j+i;
					
					
				}
				num++;
			}
		}
		return 0;
		}
	}
