import java.util.*;
public class Naver4 {
	public static void main(String [] ares) {
		Scanner sc = new Scanner(System.in);
		int buildings = sc.nextInt();
		int leftWire = 0;
		int rightWire =0;
		
		int [] heights = new int [buildings];
		for (int i =0 ; i<heights.length;i++) {
			heights[i] = sc.nextInt();
		}
		for (int i = 0; i < heights.length-1;i++) {
			for (int j = i+1; j< heights.length;j++) {
				if(heights[i]<heights[j]) {
					int  length = j-i;
					if(leftWire<length) {
						leftWire=length;
					}
					break;
				}
			}
		}
		for (int i = heights.length-1; i >= 1;i--) {
			for (int j = i-1; j>=0 ;j--) {
				if(heights[i]<heights[j]) {
					int  length = i-j;
					if(rightWire<length) {
						rightWire=length;
					}
					break;
				}
			}
		}
		System.out.print(Math.max(rightWire, leftWire));
		
		
	}
}
