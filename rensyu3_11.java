package rensyu;

import java.util.Scanner;

public class rensyu3_11{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("1-12月の数値を入力");
		int input = scan.nextInt();

		while (input < 1 || input > 12) {
			System.out.println("数値を入力し直してください");
			input = scan.nextInt();
		}

		switch(input) {
		case 1:
			System.out.println("1月：元旦、成人の日");
			break;
		case 2:
			System.out.println("2月：建国記念の日");
			break;
		case 3:
			System.out.println("3月：春分の日");
			break;
		case 4:
			System.out.println("4月：昭和の日");
			break;
		case 5:
			System.out.println("5月：憲法記念日、みどりのひ、こどもの日");
			break;
		case 6:
			System.out.println("6月：なし");
			break;
		case 7:
			System.out.println("7月：海の日");
			break;
		case 8:
			System.out.println("8月：なし");
			break;
		case 9:
			System.out.println("9月：敬老の日、春分の日");
			break;
		case 10:
			System.out.println("10月：体育の日");
			break;
		case 11:
			System.out.println("11月：文化の日、勤労感謝の日");
			break;
		case 12:
			System.out.println("12月：天皇誕生日");
			break;
		}
	}
}
