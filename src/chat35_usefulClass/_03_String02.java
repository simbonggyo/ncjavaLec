package chat35_usefulClass;

import java.util.ArrayList;
import java.util.List;

public class _03_String02 {

	public static void main(String[] args) {

		String str1 = "computer";
		String str2 = "smartPhone";
		String str13 = "abcdhdecba";
		
		if(str1.contains("tP")) {
			System.out.println(str1+"은 tP를 포함합니다.");
		}else
			System.out.println(str1+"은 tP를 포함하지 않습니다.");
	
	
	
	//해당 문자나 문자열의 인덱스 확인
	int index1 = str2.indexOf('h');
	int index2 = str13.indexOf('a',4);
	int index3 = str13.indexOf("abc");
	
	int index4 = str13.lastIndexOf('h');
	int index5 = str13.lastIndexOf("bc");
	
	//문자열 길이
	System.out.println("str1의 길이는 "+str1.length()+"입니다");
	int[] intArr = new int[3];
	
	System.out.println("str1의 길이는"+intArr.length+"입니다.");
	List<Integer> intList = new ArrayList<Integer>();
	System.out.println(intList.size());
	
	//replace, replaceAll(정규식 사용가능)
	String str4 = "abcabcabcaabbbcc";
	System.out.println(str4.replaceAll("abc", "111"));
	//[]안에 문자를 전부 치환한다.
	System.out.println(str4.replaceAll("[ac]", "2"));
	
	System.out.println(str4.replace('a', '1')
			               .replace('b', '2')
			               .replace('c', '3'));
	
	}
}
