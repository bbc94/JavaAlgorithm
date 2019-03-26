import java.util.*;

public class Plus_1_2_3 {
			
	public static void main(String[] args) {
		int [] result = new int [12];
		result[0]=1;
		result[1]=2;
		result[2]=4;
		
		for (int i =3;i<12;i++) {
			result[i] = result[i-1]+result[i-2]+result[i-3];
		}
		Scanner sc = new Scanner(System.in);
		int loop=sc.nextInt();
		int num [] =new int [loop];
		for (int i = 0; i<loop;i++) {
			num[i]=sc.nextInt();
		}
		for (int i = 0; i<loop;i++) {
			System.out.println(result[num[i]-1]);
		}	

	}

}

// 1,2,4,7
// '1','1+1,2','1+1+1,1+2,2+1,3','1+1+1+1,1+1+2,1+2+1,2+1+1,2+2,1+3,3+1'