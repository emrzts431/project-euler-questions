package pEuler;

public class QuadraticPrimes {
	public static void main(String... args) {
		for(int i = 0;i<1000;i++) {
			for(int j = 0;j<=1000;j++) {
				for(int k = 0;k<=1000;k++) {
					
				}
			}
		}
	}
	public static int formula(int a,int b,int n) {
		return (n*n) +(a*n) + b;
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
