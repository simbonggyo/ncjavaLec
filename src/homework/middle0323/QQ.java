package homework.middle0323;

import java.math.BigInteger;

public class QQ {

	static int num = 1;
	static int sum =0;
	static int[] intarr = new int[num];
	

	static int add(int n){

		if(num==1) {
			return n;
		}
		else{
		for(int i = 0; i< num; i++) {
			intarr[num] = n;
			sum = intarr[num] + add(intarr[num-1]) ;
		}
		num++;
		return sum;
	}
		
}
	int add2(int n) {
		return n+add2(n-1);
	}
}
