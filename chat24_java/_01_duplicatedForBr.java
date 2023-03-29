package chat24_java;

public class _01_duplicatedForBr {

	public static void main(String[] args) {


		int iCnt = 0;
		int jCnt = 0;
		for(int i = 0; i < 5; i++) {
			if(i==3) {
				break;
			}
			iCnt++; // 3
			for(int j=0; j<5; j++) {
				if(j==2) {
					break;
				}
				jCnt++;
			}
		}
		System.out.println(iCnt);
		System.out.println(jCnt);
	}

}
