import java.util.*;
public class MusicStyle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] play = new int [8];
		for(int i =0; i<play.length;i++) {
			play[i] = sc.nextInt();
		}
		int[] ascending = {1,2,3,4,5,6,7,8};
		int[] descending = {8,7,6,5,4,3,2,1};
		int as = 0;
		int ds = 0;
		for (int i=0; i<play.length;i++) {

			if(play[i]==ascending[i]) {
				as++;
			}
			if(play[i]==descending[i]) {
				ds++;
			}
		}
		if(as==8) {
			System.out.print("ascending");
		}else if(ds == 8) {
			System.out.print("descending");
		}else {
			System.out.print("mixed");
		}
	}

}
