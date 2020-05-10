package rensyu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Rensyu2_3 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));

		System.out.println("数値を入力してください");
		String s = br.readLine();
		int x = Integer.parseInt(s);
		System.out.println(x);

		int num = 1;

		for (int i = 1 ; i <=3 ; i ++) {
			num = num * x;
			System.out.println(x+ "の" + i + "乗は" + num);
		}
	}
}
