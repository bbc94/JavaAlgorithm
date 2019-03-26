import java.util.*;

public class Picnic {
	static int count =0;
	static int result =0;
	static boolean[][] relation =new boolean[10][10];
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int loop = sc.nextInt();
		int n = sc.nextInt();
		int m = sc.nextInt();
		boolean[] friends =new boolean[n];
		
		for (int i = 0; i<m;i++) {
			relation[sc.nextInt()][sc.nextInt()]=true;
		}
		System.out.print(cal(friends));
	}
	static int cal(boolean[] friends) {
		int firstFree = -1;
		for (int i =0; i<friends.length;i++) {
			if(!friends[i]) {
				firstFree = i;
				break;
			}
		}
		if(firstFree==-1) {
			return 1;
		}
		int result =0;
		for(int i = firstFree+1;i<friends.length;++i) {
			if(!friends[i] && relation[firstFree][i]) {
				friends[firstFree] = friends[i] = true;
				result += cal(friends);
				friends[firstFree] = friends[i] = false;
			}
		}
		return result;
		
	}

}
