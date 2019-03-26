import java.util.ArrayList;

public class ThreeMonthAverage {

	public static void main(String[] args) {
		int [] Person1 = { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		int month = 3;
		
		double [] result = calAverage(Person1, month);
		for (int i = 0; i<result.length;i++) {
			System.out.println(result[i]);
		}

	}
	static double [] calAverage(int [] person,int month) {
		ArrayList <Double>result = new ArrayList<Double>();
		double [] results = new double [person.length-month+1];
		for (int i = (month-1); i < person.length;i++) {
			double ave = (person[i-2]+person[i-1]+person[i])/month;
			result.add(ave);
		}
		int i = 0;
		for (double tmp : result) {
			results[i++] = tmp;
		}
		
		
		return results;
	}

}
