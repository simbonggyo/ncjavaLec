package chat35_usefulClass;

public class _07_StringBuffer02 {

	public static void main(String[] args) {

		StringBuffer sv1 = new StringBuffer(100);
		StringBuffer sv2 = new StringBuffer("bitcamp");
	
		sv1.append("navercloud");
		//capacity()와 length()의 차이점
		System.out.println(sv1.capacity());
		System.out.println(sv1.length());
		
	//delete()와 insert()
	StringBuffer sv3 =	sv2.delete(3,7);
	System.out.println(sv3);
	
	sv3=sv3.insert(3,"camp");
	System.out.println(sv3);
	
	//reverse()
	sv1 = sv1.reverse();
	System.out.println(sv1);
	
	//setCharAt()
	sv3.setCharAt(3, 'C');
	System.out.println(sv3);
	
	//setLength()
	sv3.setLength(10);
	System.out.println(sv3);
	}

}
