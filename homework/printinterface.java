package homework;

import homework.print.translate.inkjetprinter;
import homework.print.translate.laserprinter;
import homework.print.translate.print;

public class printinterface {

	public static void main(String[] args) {

		print pr = new print();
		print pr1 = new laserprinter();
		print pr2 = new inkjetprinter();
		
	pr1.leveltest();
	pr2.leveltest();
	pr.leveltest();
	
	}

}
