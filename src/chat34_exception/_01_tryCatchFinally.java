package chat34_exception;

public class _01_tryCatchFinally {

	public static void main(String[] args) {

		int[] arr = {1,2,3};
		String[] strarr = new String[3];
		int index = 0;
		while(true) {
			try {
				System.out.println(arr[index++]);
				System.out.println(strarr[0]);
				//if(index ==2) {
					//System.out.println(10/0);
				}
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(e.getLocalizedMessage());
				System.out.println(index+"는 배열에 존재하지 않는");
			}catch(ArithmeticException ae) {
				System.out.println(ae.getMessage());
				System.out.println("분모가 0이될수없습니다");
			}catch(NullPointerException ne) {
				
			}
			finally {
				if(index < 3){
					if(index ==2) {
					System.out.println("정상출력");
					}
				}else {
					System.out.println("예외발생.while문을 종료합니다");
					break;
				}
			}
		}
	}

}
