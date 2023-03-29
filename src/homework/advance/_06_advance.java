package homework.advance;

public class _06_advance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "dBEfIZ";
		String prStr = "";
		
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
		    char convertCh ;
			if(ch >= 'A' && ch <= 'Z')//대문자 일때
			{
				if((ch + 33) > 'z' )// ch더한값이 아스키코드가 122 이상일때 -> 영문자로 표현되지않기때문에 교체해줘야된다. 
				{
					convertCh = (char)(('a' - 1) + ((ch + 33) - 'z')); // 122 이상이기 때문에 a부터 다시 만들어줘야 되기때문에 초과된값을 a 부터 다시 돌려준다.-> 재귀
				}
				else
				{
				    convertCh =(char)(ch + 33); //문자가 나와서 그냥 출력
				}
			}
			else  
			{
				if ((ch - 33) < 'A') //A보다 작을경우 영문자가 출력이 되지않기 때문에 교체 시켜줘야 된다.
				{							
                    convertCh =	(char)(('z' + 1) - ('A' - (ch - 33))); // a 전을 z으로 만들어야되니까 z 을 초과된값만큼 z부터 빼주면 재귀 할수 있다.ㄴ
				}
			    else 
			    {
                    convertCh = (char)(ch - 33); //에러가 발생하지 않으므로 문자만 바꿔서 출력
			
			}
			
	
		}
			prStr = convertCh + prStr;
		System.out.println(prStr);
	}

	}
}
