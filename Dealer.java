package dicegame;

import java.util.Random;
import java.util.Scanner;

public class Dealer extends Man{
	/*private int points = 0;
	private static int field = 0;
	public void setPoint(int point) {
		this.points = point;
	}
	public int getPoint() {
		//System.out.println("ディーラーのポイントは" + this.points);
		return this.points;
	}
	public void setField(int field) {
		this.field = field;
		System.out.println("フィールドのポイントは" + this.field);
	}
	public int getField(){
		//System.out.println("フィールドのポイントは" + this.field);
		return this.field;
	}*/

	public int roll() {
		System.out.println("ディーラーがダイスを振ります");
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		Random ran = new Random();
		int r = ran.nextInt(6);
		int roll = r + 1;
		System.out.println("ディーラーの出目は" + roll + "です");
		return roll;
	}
	public void jun(Player p) {
		Random ran = new Random();
		int jun = ran.nextInt(1);
		//先攻後攻メソッド
		//適宜オーバーライドして使用
		if (jun == 0) {
			System.out.println("あなたが先攻です");
			int r = p.roll();
			this.setField(r);
		} else {
			System.out.println("あなたが後攻です");
		}
	}

}
