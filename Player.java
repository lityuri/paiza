package dicegame;

import java.util.Random;
import java.util.Scanner;

public class Player extends Man{
	/*private int points = 0;

	public void setPoint(int point) {
		this.points = point;
	}
	public int getPoint() {
		//System.out.println("現在のポイントは" + this.points);
		return this.points;
	}*/
	public int roll() {
		System.out.println("ダイスを振ります");
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		Random ran = new Random();
		int r = ran.nextInt(6);
		int roll = r + 1;
		System.out.println("出目は" + roll + "です");
		return roll;
	}
}
