package rensyu;

import java.util.Scanner;

public class Rensyu4_5{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] input = new int[10];
		double sum = 0.0;

		for (int i = 0; i < input.length ; i ++ ) {
			System.out.println(i + 1 + "回目の数値を入力");
			input[i] = scan.nextInt();
		}

		for (int i = 0; i < input.length ; i ++) {
			sum += input[i];
			//System.out.println(input[i]);
		}

		double avg = sum / input.length;
		System.out.println("数値の平均は" + avg);
	}
}
