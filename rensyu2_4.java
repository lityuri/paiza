package rensyu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class rensyu2_4 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));

		System.out.println("数値xを入力してください");
		String s1 = br.readLine();
		int x = Integer.parseInt(s1);
		System.out.println("数値yを入力してください");
		String s2 = br.readLine();
		int y = Integer.parseInt(s2);

		int wa = x + y;
		int sa = x - y;
		int seki = x * y;
		int syo = x / y;
		int amari = x % y;

		System.out.println(x + "と" + y + "の和は" + wa
				+ "\n差は" + sa + "\n積は" + seki + "\n商は" + syo + "\n余りは" + amari);
	}
}
