package chat36_arrayList;

import java.util.ArrayList;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class _07_iterator {

	public static void main(String[] args) {

//		Map<String, String> map;
		List<Car> cList = new ArrayList<>();
		Car car = 
				new Car("현대","제네시스","은색",500);
		cList.add(car);
		car = 
				new Car("현대","아반떼","흰색",3000);
		cList.add(car);
		car = 
				new Car("현대","소나타","검정색",4000);
		cList.add(car);
		car = 
				new Car("기아","ev6","파란색",500);
		cList.add(car);
		car = 
				new Car("기아","모하비","빨간색",5000);
		cList.add(car);
		System.out.println(cList.size());
		//Iterator로 요소들 받아오기
		Iterator<Car> it = cList.iterator();
		
		while(it.hasNext()) {
		Car c = (Car)it.next();
		c.carInfo();
		if(c.company.equals("현대"))
		   it.remove();
		}
		System.out.println(cList.size());

		ListIterator<Car> lit = cList.listIterator();
		lit.next();
		while(lit.hasNext()) {
			if(lit.nextIndex()>=1) {
				lit.previous();
				Car c= new Car("쉐보레","카마로","노란색",4000);
				lit.set(c);
			}
		}
		for(Car c : cList) {
			c.carInfo();
		}
	}

}
