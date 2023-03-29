package chat99.java.car;

public class Car2 {

	//입력받은 인덱스 의 길이를 설정
	//i 번째 인덱스 출력
	//인덱스가 저장가능한 인덱스보다 커지면 정지 명령
	//배열 형태로 받아와서 배열에 저장 -> 하나씩 저장? 
	
	//제조사(company),모델(model),색상(color),가격(price)
	//public
	
	int index = 0;
	int i = 0;
	
	
	String[] company = new String[10];
	String [] model = new String[10];
	String [] color = new String[10];
	int price [] = new int[10];
	
	
	public String[] getCompany() {
		return company;
	}

	public void setCompany(String[] company) {
		this.company = company;
		for(i=0; i<company.length; i++) {
			company[i] = i;
		}
	}

	public String[] getModel() {
		return model;
	}

	public void setModel(String[] model) {
		this.model = model;
	}

	public String[] getColor() {
		return color;
	}

	public void setColor(String[] color) {
		this.color = color;
	}

	public int[] getPrice() {
		return price;
	}

	public void setPrice(int[] price) {
		this.price = price;
	}

	
	
	public void CarInfo() 
	{ 
		System.out.print("제조사"+company[index]+"모델"+model[index]+"색상"+color[index]+"가격"+price[index]);	
	}
	
	//
	//carInfo() -> 입력한 자동차 정보를 출력
	//제조사: 현대
	//모델 제네시스
	//색상: 검정
	//가격: 5000
}
