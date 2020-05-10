package rensyu;

import java.util.Scanner;

public class Rensyu4_21 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("自然数を入力");
		int size = scan.nextInt();

		for (int i = 0; i < size ; i ++) {
			for (int j = 0; j < size ; j ++) {
				if (i == j || j == size -i -1) {
					System.out.print("Ｘ");
				} else {
					System.out.print("　");
				}
			} System.out.println("");
		}
	}

}
