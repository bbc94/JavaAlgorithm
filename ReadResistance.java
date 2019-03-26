import java.util.*;
import java.math.*;
public class ReadResistance {

	public static void main(String[] args) {
		
		String [] colorMap = {"black","brown","red","orange","yellow","green","blue","violet","grey","white"};
		Scanner sc = new Scanner(System.in);
		String [] colorList = new String[3];
		int [] index = new int[3];
		for(int i =0 ; i < colorList.length; i++) {
			colorList[i]=sc.next();
		}
		for(int i =0 ; i < colorMap.length; i++) {
			for(int j = 0 ; j<colorList.length;j++) {
				if (colorMap[i].equals(colorList[j])) {
					index[j]=i;
				}
			}
		}
		int ten = (int) Math.pow(10, index[2]);
		long result = ((10*index[0])+(index[1]))*(ten);
		System.out.println(result);
	}

}
