package homework.basic0323;

public class Q2 {

	public static void main(String[] args) {


		
		StringBuffer hello = new StringBuffer(30);
		System.out.println(hello);
		hello.append("hello").toString();
		System.out.println(hello);
		for(int i = hello.length(); i< hello.capacity(); i++) {	
			 hello = hello.append("a");
			 System.out.println(hello);
			}
	System.out.println(hello);	
	}
	}


