package rensyu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Rensyu5_6 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int kuku[][] = new int[9][9];
		//配列 kuku に値を代入する

		for (int i = 0; i < 9; i ++) {
			kuku[i] = new int[9];
			for (int j = 0; j < 9; j ++) {
				kuku[i][j] = (i + 1) * (j + 1);
			}
		}

		for (int i = 0; i < 9; i ++) {
			for (int j = 0; j < 9; j ++) {
				System.out.printf("%2d", kuku[i][j]);
				System.out.println();
			}
		}

		System.out.println("1-9の数値を2つ入力");
		int x = Integer.parseInt(br.readLine());
		int y = Integer.parseInt(br.readLine());
		int n = kuku[x-1][y-1];

		System.out.println(x + "と" + y + "の積は" + n);
	}
}
