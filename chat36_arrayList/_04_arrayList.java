package chat36_arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _04_arrayList {

	public static void main(String[] args) {


		//사용자가 문자열을 입력
				//길이를 10씩 만큼씩 잘라서
				//ArrayList에 저장
				//남은 문자열의 길이가 10보다 작으면
				//남은문자열을 ArrayList에 저장
				//ex) abcdefghijklmnop
				//[abcdefghij, klmnop]
				//출력
		
		Scanner sc = new Scanner(System.in);
		StringBuffer sb = new StringBuffer(sc.nextLine());
		List<StringBuffer> stringAry2 = new ArrayList<StringBuffer>();
		
		int lenth = sb.length();
		for(int i = 0; i < sb.length(); i += 10) {
			if(i + 10 < lenth)
				stringAry2.add(new StringBuffer(
						sb.substring(i,i+10)));
			else
				stringAry2.add(new StringBuffer(
						sb.substring(i,lenth)));
		}
		for(StringBuffer sb2 : stringAry2) {
			System.out.println(sb2);
		}
	}

}
