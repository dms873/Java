package java2;

import java.util.Arrays;
import java.util.Random;

public class ImportExam {
	// java.lang
	public double piExam() {
		double d = Math.PI;
		return d;
	}
	
	// java.util Random class
	public int radomExam(int ran) {
		Random r = new Random();
		int i = r.nextInt(ran);
		return i;
	}
	
	// java.util Arrays class sort ¸Þ¼Òµå
	public String sortExam() {
		int[] arr = {1,8,3,2,6,7,0};
		Arrays.sort(arr);
		return Arrays.toString(arr);
	}
}
