package rensyu;

import java.io.IOException;
import java.util.Scanner;

public class Rensyu4_8 {
	public static void main(String[] args) throws IOException{
		Scanner scan = new Scanner(System.in);
		int[] num = new int[10];
		int max = 0;
		int min;

		for (int i = 0 ; i < num.length ; i ++) {
			System.out.println(i + 1 + "つ目の自然数を入力してください");
			int put = scan.nextInt();
			while (!(put > 0)) {
				System.out.println("自然数ではありません。再入力してください");
				put = scan.nextInt();
			}
			num[i] = put;
		}
		min = num[1];

		for (int i = 0; i < num.length ; i ++) {
			int check = num[i];
			if (check > max) {
				max = check;
			} else if (check < min) {
				min = check;
			}
		}
		System.out.println("入力された最大値は" + max);
		System.out.println("入力された最小値は" + min);
	}
}
