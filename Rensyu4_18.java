package rensyu;

import java.util.Scanner;

public class Rensyu4_18 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("0が入力されたら止め、それまでの平均を表示します");
		//System.out.println("数値を入力してください");
		int input = 0 ;
		double num = 0.0;
		int count = 0;

		do {
			System.out.println("0以外の整数を入力してください");
			input = scan.nextInt();
			num += input;
		} while(input == 0);

		do {
			System.out.println("整数を入力してください");
			input = scan.nextInt();
			num += input;
			count ++;
		} while (!(input == 0));

		double avg = num / (count);
		System.out.println("平均値は" + avg);
	}
}
