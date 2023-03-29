package homework;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class math {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String pattern = "[a-zA-Z0-9]{1,9}";
		Pattern pt = Pattern.compile(pattern);
		Matcher m = pt.matcher(str);
		while(m.find()) {
			System.out.println(m.group());
		}
	}

}
