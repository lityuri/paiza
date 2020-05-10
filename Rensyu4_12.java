package rensyu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Rensyu4_12 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = 0;

		while (num <= 100) {
			System.out.println("数値を入力してください");
			String s = br.readLine();
			num += Integer.parseInt(s);
		}
		System.out.println("合計は" + num);
	}

}
