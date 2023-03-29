package homework.advance3;

public class fulltime extends employee{

	int bonus = 120;
	public fulltime(int employeenum, String name, int salary) {
		super(employeenum, name, salary);
	}
	void showEmployInfo(int employeenum, String name, int salary) {
		System.out.println("사원정보 출력 메소드입니다.\n"+"사번은:"+this.employeenum+"입니다\n"+"이름은"+this.name+"입니다\n"+"급여는:"+this.salary+"입니다.");
	}
	void InputEmploy(int employeenum,String name,int salary) {
		this.employeenum = employeenum;
		this.name = name;
		this.salary = salary;
	}

	@Override
	double getMonthPay(int salary) {
		this.salary = salary;
		int pay = salary/12 + bonus/12;
		return pay;
	}

	

}
