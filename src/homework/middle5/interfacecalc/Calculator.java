package homework.middle5.interfacecalc;

import java.util.Scanner;

public class Calculator {
	
	int a;
	int b;
	
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public Calculator(int result, int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	public interface Add{
		public int add(int a, int b);
	}
	public interface Sub{
		public int sub(int a ,int b);
	} 
	public interface Mul{
		public int mul(int a,int b);
	}
	public interface Div{
		public int div(int a,int b);
	}
	

}
