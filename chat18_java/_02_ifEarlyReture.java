package chat18_java;

import java.util.Scanner;

public class _02_ifEarlyReture {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("점수 를 입력하세요 =");
		int score = scanner.nextInt();
	    String grade = "";
		if(score >= 90) {
			if(score >= 95)
		grade = "A+학점";
			else 
				grade ="A0";
		}
		if(score < 90 && score >= 80) {
		grade = "B학점";
		}
		if(score < 80 && score >= 70){ 
		grade = "C학점";
		}
		if(score < 70 && score >= 60){ 
		grade = "D학점";
		}
		if(score < 60) {
		grade = "F학점";
		}
		System.out.println(grade);
		
	}
	

public static String getGrade(int a,String g) {
String returnStr ="";
if(a % 10 >= 5){
	returnStr = g + "+";
}else {
	returnStr = g + "0";
}
return returnStr;
}

}