package chat19_java;

public class _03_switchCase {

	public static void main(String[] args) {
		String grade ="A";
		//break문을 넣어야 정상적으로 동작하기 때문에
		//case별로 항상 break문을 넣어줘야 된다.
		//break문이 없는 경우에는 맞는 조건부터 break문을
		//만날때까지는 case가 모두 실행된다.
		switch(grade) {
		case "A":
			System.out.println("점수는 "+
		"90점이상입니다.");
			break;
		case "B":
			System.out.println("점수는 "+
		"90점미만80점이상입니다.");
			break;
		case "C":
			System.out.println("점수는"+
		"80점미만 70점이상입니다.");
			break;
		case "D":
			System.out.println("점수는"+
		"70점미만 60점이상입니다.");
			break;
		}
	}

}
