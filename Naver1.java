import java.util.Scanner;
import java.math.*;


public class Naver1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = (int) Math.sqrt(a);
        
        for (int i = b;i>0;i--) {
        	if(a%b==0) {
        		int c = a/b;
        		System.out.print(c-b);
        	}
        	
        }
    }
}