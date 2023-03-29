package homework.advance;

public class Q1 {

	public static void main(String[] args) {

		String str = "dBEfIZ";
		String capStr = "";
		
		for(int i = 0; i<str.length(); i++) {
			
		char ch = str.charAt(i); 
		
		char capCh = ch >='A'&& ch <='Z' 
				?
						(ch+33) > 'z' ?
								(char)(('a' - 1) + ((ch+33) -'z')) :
									(char)(ch+33) :
										(ch - 33) <'A' ?
												(char)(('z'+1) - ('A' - (ch - 33) )) :
													(char)(ch - 33);
				
				
		
		
		capStr = capCh + capStr;
		System.out.println(capStr);
	
		}
		
	}

}
