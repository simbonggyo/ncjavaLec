package chat98.java;

public class Dogmain implements Dog,cat{

	@Override
	public void crying() {

		System.out.println("월!월!");
	}

	@Override
	public void show() {

		System.out.println("HelloWord");
	}

	public static void main(String[] args) {

		Dogmain main = new Dogmain();
		
		main.crying();
		main.show();
		
	}

	@Override
	public void two() {
		System.out.println("two");
		
	}

	@Override
	public void one() {
		System.out.println("one");
		
	}

}
