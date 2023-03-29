package chat35_usefulClass;

public class _04_String04 {

	public static void main(String[] args) {

		String str1 = "bit-naver-cloud";
		String str2 = "kiaCar";
		String str4 = "aBcDeF";
		int num1 = 1234;
		double num2 = 1234.5678;
		boolean a = true;
		//.jpg .JPG => toLowerCase()
		
		//특정 문자로 문자열 자르기
		String[] strArr = str1.split("-");
		for(String s : strArr) {
			System.out.println(s);
		}
		//인덱스로 문자열 자르기
	  System.out.println(str2.substring(4));
	  //ar
	  System.out.println(str2.substring(2,4));
	  //aC
	  
	  //a 나온후 자르기
	  System.out.println(str2.substring(
			  str2.indexOf('a')));
	  //aCar
	  //뒤에서 부터 짜르기
	  System.out.println(str2.substring(1,
			  str2.length()-1));
	  //iaCa
	  
	  //소문자로 치환
	  System.out.println(str4.toLowerCase());
	  //abcdef
	  
	  //대문자로 치환
	  System.out.println(str4.toUpperCase());
	  //ABCDEF
	  
	  //압뒤 공백없애기
	  String str5 = "                  aaaaabbbbbb dddddd";
	  System.out.println(str5.trim());
	  //aaaaabbbbbb dddddd
	  //다른 타입의 값을 string 으로 변환
	  String s1 = String.valueOf(num1);
	  String s2 = String.valueOf(num2);
	  String s3 = String.valueOf(a);
	  String s4 = Integer.valueOf(num1).toString();
	  System.out.println(s1+","+s2+","+s3+","+s4);
	  //1234,1234.5678,,true,1234
	

		
		
	}

}
