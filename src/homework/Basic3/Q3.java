package homework.Basic3;

public class Q3 {

	public static void main(String[] args) {
		
		int[] intary = new int[10];
		
		for(int i=0; i<10; i++) {
		intary[i] = (int)(Math.random()*10+1);
		}
		for(int j=0; j<10; j++) {
			if(intary[j]%2==1) {
				System.out.println(intary[j]);
			}
		}
	}

}
