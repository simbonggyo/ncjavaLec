package homework.advance0322;

public class unicodeconver {

	int num = 1;
	int num2 = 0;
	String[] strarr = new String[num];
	char[] chararr = new char[num2];
	String uni = "";
	void unicode(String arr[],int index) {
		
		num = index;
		//배열에서 받은 문자열의 배열 과 받은 index 값만큼 strarr[]의 크기가 늘어나고
		for(int i =0; i<=arr.length;i++)
		{
			for(int j = 0; i<arr[i].length(); j++)
			{
				num2 = arr[i].length();
				arr[i].charAt(j);
				
				if(arr[i].charAt(j+1) > arr[i].charAt(j)) {
					chararr[i] = arr[i].charAt(j+1);
				}
				else
				chararr[i] = arr[i].charAt(j);			
				uni = chararr[i] +uni;
			}
			
			strarr[i] = uni;
			System.out.println(strarr[i]);
		}
	}
}
