package chat33_objectarray;

public class _01_objectArray {

	public static void main(String[] args) {

		//객체배열의 선언
		Lecture[] le = new Lecture[3];
		//객체배열의 초기화
		le[0] = new Lecture("자바", 30, 50);
		le[1] = new Lecture("c언어", 29, 45);
		le[2] = new Lecture("파이썬", 45, 60);
		//객체배열의 사용
		for(int i = 0; i<le.length;i++) {
			le[i].proceedLecture();
		}
	}

}
