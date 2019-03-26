import java.util.ArrayList;

public class SelfNumber {

	public static void main(String[] args) {
		
		ArrayList <Integer> selfList = new <Integer> ArrayList();
		ArrayList <Integer> resultList = new <Integer> ArrayList();
		for (int i =1;i<10000;i++) {
			resultList.add(i);
			selfList.add(SN(i));
		}
		resultList.removeAll(selfList);
		for(int i=0; i<resultList.size();i++) {
			System.out.print(resultList.get(i));
		}
	}
	static int SN(int num) {
		int result=num;
		int n=num;
		while(n>0) {
			result += n%10;
			n /=10;
		}
		
		
		return result;
	}
}
