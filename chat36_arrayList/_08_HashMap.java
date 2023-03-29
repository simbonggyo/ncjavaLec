package chat36_arrayList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.swing.text.html.parser.Entity;

public class _08_HashMap {

	public static void main(String[] args) {

		Map<String, String> carMap = new HashMap<String,String>();
		//key,value의 쌍 저장
		carMap.put("compony", "현대");
		carMap.put("model", "소나타");
		carMap.put("color", "검정색");
		carMap.put("price", "4000");
         System.out.println(carMap);
          
       
          Set<Entry<String, String>> carSet =
        		  carMap.entrySet();
          
          
          System.out.println(carSet);
          
          Iterator<Entry<String, String>> it = 
					carSet.iterator();
	
          while(it.hasNext()) {
        		Entry<String, String> ent = 
						it.next();
          System.out.println(ent.getKey());
         System.out.println(ent.getValue());

          }
          //value의 형태를 Object로 지정하면 
          //어떤 형태의 데이토도 받을 수 있다.
          Map<String, Object> objMap = 
        		  new HashMap<String,Object>();
          List<Car> carList = 
        		  new ArrayList<Car>();
          for(int i = 0; i<5; i++) {
        	  Car car = new Car("현대","소나타","검정",3000);
        	  carList.add(car);
        	  
          }
	}

}
