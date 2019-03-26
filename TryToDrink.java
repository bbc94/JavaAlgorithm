import java.util.*;

public class TryToDrink {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cup = sc.nextInt();
		
		int [] amount = new int [cup+1];
		int [] drink = new int [cup+1];
		for (int i = 1; i<= cup;i++) {
			amount [i] = sc. nextInt();
		}
		drink[1] = amount[1];
		if (cup>1) {
			drink[2] = amount[1]+amount[2];
		}
		if (cup>2) {
			for (int i=3;i<=cup;i++) {
				drink[i] = Math.max(drink[i-2]+amount[i], drink[i-3]+amount[i-1]+amount[i]);
				drink[i] = Math.max(drink[i],drink[i-1]);
				System.out.println(drink[i]);
			}
		}
		System.out.println(Math.max(drink[cup],drink[cup-1]));
	}

}
