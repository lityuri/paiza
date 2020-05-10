package rensyu;

import java.util.Scanner;

public class Rensyu5_4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = 0;
		int sum = 0;
		int[] num = new int[10];

		while (sum < 100 && count < 10) {
			System.out.println(count + "番目の数値を入力");
			num[count] = scan.nextInt();
			sum += num[count];
			count ++ ;
		}
		for (int i = 0; i < count ; i ++) {
			System.out.println(num[i]);
		}
	}
}
