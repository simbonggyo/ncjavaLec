package chat37_generic;

import java.util.ArrayList;
import java.util.List;

public class _04_genericEx01 {

	public static void main(String[] args) {

		List<Integer> intlist = new ArrayList<Integer>();
		for(int i = 0; i<10; i++) {
			intlist.add(i+1);
		}
		System.out.println(genEven(intlist));
		
		//Number상속 받는 T
		//리턴타입 List<T> getEven(List<T>list)
	}
	public static <T extends Number> List<T> genEven(List<T>list){
		
		List<T> numlist = new ArrayList<T>();
	
		for(T t : list) {
			if(t.intValue()%2 ==0) {
			numlist.add(t);
			}
		}
		return numlist;
	}

}
