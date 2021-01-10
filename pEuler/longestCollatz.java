package pEuler;

public class longestCollatz {
	public static void main(String[] args) {
		int longest_chain = 10;
		long biggest_n = 13;
		for(long i = 14;i<1000000;i++) {
			int current_chain = chain(i);
			if(current_chain>longest_chain) {
				longest_chain = current_chain;
				biggest_n = i;
			}
		}
		System.out.println(biggest_n);
		System.out.println(longest_chain);
		
	}
	public static int chain(long number) {
		int chain = 0;
		while(number!=1) {
			if(number%2 == 0) {
				number/=2;
				chain++;
			}
			else {
				number= number *3 +1;
				chain++;
			}
		}
		return chain + 1;
	}
}

