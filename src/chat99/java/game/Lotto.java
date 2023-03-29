package chat99.java.game;

public class Lotto {
	int Anum = 0;
	int Bnum = 0;
	int num = 7;
	int Winnum = 0;
	int[] Arr = new int[num];
	int[] arr = new int[num-1];
	
	public void radom(int radomnum) {
		
		    this.num = radomnum;
		for(int i = 1; i<radomnum; i++) {
			this.Arr[i-1] =(int)(Math.random() * 45) + 1;
			 Arr[radomnum] = (int)(Math.random() * 45) + 1; //보너스 넘버
		if (checkDuplicate(Arr, radomnum))
			continue;		
		}
	
	}
	
	public boolean checkDuplicate(int[] arr, int num) {
			 for(int i = 0; i< num; i++) {
				if(arr[num]==arr[i]){
			         	return false;
				}
				
			      }
			 return true;
			
		
	}
	public void checknum(int[] arr) {
		for(int i=0; i<Arr.length-1; i++) {
			for(int j=0; j<arr.length; j++)
			if(this.Arr[i] == arr[j])
			{ 
				Anum++;
			}
			else if(Arr[num]==arr[j])
				Bnum++;
	 }

		
		

	}
	public int Wincheck() {
		
		if(Bnum == 1) {
			if(Anum==5)
				Winnum = 2;
			else 
			System.out.println("보너스 숫자 포함"+Anum+Bnum+"개 맞추셨습니다.");
		}else
		{
			if(0<= Anum && Anum<=2) {
				Winnum = 6;
				System.out.println("꽝");
			}
			else if(Anum==3) {
				Winnum = 5; 
			}
			else if(Anum==4) {
				Winnum = 4;
			}
			else if(Anum==5) {
				Winnum = 3;
			}
			else if(Anum==6) {
				Winnum = 1;
			}
		}
		return Winnum;
	 }
	
	}

	//1 ~ 45까지 7개의 난수(중복제거)
	//7번째 숫자는 보너스 번호
	
	//사용자가 1~45까지 6개 숫자 선택(중복제거)
	
	//1등 : 보너스 번호를 제외한 6개 숫자가 모두 같을 때
	//2등 : 보너스 번호와 5개의 숫자가 일치할때
	//3등 : 보너스 번호를 제외한 5개의 숫자가 일치할 때
	//4등 : 보너스 번호를 제외한 4개의 숫자가 일치할 때
	//5등 : 보너스 번호를 제외한 3개의 숫자가 일치할 때
	//나머지는 꽝
	
	// 몇 등인지 출력
	


