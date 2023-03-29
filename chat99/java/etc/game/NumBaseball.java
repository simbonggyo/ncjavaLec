package chat99.java.etc.game;

import java.util.Scanner;

public class NumBaseball {

	//게임 룰 : 컴퓨터가 3개의 랜덤값을 가지고
	//      : 사용자가 3개의 숫자를 입력(중복불가능)
	//      : 컴퓨터의 3개의 숫자와 사용자의 3개의 숫자를 비교
    //      : 숫자만 같으면 볼로 판정
	//      : 숫자와 위치 까지 모두 같으면 스트라이크로 판정
	//      : 몇 스트라이크 몇 볼인지 출력
	//      : 3 스트라이크시 몇 회만에 맞췃는지 출력하고 게임 종료
    //      : 다시 게임 진행할 지 물어보고(1: 리스타트, 0: 종료)
	// 스트라이크와 볼의 개수를 세어줄 변수
	private int strike = 0;
	private int ball = 0;
	
	//몇 번 맞췄는지 세어줄 변수
	private int gameCnt =0;
	
	//컴퓨터 랜덤값 담아줄 배열
	int[] com = new int[3];
	
	//사용자 입력값 저장할 배열
	int[] user = new int[3];
	
	Scanner sc = new Scanner(System.in);
	
	//게임 시작 메소드
	public void start() {
		while(true) {
			
		generateRandom();
		
		//컴퓨터 배열 확인
		System.out.println(com[0] + ","+com[1]+","+com[2]);
		while(true) {
			strike = 0;
			ball = 0;
			
			getuserInput();
			//사용자 입력값 확인
			System.out.println(user[0]+","+user[1]+","+user[2]);
		if(judgetStrike()) {
			break;
		}
		else {
			continue;
		 }
		}
		if(regame()) {
			continue;
		}else {
			break;
		}
	 }
	}
	
	//랜덤함수 생성하는 메소드
	public void generateRandom() {
	//중복 체크	
		
	}
	
	
	//중복값 체크 메소드
	public boolean checkDuplicate(int[] arr,int num) {
		boolean isDuplicated = false;
		
		
		
		return false;
	}
	//유저의 입력 값을 배열에 담아줄 메소드
	public void getuserInput() {
		
		//중복 체크
	}
	//볼 스트라이크 판정 메소드
	public boolean judgetStrike() {
		
		return false;
	}
	public boolean regame() {
		
		return false;
	}
}
