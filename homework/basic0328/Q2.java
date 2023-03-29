package homework.basic0328;

import java.util.ArrayList;
import java.util.List;


public class Q2 {
	
	 public static <T> String add(T t1, T t2) {
	  
		List<String> list = new ArrayList<String>();
		 list.add(t1.toString());
		 list.add(t2.toString());
		 String sum = list.get(0)+list.get(1);
		return sum;
	 
	 }
	 

}
