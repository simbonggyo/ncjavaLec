package homework.advance0323;

import java.util.Random;

public class Studentpage extends StudentRespority implements student {
	
	int index;
	int[] Studnetnum = new int[index+1];
	String[] Studentname = new String[index+1];

	public void saveInfo(int Studentnum,String studentname) {
	
		this.Studentname[index] = studentname;
		this.Studnetnum[index] = Studentnum;
	System.out.println("저장이완료되었습니다."+index);
	   index = index+1;
	   System.out.println(index);
	}

		
	
	
	public void printinfoAll() {
		
		for(int i = 0; i<= index; i++) {
			//전체정보 출력
			System.out.println("이름: "+Studentname[i]+"     "+"학번: "+Studnetnum[i]);
		}	
	}




	@Override
	public double getAvg(double num) {
		
		double Avg = num/(index+1);
		return Avg;
	}




	//회원 검색 없으면 자동 가입 완료
	@Override
	public boolean printinfo(int Studentnum, String studentname) {

		boolean Check = true;
		for(int i = 0; i< index+1; i++) 
		{
			if(this.Studentname[i] == studentname&& Studnetnum[i]==Studentnum) {
				System.out.println("해당 학생의 이름은: "+Studentname[i]+"해당학생의 학번은"+Studnetnum[i]);
			Check = true;
			}
			else
			{
			Check = false;
			
			}
		}
		if(Check == false) {
			Studentpage stp = new Studentpage();
			System.out.println("회원등록");
			this.Studentname[index] = studentname;
			this.Studnetnum[index] = (int)(Math.random()*90000+10000);
			System.out.println("이름 : "+this.Studentname[index]+"\n생성된 학번: "+this.Studnetnum[index]);
			stp.saveInfo(Studnetnum[index],this.Studentname[index]);
		
		}
		return Check;
	}








}
