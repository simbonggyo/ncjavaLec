package homework.advance3;

public abstract class employee {

	int employeenum;
	String name;
	int salary;
	int type ; //1.정규직,2,계약직,3,임시직
	public employee(int employeenum, String name, int salary, int type) {
		super();
		this.employeenum = employeenum;
		this.name = name;
		this.salary = salary;
		this.type = type;
	}
	public int getEmployeenum() {
		return employeenum;
	}
	public void setEmployeenum(int employeenum) {
		this.employeenum = employeenum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	abstract double getMonthPay(int salary);
	void showEmployInfo() {
		System.out.println("사원정보 출력 메소드입니다.\n"+"사번은:"+employeenum+"입니다\n"+"이름은"+name+"입니다\n"+"급여는:"+salary+"입니다.");
	}
	
	
}
