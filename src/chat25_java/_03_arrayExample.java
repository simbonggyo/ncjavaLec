package chat25_java;

public class _03_arrayExample {

	public static void main(String[] args) {

		char[] chArr = {'B','c','d','e','f','g'};
		char[] converArray = new char[6];
		
		for(int i = 0; i <= chArr.length-1; i++)
		{
			
		if(chArr[i] >='A'&& chArr[i] <= 'Z') 		
		{
			chArr[i] = (char)(chArr[i] + 32); // int형이랑 char 형이랑 덧셈은 int 형으로 되므로 char 형으로 바꿔준다.
			} 
		else
		{
			chArr[i] = (char)(chArr[i] - 32);  // int형이랑 char 형이랑 덧셈은 int 형으로 되므로 char 형으로 바꿔준다.
		}
		
		converArray[i] = chArr[i];
		//ch가 대문자면 +32 -> 소문자로 소문자면 -32 대문자로
		System.out.println(converArray[i]);
		}
		
		//소문자는 대문자로, 대문자는 소문자로 변경
		//변경후 converArray에 저장
	}

}
