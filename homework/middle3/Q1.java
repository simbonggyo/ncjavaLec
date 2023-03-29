package homework.middle3;

public class Q1 {

	public static void main(String[] args) {

		int[] intary = new int[20];
		for(int i=1; i<19; i++) {
			intary[i] =(int)(Math.random()*101);
		}
		for(int j=1; j<19; j++) {
			if(intary[j]%2==1) {
				System.out.println(intary[j]);
			}
			if(intary[j]%2==0) {
				System.out.println(intary[20-j]);
			}
		}
	}

}
