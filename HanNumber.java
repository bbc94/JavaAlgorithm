import java.util.*;
import java.math.*;
public class HanNumber {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		if (num<100) {
			System.out.print(num);
		}
		else if(num ==1000) {
			System.out.println(144);
		}
		else {
			int count =99;
			for (int i=100;i<=num;i++) {
				ArrayList <Integer> numb= new <Integer> ArrayList();
				int number=i;
				while(number>0) {		
					numb.add(number%10);					
					number=number/10;
				}
				if ((numb.get(0)-numb.get(1))==(numb.get(1)-numb.get(2))) {
					count++;
				}

			}
		System.out.println(count);
		}
	}
}
