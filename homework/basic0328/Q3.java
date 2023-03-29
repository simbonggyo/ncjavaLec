package homework.basic0328;

import java.util.List;

public class Q3 {

	
	public static Integer add(List<?> list) {
		
		int sum = 0;
		for(Object i : list) {
			sum += (int)i;
		}
		return sum;
	}
}
