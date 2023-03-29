package chat05_java;

public class _10_typeCasting {

	public static void main(String[] args) {

		
		int uniCode = 65;
		char ch = (char)uniCode;
		
		//4. 강제 형변환에서 범위를 초과한 값을 변환했을때 
		long lNum2 = 32770L;
		short SNum2 = (short)lNum2;
		
		//32.767을 초과하면 -32.768부터 다시 시작된다.
		System.out.println(SNum2);
		//5.연산에서의 형변환
		//피연산자중 바이트크기가 작은 변수가
		//바이트 크기가 큰 자료형으로 변환된 후
		//연산이 진행된다.
		int iNum1 = 15;
		long result = lNum2 +iNum1;
		//크기가 작은 자료형으로 변환하여 연산할 수도 있다.
		int result2 = (int)lNum2 + iNum1;
		
	//6.문자열 결합 연산에서의 형변환
	//문자열과 다른 모든 타입들을 +연산 하면
    //다른 모든 타입들이 문자열로 형변환 후
    //문자열 결합 연산 진행
	String str = "java";
	int version = 11;
	System.out.println(str + version);
	
	}

}
