package chat25_java;

public class _07_deepCopy {

	public static void main(String[] args) {
		//1. clone()을 이용한 깊은 복사
		int[] intary = {1,2,3,4,5};
		int[] intary2 = intary.clone();
		
		//System.out.println(intary);
		//System.out.println(intary2);
		//System.out.println(intary == intary2);
		//깊은 복사는 값을 변경해도 아무런 영향을 끼치지 않는다.
		
		intary[0] = 10;
		intary2[0] = 20;
		
	//	System.out.println(intary[0]);
	//	System.out.println(intary2[0]);
		
		//2.System.arraycopy
		int[]arr3 = new int[6];
		
		System.arraycopy(intary, 0, arr3, 0, intary.length);
		for(int i : arr3) {
			System.err.println(i+",");
		}
		System.out.println(intary);
		System.out.println(arr3);
		System.out.println(intary==arr3);
		
		arr3[1] = 13;
		intary[1] = 33;
		
		
		System.out.println(arr3);
		
	}

}
