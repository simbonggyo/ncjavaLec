package homework.middle4;

public class ArrayUtility2 {

	public static int[] concat(int[] s1,int[] s2) {
		int destLength = s1.length + s2.length;
		int dest[] = new int[destLength];
		System.arraycopy(s1, 0, dest, 0, s1.length);
		System.arraycopy(s2, 0, dest, s1.length, s2.length);
		
		return dest;
	
		}
	
	public static int[] remove(int[] s1,int[] s2) {
		int destLength = s1.length + s2.length;
		int dest[] = new int[destLength];
		for(int i = 0; i<=s1.length; i++) {
			for(int j = 0; j<s2.length; j++) {
				if(s1[i]==s2[j]) {
					s1[i] = s1[i]-s2[j];
				}
				dest[i] = s1[i];
			}
		}
		
		return dest;
	
		}
	}
