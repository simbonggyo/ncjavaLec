package chat33_objectarray;

public class Lecture {

	private String subject;
	private int studentCnt;
	private int lectureTime;
	
	public Lecture(String subject, int studentCtn, int lectureTime) {
		this.subject = subject;
		this.studentCnt = studentCtn;
		this.lectureTime = lectureTime;
	}
	public void proceedLecture() {
		System.out.println(this.subject+"수업을"+this.studentCnt+"명의 학생이 듣습니다."+lectureTime +"분입니다");
	}
}
