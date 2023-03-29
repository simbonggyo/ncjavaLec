package homework.middle0327;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q2 {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<String,Integer>();
		int [] intarr = {1,2,3,4,5};
		int cnt = 0;
		for(int i =0; i<intarr.length; i++)
		{
			for(int j=0; j<intarr.length;j++)
			{
				if(!(i==j)) {
				if(i+j == intarr[i]) {
					cnt++;
					Map<Integer, Integer> map2  = new HashMap<Integer, Integer>();
					map2.put(intarr[i],i);
					map.put("0", map2.get(0));
					map.put("1", map2.get(1));
					map.put("2", map2.get(2));
					map.put("3", map2.get(3));
					map.put("4", map2.get(4));
					while(map.values().remove(null));
					System.out.println(map);
				}
				}
			}
		}
	
	}

}
