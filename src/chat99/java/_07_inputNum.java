package chat99.java;

import java.util.Scanner;

public class _07_inputNum {

	public static void main(String[] args) {

		System.out.println("1~200사이의 숫자를 입력하세요.:");
		Scanner sc = new Scanner(System.in);
		//컴퓨터는 변수에 1~200 랜덤값
		int ramdom = (int)(Math.random()*200+1);
		
		boolean regameFlag = false;
		while(true) {
			int a = sc.nextInt();
			
			if(a >= 201||a<0) {
				System.out.print("잘못입력했습니다 종료합니다.");
				break;
			}
			else if(a == ramdom) {
			 
				System.out.print("맞췄습니다 다시하겠습니까? 종료를 원하면 0");
				
				
				int b =sc.nextInt();
				
				//b>=2 이상입력시 다시물어봐야됨.
			if (b == 1) {
				continue;
			}
			else if(b==0) {
				break;
				
			}
			
			
			
		}
			else 
			{
				System.out.print("틀렸습니다.다른수를 입력하세요.");
				continue;
			}
			//사용자 입력 정수 받기 nextInt
		
			//201이면 while 문 종료 
			//com == input
			//맞췄습니다.
				//계속하시겠습니까?
				//1 =>com = 새로운 1~200까지의 난수 다시게임 시작
				//0 => 게임종료
				//틀렸습니다. 다시 입력하세요.
				//입력값 다시 받도록
             sc.close();
		}
		
		
		}
}


