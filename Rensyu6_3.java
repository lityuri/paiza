package rensyu2;

import java.util.Scanner;

public class Rensyu6_3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x, y, z;

		System.out.println("数値を3つ入力");
		x = scan.nextInt();
		y = scan.nextInt();
		z = scan.nextInt();

		int big = big(big(x , y), z);
		System.out.println("最も大きい数値は" + big);
	}

	public static int big(int x , int y) {
		if (x > y) {
			return x;
		} else {
			return y;
		}
	}
}
