package homework.middle2;

import java.util.Random;
import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		int i = 0;
		while(i<=9)
		{
			++i;
			
			if(i%2==0) {
				continue;
			}
			//System.out.println(i);
		}
		int sum = 0;
		for(int a = 0; a <= 1000; a++) {
			if(a%2==0&&a%7==0) {
				//System.out.println(a);
				sum += a;
			}
			
		}
		//System.out.println(sum);
		for(int b = 0; b<= 10; b++) {
			
			for(int c =0; c<= 10; c++) {
				//System.out.println(b+"*"+c+"="+b*c);
			}
			//System.out.println();
		}
	
		Scanner sc = new Scanner(System.in);
		int ramdom = (int)(Math.random()*2);
		
		
		String c;
		
	    
	    
	    
	    
	    while(true) {
	    	
	    System.out.println(ramdom);
	    System.out.println("가위 바위 보 를 입력하세요.");
	    c = sc.next();
	    System.out.println(c);
	    
		if(ramdom == 0) 
		{
	    	if(c == "가위") {
	    		System.out.println("비겼습니다.");
	    		continue;
	    	}
	    	else if(c == "보") {
	    		System.out.println("졌습니다.");
	    		break;
	    	}
	    	else if(c== "주먹") {
	    		System.out.println("이겼습니다.");
	    		break;
	    	}
	    	
	    }
	    else if(ramdom == 1) 
	    {
	    	if(c == "가위") {
	    		System.out.println("졌습니다..");
	    		break;
	    	}
	    	else if(c== "보") {
	    		System.out.println("이겼습니다.");
	    		break;
	    	}
	    	else if(c== "주먹") {
	    		System.out.println("비겼습니다.");
	    		continue;
	    	}
	    	
	    }
	    else if(ramdom == 2)
	    {
	    	if(c == "가위") {
	    		System.out.println("이겼습니다..");
	    		break;
	    	}
	    	else if(c== "보") {
	    		System.out.println("비겼습니다.");
	    		continue;
	    	}
	    	else if(c== "주먹") {
	    		System.out.println("졌습니니다.");
	    		break;
	    	}
	    	
	    	
	    	
	    	}
      continue;
	 
		
	    }
	   
		}
		}



