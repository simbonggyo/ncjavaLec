package homework.advance0322;

public class Engishchange {
int num =0;
String str="";
	String ChangeEnghilh(String str,int num) {
		this.num = num; 
		this.str = str;
	
	String capStr = "";
	
	for(int i = 0; i<str.length(); i++) {
		
	char ch = str.charAt(i); 
	char capCh;
	if(ch >='A'&& ch <='Z') {
		if((ch+num) > 'z') 
		{ 
			(char)(('a' - 1) + ((ch+num) -'z')); 
			}
					else 
					{
						(char)(ch+num);
					}
}
	else {
				if((ch - num) <'A') 
				{
					(char)(('z'+1) - ('A' - (ch - num) )); 
				}
					else
				{
						(char)(ch - num);
					}
				}
			
			capCh = ch;
	
	
	capStr = capCh + capStr;
	System.out.println(capStr);

	}
	return capStr;
 }
}