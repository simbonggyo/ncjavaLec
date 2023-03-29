package chat99.java;

public class _03_mathRandom2 {

	public static void main(String[] args) {
		
System.out.println(Math.random());
int rand = (int)(Math.random()*10);
System.out.println(rand);
	
//3.1~45까지 난수 발생기

int ramdom = (int)(Math.random()*45);
System.out.println(ramdom);

//4.200 ~ 300 까지 난수 발생기
int rand2 = (int)(200 + Math.random()*100);
System.out.println(rand2);
	}
	//a~b까지 랜덤
	//(int)(Math.random()*(b-a+1))+a)

	
}
