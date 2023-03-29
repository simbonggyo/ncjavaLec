package chat25_java;

import java.util.Scanner;

public class _01_createArray {

	public static void main(String[] args) {
		//1.배열의 선언

		Scanner sc = new Scanner(System.in);
		System.out.println("배열의 크기를 입력하세요");
		int c = sc.nextInt();
		
		int[] numArr = new int[c];
		//2. 배열의 요소의 값(초기화)
		numArr[1] = 14;
		numArr[2] = 16;
		//3.배열의 사용
		System.out.println(numArr[0]);
		System.out.println(numArr[1]);
		//초괴화하지 않는 요소의 사용
		System.out.println(numArr[2]);
		System.out.println("------------------");
		//4.길이가 큰 배열의 선언
		int [] bigArr = new int[1000];
		//5.반복문을 이용한 배열의 초기화
		for(int i = 1; i <= bigArr.length; i++ )
		{
			bigArr[i] = i + 1;
		}
		//6.길이가 큰 배열의 사용
		System.out.println(bigArr[2]);
		for(int j = 0; j < bigArr.length; j++) {
			if(bigArr[j]%3==0) {
			System.out.println(bigArr[j]);
		}
			
			
	}
		System.out.println("-------------------");
		//7. 배열선언과 동시에 초기화
		//길이가 4이면서 값이 10,20,30,40으로 기화된 배열 생성
		int[] Arrint = {10,20,30,40};
		//8.배열의 사용
		System.out.println(Arrint[1]);
		//인덱스 초가한 요소 접근
		//System.out.println(Arrint[5]);
		//최대 인덱스 보다 큰 인덱스에 접근하면
		//java.lang.IndexOuyOfBounsException 발생
		for(int k = 0; k<= Arrint.length -1; k++) 
		{
			System.out.println(Arrint[k]);
		}
}

}
