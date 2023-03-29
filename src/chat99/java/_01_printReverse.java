package chat99.java;

public class _01_printReverse {

	public static void main(String[] args) {

		String str = "AbcDeF";
		
		//대소문자 변환 된 문자열
		String capStr = "";
		
		//fEdCBa
		//대문자 소문자 바꿔주는 작업
		for(int i  = 0; i<str.length(); i++) {
			char ch = str.charAt(i); //ch 에 문자열 을 넣는다. charAt 해당 문자열을 꺼내올수있다.
		char capCh = ch >='A'&& ch <= 'Z' ?
				(char)((int)ch +32) :
			    (char)((int)ch -32);
		//ch가 대문자면 +32 -> 소문자로 소문자면 -32 대문자로
		capStr = capCh + capStr;
		System.out.println(capStr);
		}
		
		//반대로 출력
		//capStr ="aBCdEf";
		for(int i = capStr.length() -1; i>=0; i--) {
			System.out.print(capStr.charAt(i));
		}
	}

}
