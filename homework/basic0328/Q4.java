package homework.basic0328;

import java.util.List;

public class Q4 {

	public void printArr(List<?> list) {
	
		for(int i = 1; i<list.size(); i++) {
			if(i%3==0) {
				System.out.println(list.get(i));
			}
		}
	}
}
