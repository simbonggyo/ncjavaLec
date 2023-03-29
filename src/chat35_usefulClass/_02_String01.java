package chat35_usefulClass;

public class _02_String01 {

	public static void main(String[] args) {

		String str1 = "bitcamp";
		str1 = "naver"; //새로 객체를 만든다.
		String st2 = new String("bitcamp");
		//이미 생성된 동일한 문자열이 있으면
		//그 문자열을 사용한다.
//		st2 = "naver";
		//새로운 문자열을 생성자를 통해 만든다.
		st2 = new String("naver");
		char[] chArr = {'b','i','t','c','a','m','p'};
		System.out.println(st2==str1);
		System.out.println(str1.equals(st2));
		String str3 = new String(chArr);
		if(str1.equals(str3)&& st2.equals(str3)) {
			System.out.println("str,str2,str3는 같은 문자열 입니다.");
		}else
			System.out.println("str,str2,str3는 다른 문자열 입니다.");

	}

}
