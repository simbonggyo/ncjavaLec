package chat28.java;

public class weight {

	public void twoWeightSum() {
		int a = 76;
		int b = 65;
		
		String sum = Add.add(a, b, "kg");
		System.out.println(sum);
	}
	public void twoWeightGramSum() {
		int a = 76;
		int b = 65;
		
		String sum = Add.add(a*1000, b*1000, "gm");
		System.out.println(sum);
	}
}
