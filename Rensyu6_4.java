package rensyu2;

import java.util.Scanner;

public class Rensyu6_4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("数値を入力");
		int i = scan.nextInt();
		System.out.println("文字を1文字入力");
		String s = scan.next();
		char[] c = s.toCharArray();
		tryangle(i , c[0]);
	}

	public static void tryangle(int x, char y) {
		for (int i = 0; i < x; i ++) {
			for (int j = 0; j < i + 1; j ++) {
				System.out.print(y);
			}
			System.out.println("");
		}
	}
}
