package chat35_usefulClass;

public class _06_StringBuffer01 {

	public static void main(String[] args) {

		StringBuffer sv1 = new StringBuffer("bitcamp");
		StringBuffer sv2 = new StringBuffer("bitcamp");
		System.out.println(sv1==sv2);
		//equlas() 가 오버라이딩되어 있지 않아서 
		//문자열의 값을 비교할 수 없다.
		System.out.println(sv1.equals(sv2));
	
		//문자열로 변환해서 값을 비교한다.
		String str1 = sv1.toString();
		String str2 = sv2.toString();
		
		System.out.println(str1.equals(str2));
		System.out.println(str1==str2);
	}

}
