package homework.middle0327;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	List<String> nameList = new ArrayList<String>();
	List<Integer> ScoreList = new ArrayList<Integer>();
	  for(int i =0 ; i<4; i++) {
	   nameList.add(sc.next());
	   ScoreList.add(sc.nextInt());
	  }
	Map< Integer,String> maptest = new HashMap<Integer,String>();
	
	maptest.put(ScoreList.get(0),nameList.get(0));
	maptest.put(ScoreList.get(1),nameList.get(1));
	maptest.put(ScoreList.get(2),nameList.get(2));
	maptest.put(ScoreList.get(3),nameList.get(3));

	
	List<Integer> mapkey = new ArrayList<>(maptest.keySet());
	Collections.reverse(mapkey);
	for (Integer nKey : (maptest).keySet())
	{
		System.out.println(maptest.get(nKey));
	}
	}
}
