package pEuler;


public class Pandigital {
	public static void main(String[] args) {
		int summe = 0;
		int[] array = new int[18];
		int index = 0;
		for(int i = 1;i<9999;i++) {
			for(int j = 1;j<9999;j++) {
				int m = isPandigital(i,j);
				if(m!=0) {
					array[index] = m;
					index++;
				}
			}
		}
		for(int i = 0;i<array.length;i++) {
			for(int j = 0;j<array.length;j++) {
				if(i==j)continue;
				else {
					if(array[i] == array[j])array[i] = 0;
				}
			}
			
		}
		for(int i = 0;i<array.length;i++) {
			if(array[i] != 0)System.out.println(array[i]);
			summe+=array[i];
		}
		System.out.println("Result : "+summe);
		
		
		
	}
	public static int isPandigital(int a,int b) {
		int c = a*b;
		int[] array = new int[9];
		int i = 0;
		for(int d = c;d!=0;d/=10) {
			int m = d%10;
			if(i<9)array[i] = m;
			if(i<9)i++;
			else return 0;
		}
		for(int d= a;d!=0;d/=10) {
			int m = d%10;
			if(i<9)array[i] = m;
			if(i<9)i++;
			else return 0;
		}
		for(int d = b;d!=0;d/=10) {
			int m = d%10;
			if(i<9)array[i] = m;
			if(i<9)i++;
			else return 0;
		}
		for(int r = 0;r<array.length;r++) {
			for(int h = 0;h<array.length;h++) {
				if(r == h) continue;
				else {
					if(array[r]==array[h])return 0;
					if(array[r] == 0)return 0;
				}
			}
		}
		return c;
	}
}
