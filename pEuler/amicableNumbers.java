package pEuler;

import java.util.HashMap;
import java.util.Map;

public class amicableNumbers {
	public static void main(String... args) {
		int sum = 0;
		Map<Integer,Integer> map = new HashMap<>();
		Map<Integer,Integer> Tmpmap = new HashMap<>();
		for(int i = 1;i<10000;i++) {
			if(isPrime(i))continue;
			if(i == sumOfDivisors(i))continue;
			else map.put(i,sumOfDivisors(i));
		}
		for(int key : map.keySet()) {
			if(!map.containsKey(map.get(key)))continue;
			else if(key == map.get(map.get(key))) {
				Tmpmap.put(key, map.get(key));
				sum+=key;
			}
		}
		System.out.println(Tmpmap.entrySet().toString());
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
	public static int sumOfDivisors(int a) {
		Map<Integer,Integer> map = asalCarpanlar(a);
		int result = 1;
		for(int key : map.keySet()) {
			result *= (Math.pow(key, map.get(key)+1) - 1)/(key-1);
		}
		return result - a;
	}
	public static Map<Integer,Integer> asalCarpanlar(int a) {
		Map<Integer,Integer> map = new HashMap<>();
		int number = 2;
		while(a!=1) {
			if(a % number == 0) {
				if(!map.containsKey(number)) {
					map.put(number, 1);
				}
				else {
					map.replace(number, map.get(number)+1);
				}
				a/=number;
			}
			else number++;
		}
		return map;
	}
}
