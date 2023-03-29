package chat27.java.inherit07.animal;

public class tiger extends Animal {

	public tiger(int age, int size, int legCnt, boolean hasWing) {
		super(age, size, legCnt, hasWing);
		this.age = 3;
	}

	private String meat;
	private boolean swimmging;
	private boolean hasPattern;
	String color;


	public void eat() {
		System.out.println(meat + "를 먹는다.");

	}

	public void swim() {
		if (swimmging)
			System.out.println("현재 수영중입니다.");
		else {
			System.out.println("현재 사냥중입니다.");
		}

	}

	public void pattern() {
		if (hasPattern)
			System.out.println("패턴이 있습니다.");
		else
			System.out.println("패턴이없습니다.");
	}

	public void tigerinfo(int age, int size, int lengCnt, boolean hasWing,String meat,boolean swimmging,boolean hasPattern,String color) { 
		this.meat = meat;
		this.swimmging = swimmging;
		this.hasPattern = hasPattern;
		this.color = color;
		// 부모의 속성 초기화

		// 부모클래스에 생성자 있다면
		// 위의 방식보다는 부모클래스의 생성자를 호출하는게 편하다.
		// 부모클래스 를 자식 클래스에서 사용하는 방법
		// super라는 키워드를 사용한다.
		// supper 자체는 부모클래스를 의미
		// 생성자들은 super() ;호출
		// super(); //기본생성자

	}

}
