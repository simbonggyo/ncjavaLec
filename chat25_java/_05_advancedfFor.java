package chat25_java;

public class _05_advancedfFor {

	public static void main(String[] args) {
		int[] score = {100,84,92,65,71};
		int sum = 0;
		double avg;
		for(int s : score) {
			System.out.println(s);
			sum += s;
		}
		System.out.println("점수의 총합:" + sum);
		avg = (double)sum/score.length;
		System.out.println("평균은"+avg);
 
	}

}
