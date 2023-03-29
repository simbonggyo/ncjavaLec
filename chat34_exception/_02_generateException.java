package chat34_exception;

public class _02_generateException {

	public static void main(String[] args) {

		NullPointerException ne = new NullPointerException()
		try {
			ArrayIndexOutOfBoundsException aie =
					new ArrayIndexOutOfBoundsException(
							"인덱스가 초과됐습니다.");
		}catch(NullPointerException ne2) {
			
		}catch (ArithmeticException ae) {
		
		}
		catch(Exception e) {
			//마지막 catch문은 위에 선언한 catch문을 다통과한 예외들을
			//처리할 수 있게 모든 예외를 담을 수 있는 예외최상위 클래스
			//Exception 할수 있게해준다.0
			System.out.println(e.getMessage());
			
		}
	}

}
