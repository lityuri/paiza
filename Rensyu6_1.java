package rensyu2;

import java.util.Scanner;

public class Rensyu6_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("数値を入力");
		int num = scan.nextInt();
		int n = keisan(num);
		System.out.println(num + "の2乗は" + n);
	}

	public static int keisan(int i) {
		int x = i * i;
		return x;
	}
}
