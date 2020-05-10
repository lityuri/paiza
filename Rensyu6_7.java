package rensyu2;

public class Rensyu6_7 {
	public static void main(String[] args) {
		for (int i = 10000; i < 10100; i ++) {
			if (sosu(i)) {
				System.out.println(i);
			}
		}
	}
	public static boolean sosu(int x) {
		if (x <= 3) {
			return true;
		}

		//int p;
		for (int p = 2; p <= (x / 2) ; p ++) {
			if ((x % p) == 0) {
				return false;
			}
		}
		return true;
	}
}
