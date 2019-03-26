import java.util.Scanner;

public class PlusCycle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count = 0 ;
		int tmpNum = num;
		int tmp=100;
		while (tmp != num) {			
			int num1 =tmpNum%10;
			int num2 =tmpNum/10;
			tmp = (num1*10)+((num1+num2)%10);
			count++;
			tmpNum=tmp;
		}
		System.out.print(count);
		

	}

}
