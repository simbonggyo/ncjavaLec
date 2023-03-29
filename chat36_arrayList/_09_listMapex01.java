package chat36_arrayList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class _09_listMapex01 {

	public static void main(String[] args) {

		List<Car> carList = new ArrayList<>();
		carList.add(new Car("현대","제네시스","흰색",5000));
		carList.add(new Car("기아","모하비","흰색",5000));
		carList.add(new Car("쉐보레", "카마로", "노란색", 5000));
		carList.add(new Car("벤츠", "E시리즈", "흰색", 6000));
		carList.add(new Car("BMW", "7시리즈", "파란색", 10000));
		
		
		//caList를 List<Map<String,Object>>로 변환
	   List<Map<String, Object>> Carmap = new ArrayList<>();
	   
	   for (Car ob: carList) {
         Map<String,Object>map = new HashMap<String,Object>();
         map.put("compony", ob.company);
         map.put("model", ob.model);
         map.put("color",ob.color);
         map.put("price", ob.price);
         Carmap.add(map);
       }
	   for(int i =0; i<Carmap.size(); i++) {
		   System.out.println(Carmap.get(i));
	   }

   }

}
