package homework.middle4;

public class ArrayUtility {


	static int i =0;
	static double[] dest = new double[i];
	
// double배열을 int배열로 변환

	public static int[] roundUp(double[] array2) {
	    int[] arr = new int[array2.length];
	    for (int i = 0; i < array2.length; i++) {
	        arr[i] = (int) Math.ceil(array2[i]);
	    }
	    return arr;
	}
	public static double[] roundDown(int[] array2) {
	    double[] arr = new double[array2.length];
	    for (int i = 0; i < array2.length; i++) {
	        arr[i] = (int) Math.ceil(array2[i]);
	    }
	    return arr;
	}
}

