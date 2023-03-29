package chat33_objectarray.ILecture;

public class English implements ILecture {

	String subject ="영어";
    int StudentCnt=3;
    int lecturetime=4;
    
	@Override
    public void LeCure(){
    	System.out.println(this.subject + 
				"수업을 " + this.StudentCnt +
				"명의 학생이 듣습니다. 수업시간은 " + 
				lecturetime + "분입니다.");
	}
	
	
	

}

