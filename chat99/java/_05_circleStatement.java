package chat99.java;

public class _05_circleStatement {
	final static int N = 30;
	public static void main(String[] args) {
				
			for(int i = -N; i<=N; i++)// i=-N.....N 반복 //x축 만들기
			{
				for(int j=-N; j<=N; j++)//j= -N.....N반복 N = 15 ->-15~15 N->-14~14 -> y축 만들기
				{

					if(i*i+j*j<=N*N)// *을 찍는 조건
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


