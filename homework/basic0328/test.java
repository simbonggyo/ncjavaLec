package homework.basic0328;

import java.util.ArrayList;
import java.util.List;

public class test {

	public static void main(String[] args) {

		List<String> str = new ArrayList<>();
		str.add("a");
		str.add("b");
		str.add("c");
		str.add("d");
		str.add("f");
		str.add("e");
		str.add("h");
		Q4 q = new Q4();
		q.printArr(str);
	}

}
