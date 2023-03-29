package homework.basic0328;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Q5 {

	public static <T extends Number> int getMin(List<T> tList) {

		
		int min = (int) tList.get(0);
		for(int i = 1; i < tList.size(); i++) {
			if((int)tList.get(i) < min) {
				min = (int)tList.get(i);
			}
		}
		
		return min;
	}
	}

