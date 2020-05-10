package rensyu;

import java.util.Scanner;

public class Rensyu5_3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] num = new int[10];

		System.out.println("数値を入力");
		for (int i = 0; i < num.length ; i ++) {
			num[i] = scan.nextInt();
		}
		System.out.print("偶数：");
		for (int i = 0 ; i < num.length; i ++) {
			if (num[i] % 2 == 0) {
				System.out.print(num[i] + " ");
			}
		}	System.out.println("");
		System.out.print("奇数：");
		for (int i = 0; i < num.length ; i ++) {
			if (num[i] % 2 == 1) {
				System.out.print(num[i] + " ");
			}
		}
	}
}
