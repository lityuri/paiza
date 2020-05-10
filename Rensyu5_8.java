package rensyu;

import java.util.Arrays;
import java.util.Scanner;

public class Rensyu5_8 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] num = new int[10];

		System.out.println("整数を10回入力");
		for (int i = 0; i < num.length; i ++) {
			num[i] = scan.nextInt();
		}
		Arrays.sort(num);
		for (int i : num) {
			System.out.println(i);
		}
	}
}
