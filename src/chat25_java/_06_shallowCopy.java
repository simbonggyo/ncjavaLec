package chat25_java;

public class _06_shallowCopy {

	public static void main(String[] args) {
		int[] intArr1 = {1,2,3,4,5};
		//얕은 복사
		int[] intArr2 = intArr1;
		System.out.println(intArr1);
		System.out.println(intArr2);
		System.out.println(intArr1 == intArr2);//==은 같은가요? = 왼쪽에 오른쪽 값 대입
		
		//값을 변경하면 서로 영향 미친다.
		intArr1[0] = 20;
		intArr2[4] = 30;
		
		System.out.println(intArr1[4]);
		System.out.println(intArr2[0]);

		//깊은 복사
		
	}

}
