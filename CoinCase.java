package rensyu2;

public class CoinCase {
	//HashMap<Integer , Integer> case = new HashMap<Integer , Integer >();

	private int y500 = 0;
	private int y100 = 0;
	private int y50 = 0;
	private int y10 = 0;
	private int y5 = 0;
	private int y1 = 0;
	private int total = 0;

	public void addCoins(int x, int y) {
		if (x == 500) {
			y500 += y;
		} else if (x == 100) {
			y100 += y;
		} else if (x == 50) {
			y50 += y;
		} else if (x == 10) {
			y10 += y;
		} else if (x == 5) {
			y5 += y;
		} else if (x == 1) {
			y1 += y;
		}
	}
	public int getCoins(int x) {
		if (x == 500) {
			System.out.println("500円硬貨：" + y500);
			return y500;
		} else if (x == 100){
			System.out.println("100円硬貨：" + y100);
			return y100;
		} else if (x == 50) {
			System.out.println("50円硬貨：" + y50);
			return y50;
		} else if (x == 10) {
			System.out.println("10円硬貨：" + y10);
			return y10;
		} else if (x == 5) {
			System.out.println("5円硬貨：" + y5);
			return y5;
		} else if (x == 1) {
			System.out.println("1円硬貨：" + y1);
			return y1;
		} else {
			return 0;
		}
	}
	public int getAmount(int x) {
		int money = 0;
		if (x == 500) {
			money = 500 * y500;
			System.out.println("500円硬貨総額：" + money);
		} else if (x == 100) {
			money = 100 * y100;
			System.out.println("100円硬貨総額：" + money);
		} else if (x == 50) {
			money = 50 * y50;
			System.out.println("50円硬貨総額：" + money);
		} else if (x == 10) {
			money = 10 * y10;
			System.out.println("10円硬貨総額：" + money);
		} else if (x == 5) {
			money = 5 * y5;
			System.out.println("5円硬貨総額：" + money);
		} else if (x == 1) {
			money = y1;
			System.out.println("1円硬貨総額：" + money);
		}
		return money;
	}
	public int getAmount() {
		total = y500 * 500 + y100 * 100 + y50 * 50 + y10 *10 + y5 * 5 + y1;
		System.out.println("合計金額：" + total);
		return total;
	}
	public int getCount() {
		int count = y500 + y100 + y50 + y10 + y5 + y1;
		System.out.println("硬貨の総枚数：" + count);
		return count;
	}
	public int getCount(int kind) {
		switch(kind){
		case 500:
			return y500;
		case 100:
			return y100;
		case 50:
			return y50;
		case 10:
			return y10;
		case 5:
			return y5;
		case 1:
			return y1;
		}
		return 0;
	}
}
