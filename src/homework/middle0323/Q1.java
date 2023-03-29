package homework.middle0323;

public class Q1 {

	public static void main(String[] args) {

		StringBuffer hello = new StringBuffer(30);
		hello.append("hello");
		int a = 3;
		for(int i = hello.length(); i< hello.capacity(); i++) {	
			 if(a%3==0) {
			 hello = hello.append("b");
			 a++;
			 }else if(a%3==1) {
				 hello = hello.append("i");
				 a++;
			 }else if(a%3==2) {
				 hello = hello.append("t");
				 a++;
			 }
			 System.out.println(hello);
			}
		
	}

}
