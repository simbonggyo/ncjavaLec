package chat34_exception;

public class _03_throws {

	public static void main(String[] args) {

		int [] arr = {1,2,3,4};
		try {
			getException(arr);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
		public static void getException(int[] arr)
				throws Exception{
			//throws로 예외처리된 메소드를 호출할 때는
			//예외가 발생할 수 있는 확률이 있기 때문에
			//try~catch로 묶어서 처리를 해야한다
			//checked면 무조건 예외처리
			//예외처리 안하면 에러발생
			//unchecked면 예외처리 안해도 된다.
			//getException(arr);
			for(int i =0; i<10; i++) {
				System.out.println(arr[i]);
			}
		
			
}

}
