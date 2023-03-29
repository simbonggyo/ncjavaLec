package chat26.java.Phone;

public class PhoneInfo {

	//이름 100개와 전화번호 100개를 을 수 있는 배열 2개
	public String[] name = new String[100];
	public String[] phonenum = new String[100];
	
	//배열의 현재 인덱스를 담고 있을 변수
	int index = 0;
	//전달받은 이름과 전화번호를 저장하는 메소드
	//insertPhonenum
	
	public void insertPhonenum(String name,String Phonenum) 
	
	{
		for(int i = 0; i<= index; i++) {		
		if(i == index) {
			this.name[index] = name;
		    this.phonenum[index]= Phonenum;
		}
		}
		index++;
		System.out.println(index);
		
	}
	//저장된 모든 전화번호,모든 이름 를 출력하는 메소드
	//printAllPhonenum
	public void printAllPhonenum() {
		for(int i=0; i<index; i++) {
			System.out.println("이름"+name[i]+", 전화번호 :"+phonenum[i]);
		}
		
	}
	//ex) 이름: 홍길동 , 전화번호 :1111111
	//ex) 이름: 홍길동2 , 전화번호 : 22222222
	//ex) 이름: 홍길동3 , 전화번호 : 3333333
	//ex) 이름: 홍길동4 , 전화번호 : 4444444
	
	//전달받은 번호의 해당하는 이름과 전화번호를 출력하는 메소드
	//printPhonenum
	public void printPhonenum(String name) {
	
		for(int i=0; i< this.name.length-1; i++) {
		if(this.name[i].equals(name)) {
			System.out.println(this.name[i]);
			System.out.println(this.phonenum[i]);
		}else 
		{
			System.out.println("해당하는게 없습니다");
			break;
		}
		
	
	
	}
	}
	//ex) 이름: 홍길동 , 전화번호 :1111111
	
}


