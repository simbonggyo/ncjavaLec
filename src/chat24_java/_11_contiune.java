package chat24_java;

import java.util.ArrayList;

public class _11_contiune {

	public static void main(String[] args) {

		for(int i = 0; i < 10; i++) {
			if(i<5) {
				continue; //다음조건으로 넘어간다. 0~4까지는 출력되지않고 증감식으로 돌아가서 i를 1증가시키고 다시 조건을 판별
			}
			System.out.println(i);
		}
	
	//2.while의 continue
	//while 문은 증감식이 없어서 조건식으로 돌아간다.
	int num = 0;
	while(num <= 20) {
		num++;
		if(num% 3 == 0) {
			continue;
		}
	System.out.println(num);
	}
	//3.모든 회원 아이디에 a를 붙이는 작업
	//아이디가 admin 회원은 제외
	
	string[]arr = {"sim"};
	List<string> memberList = 
			new ArrayList()<String>();
	
	for(int i = 0; i< memberList.size(); i++ ) {
		if(memberList.get(i).equls("admin")) {
			continue;
		}
		String newMemberID = memberList.get(i); 
	}
	}
}
}
