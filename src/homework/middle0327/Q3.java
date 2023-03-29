package homework.middle0327;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Q3 {
	List<String> name = new ArrayList<String>(); 
	List<String> Phonenum = new ArrayList<String>();
	
	int index = 0;
	
	public void insertPhoneInfo(String name, String number) {
		//이름과 번호를 배열에 저장
	
		List<Map<String, String>> Info = new ArrayList<Map<String,String>>();
		Map<String, String> map = new HashMap<String,String>();
		map.put(name, number);
		Info.add(map);
		index++;
	}

	//모든 PhoneInfo 출력
	public void printAllPhoneInfo() {
		for(int i = 0; i < name.size(); i++) {
			if(name.get(i) != null) {
				System.out.print("이름 : " + name.get(i) + ", 번호 : " +  Phonenum.get(i) + "\n");
			}
		}
	}
	
	//번호에 해당하는 이름과 번호 출력
	public void printPhoneInfo(int index) {
		if(name.get((index) - 1) != null) {
			System.out.print("이름 : " + name.get((index) - 1) + ", 번호 : " + Phonenum.get((index) - 1) + "\n");
		} else {
			System.out.println("해당 번호로 저장된 정보가 없습니다.");
		}
	}
}
