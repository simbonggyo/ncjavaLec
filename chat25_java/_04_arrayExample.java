package chat25_java;

import java.util.Random;
import java.util.Scanner;

public class _04_arrayExample {

	
	
	
	
	public static void main(String[] args) {
		
		
		//가위 바위 보 10판 진행
		//배열에 각 판의 승무패 저장
		//배열의 저장된 승 무 패 를 세서 몇승 몇무 몇패인지 출력
		
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		//승무패를 담아줄 배열(w,d,l)
		int[] wldArr = new int[10];
		
		int com = rd.nextInt(3);
		int w = 0;
		int d = 0;
		int l = 0;
		for(int i = 0; i < 10; i++) {
		System.out.print("가위, 바위, 보 중 하나를 입력하세요. : ");
		String input = sc.nextLine();
		int inputNum = 0;
		
		if(input.equals("가위")) {
			inputNum = 0;
		} else if(input.equals("바위")) {
			inputNum = 1;
		} else if(input.equals("보")) {
			inputNum = 2;
		}
		
		if(com == inputNum) {
			wldArr[i] = 1;
		} else {
			if((inputNum == 0 && com == 1) ||
				(inputNum == 1 && com == 0) ||
				(inputNum == 2 && com == 2)) {
				wldArr[i] = 2;
				
			} else {
				wldArr[i] = 3;
				
			}
		}
		
		
		
	}
		sc.close();
		for(int j = 0; j<= wldArr.length -1; j++) {
			if(wldArr[j] == 1) 
			{
				w++;
			}
			else if(wldArr[j] == 2) 
			{
				d++;
			}
			else if(wldArr[j] == 3)
			{
				l++;
			}
			
		}
		System.out.print(w+"승"+d+"무"+l+"패");
}
}
