package pEuler;

public class SumOfPrimes {
	public static void main(String[] args) {
		long sum = 5;
		for(int i = 5;i<=2000000;i+=2) {
			if(isPrime((double)i)) {
				sum+=i;
			}
		}
		System.out.println(sum);
	}
	public static boolean isPrime(double a) {
		int biggest =(int) Math.pow(a, 0.5);
		for(int i = biggest;i>=2;i--) {
			if(a%i == 0) {
				return false;
			}
		}
		return true;
	}
}
