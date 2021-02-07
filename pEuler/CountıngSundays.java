package pEuler;

public class CountýngSundays {
	public static void main(String args[]) {
		//Ilk pazar 7 Ocak 1990
		System.out.println(ilkPazariBul());
	}
	public static int ilkPazariBul() {
		int index = 2;
		int ay = 1;
		int gun = 1;
		int yil = 1901;
		int ilk_aya_geldigi_gun_sayisi = 0;
		while(yil<2001) {
			if(otuz_birciler(ay)) {
				if(tutturanlar(index,gun)) {
					ilk_aya_geldigi_gun_sayisi++;
					System.out.println("that's a sunday -->"+gun+","+ay+","+yil+"--->"+index+"-->"+ilk_aya_geldigi_gun_sayisi);
				}
				while(gun<=31) {
					gun++;
					if(index<7)index++;
					else index = 1;
				}
				if(ay+1==13) {
					yil++;
					ay = 1;
					gun = 1;
				}
				else {
					ay++;
					gun = 1;
				}
			}
			else if(ay == 2) {
				if(subat_check(yil)) {
					if(tutturanlar(index,gun)) {
						ilk_aya_geldigi_gun_sayisi++;
						System.out.println("that's a sunday -->"+gun+","+ay+","+yil+"--->"+index+"-->"+ilk_aya_geldigi_gun_sayisi);
					}
					while(gun<=29) {
						gun++;
						if(index<7)index++;
						else index = 1;
					}
					ay++;
					gun = 1;
				}
				else {
					if(tutturanlar(index,gun)) {
						ilk_aya_geldigi_gun_sayisi++;
						System.out.println("that's a sunday -->"+gun+","+ay+","+yil+"--->"+index+"-->"+ilk_aya_geldigi_gun_sayisi);
					}
					while(gun<=28) {
						gun++;
						if(index<7) index++;
						else index = 1;
					}
					ay++;
					gun = 1;
				}
			}
			else if(!otuz_birciler(ay)){
				if(tutturanlar(index,gun)) {
					ilk_aya_geldigi_gun_sayisi++;
					System.out.println("that's a sunday -->"+gun+","+ay+","+yil+"--->"+index+"-->"+ilk_aya_geldigi_gun_sayisi);
				}
				while(gun<=30) {
					gun++;
					if(index<7)index++;
					else index = 1;
				}
				ay++;
				gun = 1;
			}
		}
		return ilk_aya_geldigi_gun_sayisi;
	}
	public static boolean otuz_birciler(int a) {
		if(a==1||a==3||a==5||a==7||a==8||a==10||a==12) {
			return true;
		}
		else {
			return false;
		}
	}
	public static boolean subat_check(int yil) {
		if(yil%100!=0) {
			if(yil%4 == 0) {
				return true;
			}
			else return false;
		}
		else {
			if(yil%400==0)return true;
			else return false;
		}
	}
	public static boolean tutturanlar(int index,int gun) {
		if(index==7&&gun==1) {
			return true;
		}
		return false;
	}
	
	
}
