import java.util.*;
public class Zsearching {
	static int rows;
	static int cols;
	static int result = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int size = (int) Math.pow(2, num);
		 rows = sc.nextInt();
		 cols = sc.nextInt();
		 sc.close();
		 search(0,0,size);
				
	}
	static void search(int row,int col, int size) {
		if (size == 1) {
			if (row == rows && col == cols) {
				System.out.println(result);
			}	
			result++;
			return;
		}
		int s= size/2;
		search(row,col,s);
		search(row,col+s,s);
		search(row+s,col,s);
		search(row+s,col+s,s);
	}
}
