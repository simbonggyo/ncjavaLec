package chat98.java;

public class Playermain extends player{

	public static void main(String[] args) {

		Playermain main = new Playermain()
	}

	@Override
	void play(String songName) {

		System.out.println(songName+"곡을 재생합니다.");
	}

	@Override
	void pause() { 
	System.out.println("곡을 일시정지합니다.");
		// TODO Auto-generated method stub
		
	}

	@Override
	void stop() {
		System.out.println("곡을 정지합니다.");
	}

}
