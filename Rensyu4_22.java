package rensyu;

public class Rensyu4_22 {
	public static void main(String[] args) {
		System.out.println("フィナボッチ数列を表示します");
		int n1 = 0;
		int n2 = 1;
		int n3 = n1 + n2;

		while (n1 < 1000) {
			System.out.println(n1);

			n1 = n2;
			n2 = n3;
			n3 = n1 + n2;
		}
	}
}
