package homework.advance2;

public class Q4 {

	final static int N = 10;
	public static void main(String[] args) {

		
		for(int i = -N; i<=N; i++)// i=-N.....N 반복 //x축 만들기
		{
			for(int j=-N; j<=N; j++)//j= -N.....N반복 N = 15 ->-15~15 N->-14~14 -> y축 만들기
			{

				if(i*j/2<=N*j/2)// *을 찍는 조건
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		
	}

}
