package rensyu2;

import java.util.Scanner;

public class Rensyu6_2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("整数を2つ入力");
		int x = scan.nextInt();
		int y = scan.nextInt();

		double avg = avg(x, y);
		System.out.println(x + "と" + y +"の平均は" + avg);
	}

	public static double avg(int x, int y) {
		double avg = (x + y) / 2.0;
		return avg;
	}
}
