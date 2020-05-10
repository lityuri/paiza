package rensyu;

import java.util.Scanner;

public class Rensyu4_7 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int kyo = 0;
		int han = 0;

		for (int i = 1 ; i <= 9; i ++) {
			System.out.println(i + "回表、巨人の得点は？");
			int omote = scan.nextInt();
			System.out.println(omote);
			kyo += omote;
			System.out.println(i + "回裏、阪神の得点は？");
			int ura = scan.nextInt();
			System.out.println(ura);
			han += ura;
		}
		System.out.println("巨人の点数は" + kyo);
		System.out.println("阪神の点数は" + han);
		if (kyo > han) {
			System.out.println("巨人の勝ち");
		} else {
			System.out.println("阪神の勝ち");
		}
	}
}
