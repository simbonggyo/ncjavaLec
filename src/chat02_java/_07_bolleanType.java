package chat02_java;

public class _07_bolleanType {

	public static void main(String[] args) {

		String id = "bitNaver5";
		boolean idValidation = false;
		if(id.length()>=5 && id.length()<2) {
			idValidation = true;
		}
		if(idValidation == true) {
			//idValidation 와같이 == true를 생략할수 있음
			System.out.println("사용할수 있는 아이디");
		}
		else {
			System.out.println("아이디는 5자이상 20자 미만으로 만들어 주세요.");
		}
	}

}
