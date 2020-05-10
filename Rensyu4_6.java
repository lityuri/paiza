package rensyu;

import java.util.Scanner;

public class Rensyu4_6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("0(負け)か1(勝ち)を入力");
		int[] seiseki = new int[10];
		int lose = 0;
		int win = 0;

		for (int i = 0 ; i < seiseki.length ; i ++) {
			int put = scan.nextInt();
			while (!(put == 0 || put == 1)) {
				System.out.println("0か1以外です。再入力してください");
				put = scan.nextInt();
			}
			seiseki[i] = put;
		}
		for (int i = 0 ; i < seiseki.length ; i ++) {
			if (seiseki[i] == 0) {
				lose ++;
			} else if (seiseki[i] == 1){
				win ++;
			}
		}
		System.out.println("勝ちは" + win + "、負けは" + lose);
	}
}
