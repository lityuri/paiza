package rensyu2;

import java.util.Scanner;

public class Rensyu7_5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = 0;
		int y = 0;
		CoinCase cc = new CoinCase();

		for (int i = 0; i < 10; i ++) {
			System.out.println("効果の種類と枚数を入力");
			x = scan.nextInt();
			y = scan.nextInt();
			cc.addCoins(x, y);
		}

		cc.getCoins(500);
		cc.getCoins(100);
		cc.getCoins(50);
		cc.getCoins(10);
		cc.getCoins(5);
		cc.getCoins(1);

		cc.getAmount(500);
		cc.getAmount(100);
		cc.getAmount(50);
		cc.getAmount(10);
		cc.getAmount(5);
		cc.getAmount(1);

		cc.getCount();
		cc.getAmount();
	}

}
