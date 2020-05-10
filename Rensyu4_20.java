package rensyu;

import java.util.Scanner;

public class Rensyu4_20 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size = 0;

		while (size < 1) {
			System.out.println("自然数を入力");
			size = scan.nextInt();
		}

		for (int i = 0; i < size; i ++) {
			int j = 0;
			 do {
				System.out.print("$");
				j ++;
			} while (i >= j);
			System.out.println("");
		}
	}
}
