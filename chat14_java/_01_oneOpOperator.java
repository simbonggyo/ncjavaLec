package chat14_java;

public class _01_oneOpOperator {

	public static void main(String[] args) {

		//1.부호연산자
		int num1 = 10;
		System.out.println(+num1);//10출력
		System.out.println(-num1);//-10출력
		System.out.println("-------------------------");
		
		//2-1. 전위 증감연산자
		int num2 = 10;
	
		System.out.println(++num2);//11출력
		System.out.println(--num2);//10출력
		System.out.println("--------------------");
		
		//2-2. 후위 증감연산자
		
		int num3 = 10;
		
		System.out.println(num3--);//10출력 9저장
		System.out.println(num3++);//9출력 10저장
		System.out.println("-----------------");
		
		//2-3. 전위 후위 증감연산자 혼합
		
		int num4 = 10;
		System.out.println(++num4);//11출력 11저장
		System.out.println(num4--);//11출력 10저장
		System.out.println(num4++);//10출력 11저장
		System.out.println(num4);//11출력
	}

}
